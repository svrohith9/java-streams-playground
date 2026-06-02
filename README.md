<div align="center">

# 🎮 Java Streams Playground

### Learn the **Java Stream API** and **Modern Java (8 → 25)** by clearing gamified, test-driven challenges.

*Records · Sealed Types · Pattern Matching · Record Patterns · Sequenced Collections · Gatherers · Virtual Threads*

[![Java CI](https://github.com/svrohith9/java-streams-playground/actions/workflows/maven.yml/badge.svg)](https://github.com/svrohith9/java-streams-playground/actions/workflows/maven.yml)
[![License: Apache 2.0](https://img.shields.io/badge/License-Apache_2.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![Java](https://img.shields.io/badge/Java-21%20%7C%2025-orange?logo=openjdk&logoColor=white)](https://openjdk.org/)
[![Build](https://img.shields.io/badge/Build-Maven-C71A36?logo=apachemaven&logoColor=white)](https://maven.apache.org/)
[![Tests](https://img.shields.io/badge/Tests-JUnit_5-25A162?logo=junit5&logoColor=white)](https://junit.org/junit5/)
[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg)](#-contributing)

[![GitHub stars](https://img.shields.io/github/stars/svrohith9/java-streams-playground?style=social)](https://github.com/svrohith9/java-streams-playground/stargazers)
[![GitHub forks](https://img.shields.io/github/forks/svrohith9/java-streams-playground?style=social)](https://github.com/svrohith9/java-streams-playground/network/members)

**If this helps you learn, please ⭐ star the repo — it helps others find it too!**

</div>

---

## ✨ Why this repo?

Most stream tutorials are walls of text. This one is a **playground**: every concept comes with a
small, runnable JUnit test you actually solve. You start from the basics and level up all the way to
the newest Java features — **records, sealed types, pattern matching, record patterns, sequenced
collections, and Stream Gatherers**.

- 🧩 **Test-driven** — each exercise is a `@Disabled` JUnit test. Enable it, solve it, run it green.
- 🎮 **Gamified** — a "Stream Quest" learning track with levels, XP and badges.
- 🆕 **Modern** — covers Java 8 through **Java 25**, including the brand-new Gatherers API.
- 📈 **Progressive** — Easy → Medium → Hard, plus a guided beginner's section.
- 🔑 **Answer keys included** — every problem has a reference solution to compare against.

---

## 📑 Table of Contents

1. [Quick Start](#-quick-start)
2. [How It Works](#-how-it-works)
3. [Learning Paths](#-learning-paths)
4. [🎮 Stream Quest — Modern Java Track](#-stream-quest--modern-java-track)
5. [Modern Java Feature Coverage](#-modern-java-feature-coverage)
6. [Project Structure](#-project-structure)
7. [Contributing](#-contributing)
8. [License & Credits](#-license--credits)

---

## 🚀 Quick Start

> **Prerequisites:** JDK 21+ for most exercises. The Stream Gatherers exercises require **JDK 25**
> (they are gated with `@EnabledOnJre(JRE.JAVA_25)`, so everything else still builds on JDK 21).

```bash
# 1. Clone
git clone https://github.com/svrohith9/java-streams-playground.git
cd java-streams-playground

# 2. Pick a challenge, e.g. an easy one
#    src/test/java/com/github/streams/practice/a_easy_problems/numbers/A_CountEvenNumbers.java

# 3. Remove @Disabled, write your solution in `yourSolution`, then run:
mvn test
```

That's it — green test = challenge cleared. ✅

---

## 🧭 How It Works

Every exercise follows the same friendly shape:

```java
@Test
@Disabled                         // ← (1) delete this to activate the challenge
void countEvenNumbers() {
  final var input = List.of(1, 2, 3, 4, 5, 6, 7);

  final var mySolution = EasyNumbersProblemSolution.countNumberOfEvenNumbers(input); // reference answer
  final var yourSolution = -1L;   // ← (2) replace with your own stream pipeline

  Assertions.assertEquals(mySolution, yourSolution); // ← (3) run the test to check
}
```

1. **Remove `@Disabled`.**
2. **Write your pipeline** in `yourSolution`.
3. **Run the test.** It compares against the reference `mySolution` answer key.

---

## 🗂️ Learning Paths

| Path | What you'll practice | Location |
|------|----------------------|----------|
| 📘 **Beginner's Guide** | `filter`, `map`, `flatMap`, `reduce`, `collect`, and every core operation, explained | [`learn/a_basics`](src/test/java/com/github/streams/learn/a_basics) |
| 🟢 **Easy** | Numbers & strings warm-ups | [`practice/a_easy_problems`](src/test/java/com/github/streams/practice/a_easy_problems) |
| 🟡 **Medium** | Grouping, partitioning, employee/department analytics | [`practice/b_medium_problems`](src/test/java/com/github/streams/practice/b_medium_problems) |
| 🔴 **Hard** | Prime streams, longest consecutive sequence, and more | [`practice/c_hard_problems`](src/test/java/com/github/streams/practice/c_hard_problems) |
| 🧠 **Functional Interfaces** | `Predicate`, `Function`, `Supplier`, `Comparator`, … | [`practice/functional_interfaces`](src/test/java/com/github/streams/practice/functional_interfaces) |
| ⚡ **Gatherers (JDK 25)** | `scan`, `fold`, `windowFixed`, `windowSliding` | [`practice/gatherers`](src/test/java/com/github/streams/practice/gatherers) |
| 🎮 **Stream Quest** | Modern Java, gamified (see below) | [`learn/c_modern_java`](src/test/java/com/github/streams/learn/c_modern_java) |

---

## 🎮 Stream Quest — Modern Java Track

A gamified, step-by-step path through modern Java using one tiny RPG dataset (a party of heroes and
a log of game events). Clear a level, earn XP, unlock the next feature. **Full map:**
[`learn/c_modern_java`](src/test/java/com/github/streams/learn/c_modern_java/README.md).

| Lvl | Feature | Since | XP |
|----:|---------|:-----:|---:|
| 1 🧱 | **Records** as stream elements | 16 | 10 |
| 2 ⚔️ | **Pattern matching for `switch`** over a `sealed` type | 21 | 20 |
| 3 💰 | **Record patterns** (destructuring) | 21 | 30 |
| 4 🔄 | **Sequenced Collections** (`reversed`/`getFirst`/`getLast`) | 21 | 30 |
| 5 🎯 | **`teeing`** collector | 12 | 40 |
| 6 📖 | **`Stream::mapMulti`** | 16 | 40 |
| 7 🧮 | **`groupingBy` + `counting`** | 8 | 30 |
| 8 👑 | **`Optional`** as a safe reduction | 8 | 30 |
| 9 🧾 | **Text blocks** + `String::formatted` | 15 | 40 |
| 10 🐉 | **Stream Gatherers** (`scan`) — BOSS | 24/25 | 60 |
| 11 ⚖️ | **`partitioningBy`** (veterans vs rookies) | 8 | 30 |

**Clear all eleven → 360 XP → 🥇 _Modern Stream Sage_ badge.** Challenges live in
[`practice/modern_java`](src/test/java/com/github/streams/practice/modern_java); answer keys are in
[`ModernJavaSolutions`](src/test/java/com/github/streams/practice/modern_java/ModernJavaSolutions.java).

---

## 🆕 Modern Java Feature Coverage

| Version | Feature | Where to practice |
|:-------:|---------|-------------------|
| 8  | Streams, `Optional`, `Collectors`, lambdas | `learn/a_basics`, all of `practice` |
| 9  | `takeWhile` / `dropWhile` / `iterate(seed, pred, next)` | `learn/a_basics/intermediate_operations` |
| 12 | `Collectors.teeing` | Stream Quest · Level 5 |
| 15 | Text blocks, `String::formatted` | Stream Quest · Level 9 |
| 16 | **Records**, `Stream.toList`, `mapMulti` | Stream Quest · Levels 1 & 6 |
| 17 | **Sealed** classes/interfaces | Stream Quest · Level 2 (`GameEvent`) |
| 21 | **Pattern matching `switch`**, **record patterns**, **Sequenced Collections** | Stream Quest · Levels 2–4 |
| 24/25 | **Stream Gatherers** (`scan`, `fold`, `windowFixed`, `windowSliding`, `mapConcurrent`) | `practice/gatherers`, Stream Quest · Level 10 |

---

## 📁 Project Structure

```
src/test/java/com/github/streams/
├── learn/                     # Read-first explanations
│   ├── a_basics/              #   intermediate & terminal operations (markdown)
│   ├── b_advanced/gatherers/  #   what/why/when + inbuilt gatherers
│   └── c_modern_java/         #   🎮 Stream Quest map (modern Java)
└── practice/                  # Solve-it-yourself challenges
    ├── a_easy_problems/
    ├── b_medium_problems/
    ├── c_hard_problems/
    ├── functional_interfaces/
    ├── gatherers/             #   scan, fold, windowFixed, windowSliding (JDK 25)
    └── modern_java/           #   🎮 Stream Quest challenges + quest/ game model
```

---

## 🤝 Contributing

Contributions are very welcome — new problems, better explanations, more modern-Java levels!
Beginners especially: this is a great place to make your first open-source PR. 🌱

- 📖 Read the [**Contributing Guide**](.github/CONTRIBUTING.md) for setup and the exercise pattern.
- 🤝 Be kind — we follow a [**Code of Conduct**](.github/CODE_OF_CONDUCT.md).
- 🧩 Have an idea or found a bug? [**Open an issue**](https://github.com/svrohith9/java-streams-playground/issues/new/choose).
- 🔒 Security concern? See our [**Security Policy**](SECURITY.md).

The short version: fork → branch → add a `@Disabled` test + reference solution → keep Java 25-only
code gated with `@EnabledOnJre(JRE.JAVA_25)` → make sure `mvn test` is green → open a PR. 🚀

---

## 📜 License & Credits

Released under the [Apache License 2.0](LICENSE) — see the [NOTICE](NOTICE) for attribution details.

Built on the excellent original
[Streams-API-Practices](https://github.com/ZahidFKhan/Streams-API-Practices) by **ZahidFKhan**, and
extended here with an original records-based dataset, a gamified **Modern Java (Stream Quest)**
learning track, and Java 25 Gatherers coverage.

<div align="center">

### ⭐ Found this useful? Star the repo and share it with someone learning Java Streams!

`#java` · `#streams` · `#functional-programming` · `#modern-java` · `#java25` · `#learn-to-code`

</div>
