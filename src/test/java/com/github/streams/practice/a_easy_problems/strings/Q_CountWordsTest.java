package com.github.streams.practice.a_easy_problems.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Count the number of words in a sentence.
 *
 * <p><b>Input:</b> "The quick brown fox jumps" <br>
 * <b>Output:</b> 5 <br>
 *
 * <p><b>Explanation:</b> Words separated by whitespace are counted; extra spaces are ignored.
 */
class Q_CountWordsTest {

  @Test
  @Disabled
  void testCountWords() {
    final var input = "The quick brown fox jumps";

    final var mySolution = StringProblemsSolution.countWords(input);
    final var yourSolution = -1L;

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
