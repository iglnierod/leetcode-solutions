package dev.iglnierod.leetcode.easy.p1071;

class Solution {

  /**
   * Finds the greatest common divisor string of str1 and str2.
   *
   * A string divides another string if repeating it several times builds
   * the full original string.
   *
   * The solution tries every possible prefix length, starting from the
   * longest possible one. A valid candidate must:
   * - have a length that divides both string lengths exactly
   * - be able to build str1 by repetition
   * - be able to build str2 by repetition
   *
   * Since we try longer candidates first, the first valid one is the answer.
   *
   * Time complexity: O(n * m)
   * Space complexity: O(k)
   *
   * Where n is the length of the longest string, m is the number of candidate
   * lengths checked, and k is the length of the candidate substring.
   */
  public String gcdOfStrings(String str1, String str2) {
    int minLength = Math.min(str1.length(), str2.length());

    for (int length = minLength; length >= 1; length--) {
      if (str1.length() % length != 0 || str2.length() % length != 0) {
        continue;
      }

      String candidate = str1.substring(0, length);

      if (divides(str1, candidate) && divides(str2, candidate)) {
        return candidate;
      }
    }

    return "";
  }

  /**
   * Checks if candidate divides str.
   *
   * The method splits str into parts with the same length as candidate.
   * Each part must be exactly equal to candidate.
   *
   * Example:
   * str = "ABABAB"
   * candidate = "AB"
   *
   * The method checks:
   * - "AB"
   * - "AB"
   * - "AB"
   *
   * Since all parts are equal to candidate, it returns true.
   *
   * Time complexity: O(n)
   * Space complexity: O(k)
   *
   * Where n is the length of str and k is the length of candidate.
   */
  private boolean divides(String str, String candidate) {
    for (int i = 0; i < str.length(); i += candidate.length()) {
      String part = str.substring(i, i + candidate.length());

      if (!part.equals(candidate)) {
        return false;
      }
    }

    return true;
  }
}