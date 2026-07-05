package dev.iglnierod.leetcode.easy.p1071;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    assertEquals("ABC", solution.gcdOfStrings("ABCABC", "ABC"));
  }

  @Test
  void example2() {
    assertEquals("AB", solution.gcdOfStrings("ABABAB", "ABAB"));
  }

  @Test
  void example3() {
    assertEquals("", solution.gcdOfStrings("LEET", "CODE"));
  }

  @Test
  void example4() {
    assertEquals("", solution.gcdOfStrings("AAAAAB", "AAA"));
  }
}
