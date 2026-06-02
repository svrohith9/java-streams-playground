package com.github.streams.practice.modern_java;

import com.github.streams.practice.modern_java.quest.QuestData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * 🎮 STREAM QUEST · LEVEL 9 — "The Scoreboard" · ⭐ 40 XP
 *
 * <p><b>Modern Java features:</b> text blocks (Java 15) and {@code String::formatted} (Java 15) for
 * clean, template-style formatting inside a stream pipeline.
 *
 * <p><b>Quest:</b> Render one line per hero — name, class and XP — joined by newlines:
 *
 * <pre>
 *   Aria       WARRIOR    4800 XP
 *   Borin      MAGE       3100 XP
 *   ...
 * </pre>
 *
 * <p><b>Hint:</b> a row template like {@code "%-10s %-8s %6d XP".formatted(name, heroClass, xp)} and
 * {@code Collectors.joining("\n")}.
 */
class Level9_TextBlocksChallenge {

  @Test
  @Disabled
  void renderScoreboard() {
    final var party = QuestData.party();

    final var mySolution = ModernJavaSolutions.scoreboard(party);
    final var yourSolution = "";

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
