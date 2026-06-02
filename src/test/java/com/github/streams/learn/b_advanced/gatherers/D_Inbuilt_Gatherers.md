## Inbuilt Gatherers

The `java.util.stream.Gatherers` factory ships five ready-made gatherers (Java 24+, finalized in
Java 25). Each one is an intermediate operation you plug in with `stream().gather(...)`.

| # | Gatherer | Shape | What it does |
|---|----------------|--------------|--------------------------------------------------------------|
| 1 | `scan`         | 1 → 1        | Emits the running accumulation after each element. |
| 2 | `fold`         | many → 1     | Carries an accumulator across the whole stream, emits one final result. |
| 3 | `windowFixed`  | N → 1 list   | Splits the stream into non-overlapping, fixed-size windows (batching). |
| 4 | `windowSliding`| N → 1 list   | Produces overlapping fixed-size windows that shift by one element. |
| 5 | `mapConcurrent`| 1 → 1        | Maps elements using a bounded number of virtual threads, preserving order. |

### Quick reference

```java
// scan — running totals
Stream.of(1, 2, 3, 4).gather(Gatherers.scan(() -> 0, Integer::sum)).toList();
// → [1, 3, 6, 10]

// fold — single combined result
Stream.of(1, 2, 3, 4).gather(Gatherers.fold(() -> "", (acc, n) -> acc + n)).toList();
// → ["1234"]

// windowFixed — non-overlapping batches of 2
Stream.of(1, 2, 3, 4).gather(Gatherers.windowFixed(2)).toList();
// → [[1, 2], [3, 4]]

// windowSliding — overlapping windows of 3
Stream.of(1, 2, 3, 4, 5).gather(Gatherers.windowSliding(3)).toList();
// → [[1, 2, 3], [2, 3, 4], [3, 4, 5]]

// mapConcurrent — up to 4 virtual threads, order preserved
Stream.of(1, 2, 3, 4).gather(Gatherers.mapConcurrent(4, n -> n * n)).toList();
// → [1, 4, 9, 16]
```

See the runnable exercises under
[`practice/gatherers`](../../../practice/gatherers) — one test per gatherer, gated with
`@EnabledOnJre(JRE.JAVA_25)`.
