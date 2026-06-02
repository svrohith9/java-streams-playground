package com.github.streams.practice.modern_java.quest;

/**
 * Something that happens during a play session.
 *
 * <p>This is a {@code sealed interface} (Java 17+): the compiler knows the complete set of
 * implementations, which makes {@code switch} over a {@link GameEvent} <b>exhaustive</b> — no
 * {@code default} branch required. Combined with record patterns (Java 21) you can both match on
 * the type and destructure the data in a single arm.
 */
public sealed interface GameEvent
    permits GameEvent.MonsterSlain,
        GameEvent.TreasureFound,
        GameEvent.QuestCompleted,
        GameEvent.PlayerLeveledUp {

  /** A monster was defeated, awarding experience. */
  record MonsterSlain(String monster, int xpAwarded) implements GameEvent {}

  /** Loot was discovered, worth some gold. */
  record TreasureFound(String item, int goldValue) implements GameEvent {}

  /** A quest was finished, awarding both experience and gold. */
  record QuestCompleted(String questName, int xpAwarded, int goldReward) implements GameEvent {}

  /** The hero advanced to a new level. */
  record PlayerLeveledUp(int newLevel) implements GameEvent {}
}
