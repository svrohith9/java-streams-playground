package com.github.streams.practice.modern_java;

import com.github.streams.practice.modern_java.quest.GameEvent;
import com.github.streams.practice.modern_java.quest.GameEvent.MonsterSlain;
import com.github.streams.practice.modern_java.quest.GameEvent.PlayerLeveledUp;
import com.github.streams.practice.modern_java.quest.GameEvent.QuestCompleted;
import com.github.streams.practice.modern_java.quest.GameEvent.TreasureFound;
import com.github.streams.practice.modern_java.quest.Hero;
import com.github.streams.practice.modern_java.quest.HeroClass;
import com.github.streams.practice.modern_java.quest.XpReport;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Reference answers for the Stream Quest challenges — each method shows one modern Java feature
 * working hand in hand with the Stream API. Peek here only after you have attempted the matching
 * {@code LevelN_*Challenge} yourself.
 */
public final class ModernJavaSolutions {

  private ModernJavaSolutions() {}

  /** LEVEL 1 — Records + Streams: names of heroes in a class, alphabetically. */
  public static List<String> heroNamesInClass(List<Hero> party, HeroClass heroClass) {
    return party.stream()
        .filter(hero -> hero.heroClass() == heroClass)
        .map(Hero::name)
        .sorted()
        .toList();
  }

  /** LEVEL 2 — Pattern matching for {@code switch}: a human-readable line for an event. */
  public static String describeEvent(GameEvent event) {
    return switch (event) {
      case MonsterSlain m -> "Slew a " + m.monster() + " (+" + m.xpAwarded() + " XP)";
      case TreasureFound t -> "Found " + t.item() + " (worth " + t.goldValue() + " gold)";
      case QuestCompleted q -> "Completed '" + q.questName() + "'";
      case PlayerLeveledUp p -> "Reached level " + p.newLevel() + "!";
    };
  }

  /** LEVEL 3 — Record patterns: total XP an event grants, destructured in the {@code switch} arm. */
  public static int xpFromEvent(GameEvent event) {
    return switch (event) {
      case MonsterSlain(String ignored, int xp) -> xp;
      case QuestCompleted(String name, int xp, int gold) -> xp;
      case TreasureFound ignored -> 0;
      case PlayerLeveledUp ignored -> 0;
    };
  }

  /** LEVEL 3b — Total XP earned across a whole session log. */
  public static int totalXpFromSession(List<GameEvent> log) {
    return log.stream().mapToInt(ModernJavaSolutions::xpFromEvent).sum();
  }

  /** LEVEL 4 — Sequenced Collections: the party marching in reverse order. */
  public static List<Hero> partyInReverse(List<Hero> party) {
    return party.reversed();
  }

  /** LEVEL 4b — Sequenced Collections: the leader and the rear guard, via getFirst / getLast. */
  public static List<String> leaderAndRearGuard(List<Hero> party) {
    return List.of(party.getFirst().name(), party.getLast().name());
  }

  /** LEVEL 5 — Teeing collector: total XP, head-count and average in a single pass. */
  public static XpReport xpReport(List<Hero> party) {
    return party.stream()
        .collect(
            Collectors.teeing(
                Collectors.summingLong(Hero::xp),
                Collectors.counting(),
                (total, count) ->
                    new XpReport(total, count, count == 0 ? 0.0 : (double) total / count)));
  }

  /** LEVEL 6 — mapMulti (Java 16+): flatten every hero into the skills they have unlocked. */
  public static List<String> allUnlockedSkills(List<Hero> party) {
    return party.stream()
        .<String>mapMulti((hero, downstream) -> hero.skills().forEach(downstream))
        .distinct()
        .sorted()
        .toList();
  }

  /** LEVEL 7 — groupingBy + counting: how many heroes belong to each class. */
  public static Map<HeroClass, Long> headcountByClass(List<Hero> party) {
    return party.stream().collect(Collectors.groupingBy(Hero::heroClass, Collectors.counting()));
  }

  /** LEVEL 8 — Optional + max: the highest-level hero, if the party is not empty. */
  public static Optional<Hero> strongestHero(List<Hero> party) {
    return party.stream().max(java.util.Comparator.comparingInt(Hero::level));
  }

  /**
   * LEVEL 9 — Text blocks (Java 15+) + {@code String::formatted}: a printable scoreboard. Each row
   * lists the hero name, class and XP, one per line.
   */
  public static String scoreboard(List<Hero> party) {
    final var rowTemplate =
        """
        %-10s %-8s %6d XP""";
    return party.stream()
        .map(hero -> rowTemplate.formatted(hero.name(), hero.heroClass(), hero.xp()))
        .collect(Collectors.joining("\n"));
  }
}
