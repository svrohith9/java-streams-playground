package com.github.streams.practice.modern_java;

import com.github.streams.practice.modern_java.quest.Hero;
import com.github.streams.practice.modern_java.quest.QuestData;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * 🎮 STREAM QUEST · LEVEL 4 — "About Face!" · ⭐ 30 XP
 *
 * <p><b>Modern Java feature:</b> Sequenced Collections (Java 21) — {@code List} now has
 * {@code reversed()}, {@code getFirst()} and {@code getLast()} built in.
 *
 * <p><b>Quest:</b> Return the party marching in reverse order.
 *
 * <p><b>Hint:</b> No stream needed — {@code party.reversed()} hands you a reversed view. Compare it
 * with the old {@code Collections.reverse(new ArrayList<>(party))} dance you used to write.
 */
class Level4_SequencedCollectionsChallenge {

  @Test
  @Disabled
  void reverseMarchingOrder() {
    final var party = QuestData.party();

    final var mySolution = ModernJavaSolutions.partyInReverse(party);
    final List<Hero> yourSolution = List.of();

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
