package dev.iglnierod.leetcode.easy.p1768;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

  private final Solution solution = new Solution();

  @Test
  void example1() {
    assertEquals("apbqcr", solution.mergeAlternately("abc", "pqr"));
  }

  @Test
  void example2() {
    assertEquals("apbqrs", solution.mergeAlternately("ab", "pqrs"));
  }

  @Test
  void example3() {
    assertEquals("apbqcd", solution.mergeAlternately("abcd", "pq"));
  }
}