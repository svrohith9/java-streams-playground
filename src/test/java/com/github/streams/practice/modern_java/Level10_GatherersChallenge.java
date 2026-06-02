package com.github.streams.practice.modern_java;

import java.util.List;
import java.util.stream.Gatherers;
import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

/**
 * 🎮 STREAM QUEST · LEVEL 10 (BOSS) — "Running Total" · ⭐ 60 XP
 *
 * <p><b>Modern Java feature:</b> Stream Gatherers (Java 24+, finalized in 25) — custom and built-in
 * intermediate operations. Here {@code Gatherers.scan} carries state forward, emitting the
 * cumulative XP after each monster.
 *
 * <p><b>Quest:</b> Given the XP earned from a chain of battles {@code [150, 600, 1100]}, produce the
 * running cumulative total {@code [150, 750, 1850]}.
 *
 * <p>Requires JDK 25, so it is gated with {@code @EnabledOnJre(JRE.JAVA_25)} just like the other
 * gatherer exercises in this repository.
 */
class Level10_GatherersChallenge {

  @Test
  @Disabled
  @EnabledOnJre(JRE.JAVA_25)
  void runningXpTotal() {
    final List<Integer> battleXp = List.of(150, 600, 1100);

    final var mySolution =
        battleXp.stream().gather(Gatherers.scan(() -> 0, Integer::sum)).toList();
    final List<Integer> yourSolution = Stream.<Integer>of().toList();

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
