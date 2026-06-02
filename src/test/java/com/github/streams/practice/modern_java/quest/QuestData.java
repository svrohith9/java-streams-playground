package com.github.streams.practice.modern_java.quest;

import static com.github.streams.practice.modern_java.quest.HeroClass.ARCHER;
import static com.github.streams.practice.modern_java.quest.HeroClass.HEALER;
import static com.github.streams.practice.modern_java.quest.HeroClass.MAGE;
import static com.github.streams.practice.modern_java.quest.HeroClass.WARRIOR;

import com.github.streams.practice.modern_java.quest.GameEvent.MonsterSlain;
import com.github.streams.practice.modern_java.quest.GameEvent.PlayerLeveledUp;
import com.github.streams.practice.modern_java.quest.GameEvent.QuestCompleted;
import com.github.streams.practice.modern_java.quest.GameEvent.TreasureFound;
import java.util.List;

/** Ready-made fixtures for the Stream Quest challenges. */
public final class QuestData {

  private QuestData() {}

  /** The adventuring party, in marching order. */
  public static List<Hero> party() {
    return List.of(
        new Hero("Aria", WARRIOR, 12, 4_800, List.of("Cleave", "Shield Wall", "Taunt")),
        new Hero("Borin", MAGE, 9, 3_100, List.of("Fireball", "Frost Nova")),
        new Hero("Caspian", ARCHER, 11, 4_200, List.of("Power Shot", "Volley", "Trap")),
        new Hero("Dahlia", HEALER, 10, 3_600, List.of("Mend", "Sanctuary")),
        new Hero("Eldric", MAGE, 14, 6_050, List.of("Meteor", "Blink", "Arcane Shield", "Polymorph")),
        new Hero("Faye", ARCHER, 8, 2_400, List.of("Quick Shot")));
  }

  /** A chronological log of what happened during the last play session. */
  public static List<GameEvent> sessionLog() {
    return List.of(
        new MonsterSlain("Goblin", 150),
        new TreasureFound("Silver Key", 75),
        new MonsterSlain("Orc Captain", 600),
        new QuestCompleted("Clear the Mines", 1_200, 450),
        new PlayerLeveledUp(11),
        new TreasureFound("Ruby Amulet", 900),
        new MonsterSlain("Cave Troll", 1_100),
        new PlayerLeveledUp(12));
  }
}
