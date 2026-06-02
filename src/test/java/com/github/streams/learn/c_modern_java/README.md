# 🎮 Stream Quest — Modern Java Learning Track

> A gamified, step-by-step path through **modern Java (8 → 25)** using one tiny RPG dataset.
> Clear a level, earn XP, unlock the next feature. 🏆

You play through a small adventuring **party of heroes** and a **session log of game events**
(fixtures live in [`practice/modern_java/quest`](../../practice/modern_java/quest)). Every level maps
to one real language or API feature and one runnable challenge.

---

## 🗺️ The Quest Map

| Lvl | Badge | Feature | Since | Challenge | XP |
|----:|:-----:|---------|:-----:|-----------|---:|
| 1 | 🧱 | **Records** as stream elements | 16 | `Level1_RecordsChallenge` | 10 |
| 2 | ⚔️ | **Pattern matching for `switch`** over a `sealed` type | 21 | `Level2_PatternMatchingSwitchChallenge` | 20 |
| 3 | 💰 | **Record patterns** (destructuring) | 21 | `Level3_RecordPatternsChallenge` | 30 |
| 4 | 🔄 | **Sequenced Collections** (`reversed`/`getFirst`/`getLast`) | 21 | `Level4_SequencedCollectionsChallenge` | 30 |
| 5 | 🎯 | **`teeing`** collector | 12 | `Level5_TeeingChallenge` | 40 |
| 6 | 📖 | **`Stream::mapMulti`** | 16 | `Level6_MapMultiChallenge` | 40 |
| 7 | 🧮 | **`groupingBy` + `counting`** | 8 | `Level7_GroupingChallenge` | 30 |
| 8 | 👑 | **`Optional`** as a safe reduction result | 8 | `Level8_OptionalChallenge` | 30 |
| 9 | 🧾 | **Text blocks** + `String::formatted` | 15 | `Level9_TextBlocksChallenge` | 40 |
| 10 | 🐉 | **Stream Gatherers** (`scan`) — BOSS | 24/25 | `Level10_GatherersChallenge` | 60 |
| 11 | ⚖️ | **`partitioningBy`** (veterans vs rookies) | 8 | `Level11_PartitioningChallenge` | 30 |

**Total: 360 XP** · Clear all eleven to earn the 🥇 *Modern Stream Sage* badge.

---

## ▶️ How to play

1. Open a `LevelN_*Challenge` test in [`practice/modern_java`](../../practice/modern_java).
2. Delete the `@Disabled` annotation.
3. Replace `yourSolution` with your own stream pipeline.
4. Run the test. Green = level cleared. ✅
5. Stuck? The matching method in
   [`ModernJavaSolutions`](../../practice/modern_java/ModernJavaSolutions.java) is the answer key —
   peek only after a real attempt.

> ⚠️ Levels 1–9 run on **JDK 21+**. The Level 10 boss needs **JDK 25** and is gated with
> `@EnabledOnJre(JRE.JAVA_25)`.

---

## 📚 Modern Java cheat-sheet (8 → 25)

A quick map of the features worth knowing, by the version that shipped or finalized them:

- **Java 8** — lambdas, `Stream`, `Optional`, `Collectors`, default methods, `java.time`.
- **Java 9** — `Stream.takeWhile`/`dropWhile`/`iterate(seed, pred, next)`, `List.of`/`Map.of`.
- **Java 10/11** — `var` for locals, `Collectors.toUnmodifiableList`, `String.strip`/`lines`/`repeat`.
- **Java 12** — `Collectors.teeing`.
- **Java 14** — helpful `switch` expressions (`->`, `yield`).
- **Java 15/16** — text blocks, `String::formatted`, **records**, `Stream.toList`, `mapMulti`,
  pattern matching for `instanceof`.
- **Java 17** — **sealed** classes/interfaces.
- **Java 21** — **pattern matching for `switch`**, **record patterns**, **Sequenced Collections**,
  virtual threads.
- **Java 24/25** — **Stream Gatherers** (`scan`, `fold`, `windowFixed`, `windowSliding`,
  `mapConcurrent`), scoped values.

Each line above either has a level in this track or an exercise under
[`practice/gatherers`](../../practice/gatherers) and [`learn/a_basics`](../a_basics).
