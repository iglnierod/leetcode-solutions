package dev.iglnierod.leetcode.easy.p1768;

public class Solution {
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