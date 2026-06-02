package com.github.streams.practice.modern_java;

import com.github.streams.practice.modern_java.quest.HeroClass;
import com.github.streams.practice.modern_java.quest.QuestData;
import java.util.Collections;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * 🎮 STREAM QUEST · LEVEL 7 — "Census" · ⭐ 30 XP
 *
 * <p><b>Modern Java feature:</b> {@code Collectors.groupingBy} with a downstream
 * {@code counting()} collector — the bread-and-butter of stream aggregation.
 *
 * <p><b>Quest:</b> Count how many heroes belong to each {@link HeroClass}.
 *
 * <pre>
 *   {WARRIOR=1, MAGE=2, ARCHER=2, HEALER=1}
 * </pre>
 */
class Level7_GroupingChallenge {

  @Test
  @Disabled
  void headcountPerClass() {
    final var party = QuestData.party();

    final var mySolution = ModernJavaSolutions.headcountByClass(party);
    final Map<HeroClass, Long> yourSolution = Collections.emptyMap();

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
