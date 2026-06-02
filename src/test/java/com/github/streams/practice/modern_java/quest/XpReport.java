package com.github.streams.practice.modern_java.quest;

/**
 * A summary of the party's experience, produced in a single stream pass with the {@code teeing}
 * collector (Java 12+).
 *
 * @param totalXp the combined XP of every hero
 * @param heroCount how many heroes were counted
 * @param averageXp the mean XP per hero (0 when the party is empty)
 */
public record XpReport(long totalXp, long heroCount, double averageXp) {}
