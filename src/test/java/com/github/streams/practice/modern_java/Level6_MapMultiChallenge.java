package com.github.streams.practice.modern_java;

import com.github.streams.practice.modern_java.quest.QuestData;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * 🎮 STREAM QUEST · LEVEL 6 — "Spellbook" · ⭐ 40 XP
 *
 * <p><b>Modern Java feature:</b> {@code Stream::mapMulti} (Java 16+) — a push-style alternative to
 * {@code flatMap} that lets each element emit zero or more results into a downstream consumer.
 *
 * <p><b>Quest:</b> Collect every distinct skill any hero has unlocked, sorted alphabetically.
 *
 * <p><b>Hint:</b> {@code .<String>mapMulti((hero, downstream) -> hero.skills().forEach(downstream))}
 * then {@code distinct().sorted().toList()}.
 */
class Level6_MapMultiChallenge {

  @Test
  @Disabled
  void everyUnlockedSkill() {
    final var party = QuestData.party();

    final var mySolution = ModernJavaSolutions.allUnlockedSkills(party);
    final List<String> yourSolution = List.of();

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
