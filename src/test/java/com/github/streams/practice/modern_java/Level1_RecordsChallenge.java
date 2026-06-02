package com.github.streams.practice.modern_java;

import com.github.streams.practice.modern_java.quest.HeroClass;
import com.github.streams.practice.modern_java.quest.QuestData;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * 🎮 STREAM QUEST · LEVEL 1 — "The Roster" · ⭐ 10 XP
 *
 * <p><b>Modern Java feature:</b> records (Java 16+) as stream elements.
 *
 * <p><b>Quest:</b> Given the {@link QuestData#party()}, return the names of every {@code MAGE},
 * sorted alphabetically.
 *
 * <pre>
 *   Expected → ["Borin", "Eldric"]
 * </pre>
 *
 * <p><b>Hint:</b> {@code stream().filter(...).map(Hero::name).sorted().toList()}. Notice you call
 * the record's accessor {@code heroClass()} — no {@code get} prefix.
 *
 * <p>Remove {@code @Disabled}, fill in {@code yourSolution}, and clear the level. 🏆
 */
class Level1_RecordsChallenge {

  @Test
  @Disabled
  void mageRoster() {
    final var party = QuestData.party();

    final var mySolution = ModernJavaSolutions.heroNamesInClass(party, HeroClass.MAGE);
    final List<String> yourSolution = List.of();

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
