package com.github.streams.practice.modern_java;

import com.github.streams.practice.modern_java.quest.QuestData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * 🎮 STREAM QUEST · LEVEL 3 — "Tally the Spoils" · ⭐ 30 XP
 *
 * <p><b>Modern Java feature:</b> record patterns (Java 21) — match the type <i>and</i> destructure
 * its components in one {@code switch} arm, e.g. {@code case MonsterSlain(String m, int xp) -> xp}.
 *
 * <p><b>Quest:</b> Sum the XP awarded across the whole {@link QuestData#sessionLog()}. Only
 * {@code MonsterSlain} and {@code QuestCompleted} grant XP.
 *
 * <pre>
 *   Expected → 150 + 600 + 1200 + 1100 = 3050
 * </pre>
 */
class Level3_RecordPatternsChallenge {

  @Test
  @Disabled
  void totalSessionXp() {
    final var log = QuestData.sessionLog();

    final var mySolution = ModernJavaSolutions.totalXpFromSession(log);
    final var yourSolution = -1;

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
