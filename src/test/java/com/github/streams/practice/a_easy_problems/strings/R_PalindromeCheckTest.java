package com.github.streams.practice.a_easy_problems.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Check whether a string is a palindrome (ignoring case and non-alphanumeric characters).
 *
 * <p><b>Input:</b> "A man, a plan, a canal: Panama" <br>
 * <b>Output:</b> true <br>
 *
 * <p><b>Explanation:</b> Once normalized to "amanaplanacanalpanama", it reads the same forwards and
 * backwards.
 */
class R_PalindromeCheckTest {

  @Test
  @Disabled
  void testIsPalindrome() {
    final var input = "A man, a plan, a canal: Panama";

    final var mySolution = StringProblemsSolution.isPalindrome(input);
    final var yourSolution = false;

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
