package com.github.streams.practice.modern_java;

import com.github.streams.practice.modern_java.quest.Hero;
import com.github.streams.practice.modern_java.quest.QuestData;
import java.util.Optional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * 🎮 STREAM QUEST · LEVEL 8 — "The Champion" · ⭐ 30 XP
 *
 * <p><b>Modern Java feature:</b> {@code Optional} as the safe result of a {@code max} reduction —
 * no nulls, no {@code NoSuchElementException} surprises.
 *
 * <p><b>Quest:</b> Find the highest-level hero in the party.
 *
 * <pre>
 *   Expected → Eldric (level 14)
 * </pre>
 *
 * <p><b>Hint:</b> {@code stream().max(Comparator.comparingInt(Hero::level))}.
 */
class Level8_OptionalChallenge {

  @Test
  @Disabled
  void findTheChampion() {
    final var party = QuestData.party();

    final var mySolution = ModernJavaSolutions.strongestHero(party);
    final Optional<Hero> yourSolution = Optional.empty();

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
