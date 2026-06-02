package com.github.streams.practice.a_easy_problems.numbers;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Find the minimum value in a list of integers.
 *
 * <p><b>Input:</b> [3, 7, 2, 9, 4, 1] <br>
 * <b>Output:</b> 1 <br>
 *
 * <p><b>Explanation:</b> 1 is the smallest number in the list.
 */
class P_MinValue {

  @Test
  @Disabled
  void testMinValue() {
    final var input = List.of(3, 7, 2, 9, 4, 1);

    final var mySolution = EasyNumbersProblemSolution.minValue(input);
    final var yourSolution = -1;

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
