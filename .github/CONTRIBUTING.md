# Contributing to Java Streams Playground 🎮

First off — thank you! This repo grows every time someone adds a fresh exercise or sharpens an
explanation. Whether you are fixing a typo or designing a whole new Stream Quest level, you are very
welcome here.

## 🧭 Ways to contribute

- 🐛 **Fix a bug** — a wrong expected value, a typo, a broken link.
- 🧩 **Add a practice problem** — easy, medium, or hard.
- 🎮 **Add a Stream Quest level** — showcase a modern Java feature with a gamified challenge.
- 📘 **Improve a lesson** — clearer wording, a better example, a new diagram.
- ⚡ **Cover a new Java feature** — scoped values, structured concurrency, the next gatherer…

## 🛠️ Local setup

```bash
git clone https://github.com/svrohith9/java-streams-playground.git
cd java-streams-playground
mvn test          # JDK 21+ builds everything except the JDK 25-only gatherer tests
```

- **JDK 21 (LTS)** builds and runs everything except the Stream Gatherers tests, which are excluded
  automatically below JDK 25.
- **JDK 25** additionally compiles and runs the gatherer exercises (gated with
  `@EnabledOnJre(JRE.JAVA_25)`).

CI runs the build on both JDK 21 and JDK 25 — please make sure `mvn test` is green locally first.

## ✍️ Adding a new practice problem

Every exercise is a self-checking JUnit test plus a reference answer:

1. Create `X_YourProblemName.java` in the right tier/topic package (follow the `A_`, `B_`, … prefix
   ordering already in use).
2. Write a Javadoc that states the problem, an example input, and the expected output.
3. Call a reference method (`mySolution`) and compare it against a placeholder `yourSolution`.
4. Add the reference implementation to the matching `*ProblemSolution` class.
5. Mark the test `@Disabled` so learners enable it when they are ready to solve it.

```java
@Test
@Disabled
void myChallenge() {
  final var input = List.of(1, 2, 3, 4);

  final var mySolution = SomeSolution.myReferenceMethod(input);
  final var yourSolution = -1; // learner fills this in

  Assertions.assertEquals(mySolution, yourSolution);
}
```

For a **Stream Quest level**, follow the `LevelN_*Challenge` pattern in `practice/modern_java`, add a
reference method to `ModernJavaSolutions`, and update the quest maps in the READMEs (level row + XP
total).

## 🎨 Code style

- Java 21 language level; prefer modern idioms (`var`, `record`, `switch` patterns,
  `Stream.toList()`).
- Keep gatherer / JDK 25-only code gated with `@EnabledOnJre(JRE.JAVA_25)` and inside a package the
  build excludes below JDK 25.
- Match the formatting of the surrounding files (2-space indentation in tests).

## 🔀 Pull requests

1. Fork and branch off `main`.
2. Keep each PR focused on one thing.
3. Make sure CI is green.
4. Fill in the PR template so reviewers know what learners gain.

By contributing, you agree that your work is licensed under the project's
[Apache License 2.0](../LICENSE). Please also follow our
[Code of Conduct](CODE_OF_CONDUCT.md).
