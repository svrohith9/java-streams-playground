package com.github.streams.practice.modern_java.quest;

import java.util.List;

/**
 * A playable character in the Stream Quest game world.
 *
 * <p>Modeled as a {@code record} (Java 16+) so it is immutable and gets {@code equals},
 * {@code hashCode} and {@code toString} for free — perfect data carriers for stream pipelines.
 *
 * @param name the hero's display name
 * @param heroClass the archetype this hero belongs to
 * @param level the current level (1 and up)
 * @param xp total experience points earned so far
 * @param skills the named abilities this hero has unlocked
 */
public record Hero(String name, HeroClass heroClass, int level, int xp, List<String> skills) {}
