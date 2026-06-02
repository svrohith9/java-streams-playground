package com.github.streams.practice.modern_java;

import com.github.streams.practice.modern_java.quest.QuestData;
import com.github.streams.practice.modern_java.quest.XpReport;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * 🎮 STREAM QUEST · LEVEL 5 — "One Pass, Two Numbers" · ⭐ 40 XP
 *
 * <p><b>Modern Java feature:</b> the {@code teeing} collector (Java 12) — feed the stream into two
 * downstream collectors at once and merge their results.
 *
 * <p><b>Quest:</b> Produce an {@link XpReport} with the party's total XP, head-count and average,
 * all in a single stream pass.
 *
 * <pre>
 *   total = 24150, count = 6, average = 4025.0
 * </pre>
 *
 * <p><b>Hint:</b> {@code Collectors.teeing(summingLong(Hero::xp), counting(), (sum, n) -> ...)}.
 */
class Level5_TeeingChallenge {

  @Test
  @Disabled
  void buildXpReport() {
    final var party = QuestData.party();

    final var mySolution = ModernJavaSolutions.xpReport(party);
    final XpReport yourSolution = null;

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
