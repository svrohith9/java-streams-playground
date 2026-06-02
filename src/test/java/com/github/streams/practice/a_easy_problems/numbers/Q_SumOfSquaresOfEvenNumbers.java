package com.github.streams.practice.a_easy_problems.numbers;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Sum the squares of the even numbers in a list.
 *
 * <p><b>Input:</b> [1, 2, 3, 4, 5, 6] <br>
 * <b>Output:</b> 56 <br>
 *
 * <p><b>Explanation:</b> Even numbers are (2, 4, 6); 2^2 + 4^2 + 6^2 = 4 + 16 + 36 = 56.
 */
class Q_SumOfSquaresOfEvenNumbers {

  @Test
  @Disabled
  void testSumOfSquaresOfEvenNumbers() {
    final var input = List.of(1, 2, 3, 4, 5, 6);

    final var mySolution = EasyNumbersProblemSolution.sumOfSquaresOfEvenNumbers(input);
    final var yourSolution = -1L;

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
