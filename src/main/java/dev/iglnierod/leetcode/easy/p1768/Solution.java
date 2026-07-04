package dev.iglnierod.leetcode.easy.p1768;

public class Solution {

  /**
   * Merges two strings by alternating their characters, starting with word1.
   *
   * The loop runs until the longest word ends. At each index:
   * - append the character from word1 if it exists
   * - append the character from word2 if it exists
   *
   * This avoids out-of-bounds errors when one word is shorter than the other.
   *
   * Time complexity: O(n)
   * Space complexity: O(n)
   *
   * Where n is the total number of characters in word1 and word2.
   */
  public String mergeAlternately (String word1, String word2) {
    int maxLength = Math.max(word1.length(), word2.length());
    StringBuilder merged = new StringBuilder();

    for (int i = 0; i <= maxLength - 1; i++) {
      if (word1.length() > i) {
        merged.append(word1.charAt(i));
      }
      if (word2.length() > i) {
        merged.append(word2.charAt(i));
      }
    }
    return merged.toString();
  }
}