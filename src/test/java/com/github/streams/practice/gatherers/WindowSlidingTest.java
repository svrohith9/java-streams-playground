package com.github.streams.practice.gatherers;

import java.util.List;
import java.util.stream.Gatherers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

/// The windowSliding gatherer is an intermediate stream operation that produces overlapping,
// fixed-size lists ("windows"). Each window after the first drops the oldest element and appends
// the next one, so consecutive windows share all but one element.
///
/// It is the tool of choice for "look at every N consecutive elements" problems such as moving
// averages, detecting rising/falling runs, or comparing each item with its neighbours.
///
class WindowSlidingTest {
  @Test
  @EnabledOnJre(JRE.JAVA_25)
  void windowSlidingTest() {
    final List<Integer> input = List.of(1, 2, 3, 4, 5);
    final int windowSize = 3;

    final var output = input.stream().gather(Gatherers.windowSliding(windowSize)).toList();
    final var expected =
        List.of(List.of(1, 2, 3), List.of(2, 3, 4), List.of(3, 4, 5));

    Assertions.assertEquals(expected, output);
  }
}
