For **finding the maximum element in an array**, both approaches have **O(n)** time complexity, but their usage differs between interviews and production code.

### 1. Traditional Loop

```java
int max = arr[0];

for (int i = 1; i < arr.length; i++) {
    if (arr[i] > max) {
        max = arr[i];
    }
}
```

#### Interview Perspective

✅ Preferred

Reasons:

* Demonstrates understanding of array traversal.
* Shows you know the underlying algorithm.
* Easy to modify for related questions (second largest, min-max together, count occurrences, etc.).
* Interviewers often want to see problem-solving rather than API knowledge.

---

### 2. Built-in Stream API

```java
int max = Arrays.stream(arr)
                .max()
                .getAsInt();
```

#### Interview Perspective

⚠️ Usually avoid unless interviewer explicitly allows library methods.

Reason:

* Hides the actual logic.
* Interviewer may ask: "How does `max()` work internally?"
* Doesn't demonstrate algorithmic thinking.

A safer interview answer:

```java
// Using Stream API
int max = Arrays.stream(arr).max().orElseThrow();

// But if implementing manually:
...
```

---

### Production Software Perspective

#### Stream API

```java
int max = Arrays.stream(arr).max().orElseThrow();
```

✅ Good when:

* Code readability is more important.
* Team frequently uses Streams.
* Performance is not a bottleneck.

Pros:

* Concise.
* Expressive.
* Less boilerplate.

---

#### Traditional Loop

```java
int max = arr[0];
for (int x : arr) {
    if (x > max) max = x;
}
```

✅ Good when:

* Performance-critical code.
* Large arrays processed frequently.
* Low-GC/high-throughput systems.

Pros:

* Slightly faster.
* No stream setup overhead.
* Easier for JVM to optimize aggressively.

---

### Performance

For large arrays:

| Method     | Time Complexity | Extra Space | Relative Speed  |
| ---------- | --------------- | ----------- | --------------- |
| Loop       | O(n)            | O(1)        | Fastest         |
| Stream API | O(n)            | O(1)        | Slightly slower |

The difference is usually tiny (microseconds to milliseconds depending on size), so for most business applications it doesn't matter.

---

### Recommendation

**Interview:**

```java
for (...) { ... }
```

Use the manual loop unless specifically discussing Java Streams.

**Production:**

```java
Arrays.stream(arr).max().orElseThrow();
```

Use Stream API when readability is improved and this isn't a performance hotspot.

**Senior-level rule:** Prefer the clearest code first; optimize to loops only when profiling shows that section is actually performance-sensitive.
