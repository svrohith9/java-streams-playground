package com.github.streams.practice.gatherers;

import java.util.List;
import java.util.stream.Gatherers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

/// The fold gatherer is a many-to-one intermediate operation: it carries an accumulator across the
// whole stream and, once every element has been consumed, emits a single combined result.
///
/// Unlike Stream.reduce, fold does not require the accumulator type to match the element type and
// has no identity/associativity constraints, because it is strictly ordered and sequential. Here it
// concatenates every digit into one string.
///
class FoldTest {
  @Test
  @EnabledOnJre(JRE.JAVA_25)
  void foldTest() {
    final List<Integer> input = List.of(1, 2, 3, 4, 5);

    final var output =
        input.stream()
            .gather(Gatherers.fold(() -> "", (accumulator, number) -> accumulator + number))
            .toList();
    final var expected = List.of("12345");

    Assertions.assertEquals(expected, output);
  }
}
