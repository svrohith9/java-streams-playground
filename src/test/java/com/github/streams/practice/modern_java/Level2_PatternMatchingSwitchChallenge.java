package com.github.streams.practice.modern_java;

import com.github.streams.practice.modern_java.quest.GameEvent.MonsterSlain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * 🎮 STREAM QUEST · LEVEL 2 — "Battle Report" · ⭐ 20 XP
 *
 * <p><b>Modern Java feature:</b> pattern matching for {@code switch} (Java 21) over a {@code sealed}
 * interface — exhaustive, so no {@code default} branch is needed.
 *
 * <pre>
 *   describeEvent(new MonsterSlain("Goblin", 150))
 *     → "Slew a Goblin (+150 XP)"
 * </pre>
 *
 * <p><b>Hint:</b> {@code switch (event) { case MonsterSlain m -> ...; ... }}. Try deleting one arm
 * and watch the compiler refuse to build — that is the sealed type protecting you.
 */
class Level2_PatternMatchingSwitchChallenge {

  @Test
  @Disabled
  void describeAMonsterSlain() {
    final var event = new MonsterSlain("Goblin", 150);

    final var mySolution = ModernJavaSolutions.describeEvent(event);
    final var yourSolution = "";

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
