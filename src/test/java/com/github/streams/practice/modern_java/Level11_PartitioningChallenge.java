package com.github.streams.practice.modern_java;

import com.github.streams.practice.modern_java.quest.Hero;
import com.github.streams.practice.modern_java.quest.QuestData;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * 🎮 STREAM QUEST · LEVEL 11 — "Veterans & Rookies" · ⭐ 30 XP
 *
 * <p><b>Modern Java feature:</b> {@code Collectors.partitioningBy} — a specialized {@code groupingBy}
 * that always produces exactly two buckets, keyed {@code true} / {@code false}.
 *
 * <p><b>Quest:</b> Split the party into veterans (level &ge; 11) under {@code true} and rookies under
 * {@code false}.
 *
 * <pre>
 *   true  → Aria(12), Caspian(11), Eldric(14)
 *   false → Borin(9), Dahlia(10), Faye(8)
 * </pre>
 *
 * <p><b>Hint:</b> {@code partitioningBy(hero -> hero.level() >= 11)}. Both keys are guaranteed
 * present, so you never have to null-check the empty side.
 */
class Level11_PartitioningChallenge {

  @Test
  @Disabled
  void splitVeteransAndRookies() {
    final var party = QuestData.party();

    final var mySolution = ModernJavaSolutions.partitionByVeteran(party, 11);
    final Map<Boolean, List<Hero>> yourSolution = Collections.emptyMap();

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
