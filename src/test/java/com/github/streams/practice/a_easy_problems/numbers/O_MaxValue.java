package com.github.streams.practice.a_easy_problems.numbers;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Find the maximum value in a list of integers.
 *
 * <p><b>Input:</b> [3, 7, 2, 9, 4, 1] <br>
 * <b>Output:</b> 9 <br>
 *
 * <p><b>Explanation:</b> 9 is the largest number in the list.
 */
class O_MaxValue {

  @Test
  @Disabled
  void testMaxValue() {
    final var input = List.of(3, 7, 2, 9, 4, 1);

    final var mySolution = EasyNumbersProblemSolution.maxValue(input);
    final var yourSolution = -1;

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
