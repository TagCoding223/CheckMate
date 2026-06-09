When you don't close a resource such as `Scanner`, `FileInputStream`, `BufferedReader`, `Socket`, or a database connection, the resource remains allocated by the JVM and/or operating system longer than necessary.

### Example

```java
Scanner sc = new Scanner(System.in);

// use scanner

// sc.close();   // omitted
```

---

## What can happen if you don't close it?

### 1. Resource Leak

Resources consume memory and OS handles.

Examples:

* Open files consume file descriptors.
* Database connections occupy connection pool slots.
* Network sockets consume OS resources.

If many resources are left open:

```java
for (int i = 0; i < 100000; i++) {
    Scanner sc = new Scanner(new File("data.txt"));
}
```

you may eventually get errors such as:

```text
Too many open files
```

---

### 2. Memory is Not the Main Problem

Many beginners think:

> "Garbage Collector will clean it."

GC cleans **Java objects**, but it does not immediately release underlying OS resources.

Example:

```java
FileInputStream fis = new FileInputStream("file.txt");
fis = null;
```

The object may become eligible for GC, but the file handle may remain open until GC runs.

This is why relying on GC is unsafe.

---

### 3. Data May Not Be Written Completely

For output resources:

```java
FileWriter writer = new FileWriter("output.txt");
writer.write("Hello");
```

If not closed:

```java
writer.close();
```

some buffered data may never reach the file.

---

### 4. Database and Network Problems

Not closing:

```java
Connection conn = DriverManager.getConnection(...);
```

can exhaust connection pools.

After enough leaks:

```text
Cannot obtain connection
Connection pool exhausted
```

---

## Why is Scanner special?

For:

```java
Scanner sc = new Scanner(System.in);
```

the leak is usually small because there is only one console input stream.

However, IDEs and static analysis tools still warn because:

* `Scanner` implements `AutoCloseable`.
* Good practice is to close resources you open.

---

## Why do many examples NOT close Scanner(System.in)?

Consider:

```java
Scanner sc = new Scanner(System.in);
sc.close();
```

Closing the scanner also closes:

```java
System.in
```

After that:

```java
Scanner sc2 = new Scanner(System.in);
```

may fail because the standard input stream is already closed.

Therefore in small console programs many developers intentionally leave `Scanner(System.in)` open.

---

## Modern Recommended Approach: try-with-resources

```java
try (Scanner sc = new Scanner(new File("data.txt"))) {
    System.out.println(sc.nextLine());
}
```

Java automatically calls:

```java
sc.close();
```

even if an exception occurs.

---

## Interview Answer (Short)

Not closing resources can cause **resource leaks**, such as unreleased file handles, database connections, sockets, and buffers. Garbage Collection does not guarantee timely release of these OS-level resources. Therefore Java recommends closing resources explicitly, preferably using **try-with-resources**, which automatically closes them even when exceptions occur. For `Scanner(System.in)`, closing it also closes `System.in`, so many simple console programs intentionally leave it open.

---

**Failure to close Java resources like `Scanner` objects typically results in resource leaks**, specifically memory leaks or file descriptor exhaustion, which can degrade application performance or cause crashes in long-running processes.

**Why it is recommended to close resources:**
*   **Memory Management**: Closing a `Scanner` allows the Java garbage collector to reclaim the memory and system resources (such as buffers and file handles) allocated to it. If left open, these resources may not be disposed of properly, leading to a memory leak.
*   **File Descriptor Availability**: When reading from files, failing to close the scanner prevents the underlying file descriptor from being released. In scenarios involving many files (e.g., loops), this can exhaust the available file descriptors, causing the program to crash.
*   **Resource Locking**: Open resources may remain locked, preventing other processes or subsequent operations from accessing the underlying data or stream.

**Exception for `System.in`:**
While it is best practice to close resources, **`Scanner` objects wrapping `System.in` should generally not be closed**. Closing such a scanner also closes the underlying `System.in` stream, which is managed by the JVM. This prevents any further input reading for the entire application and cannot be reopened within the same execution. For file-based scanners, use **try-with-resources** to ensure automatic closure:

```java
try (Scanner scanner = new Scanner(new File("input.txt"))) {
    // process file
} // scanner is automatically closed here
```