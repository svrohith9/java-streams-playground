package com.github.streams.practice.a_easy_problems.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Capitalize the first letter of each word in a sentence (title case).
 *
 * <p><b>Input:</b> "the quick brown fox" <br>
 * <b>Output:</b> "The Quick Brown Fox" <br>
 *
 * <p><b>Explanation:</b> The first character of each word is upper-cased and the rest lower-cased.
 */
class S_CapitalizeEachWordTest {

  @Test
  @Disabled
  void testCapitalizeEachWord() {
    final var input = "the quick brown fox";

    final var mySolution = StringProblemsSolution.capitalizeEachWord(input);
    final var yourSolution = "";

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
