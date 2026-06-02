package com.github.streams.practice.a_easy_problems.numbers;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Compute the product of all numbers in a list.
 *
 * <p><b>Input:</b> [1, 2, 3, 4, 5] <br>
 * <b>Output:</b> 120 <br>
 *
 * <p><b>Explanation:</b> 1 * 2 * 3 * 4 * 5 = 120.
 */
class R_ProductOfNumbers {

  @Test
  @Disabled
  void testProductOfNumbers() {
    final var input = List.of(1, 2, 3, 4, 5);

    final var mySolution = EasyNumbersProblemSolution.productOfNumbers(input);
    final var yourSolution = -1L;

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
