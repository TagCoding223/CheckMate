Both approaches refer to **how a class is referenced in Java**.

### 1. Fully Qualified Class Name (FQCN)

```java
java.util.Scanner sc = new java.util.Scanner(System.in);
```

This is called using the **Fully Qualified Class Name (FQCN)**.

* Includes the complete package path (`java.util`).
* No `import` statement is needed.
* Useful when two classes have the same name but belong to different packages.

Example:

```java
java.util.Date utilDate = new java.util.Date();
java.sql.Date sqlDate = new java.sql.Date(System.currentTimeMillis());
```

---

### 2. Import Statement

```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
```

This is called using an **import declaration** (or simply **importing the class**).

* The compiler resolves `Scanner` to `java.util.Scanner`.
* Makes code shorter and more readable.
* Most commonly used in real-world Java projects.

---

### Interview Answer

| Approach                                                                | Name                                              |
| ----------------------------------------------------------------------- | ------------------------------------------------- |
| `java.util.Scanner sc = new java.util.Scanner(System.in);`              | **Fully Qualified Class Name (FQCN)**             |
| `import java.util.Scanner;` then `Scanner sc = new Scanner(System.in);` | **Import Declaration / Imported Class Reference** |

In production code, the **import approach** is preferred for readability, while **FQCN** is mainly used to resolve naming conflicts or in quick examples.
