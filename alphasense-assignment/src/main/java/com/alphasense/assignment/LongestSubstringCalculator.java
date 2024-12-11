package com.alphasense.assignment;

import java.util.HashMap;
import java.util.HashSet;

/*** README file is included with all the necessary information for executing this file */

/***
 * Class: LongestSubstringCalculator
 *
 * This class helps to identify the maximum length of a given substring without repeated
 * characters in a given string.
 *
 * The solution is driven by the problem statement and considering multiple
 * edge cases and validating them in Test methods. Refer Test class for more
 * information on different cases.
 *
 * Different Approaches considered
 * Approach 1: Brute Force method
 * Basically iterate over all possible substrings with nested loops. When the size of input
 * string increases as O(n3). The complexity also increases and this straight forward method is not
 * optimised solution, as the time complexity is more and increases as input length increases.
 *
 * Approach 2: Sliding window with HashSet
 * Sliding window represented by two pointers left and right moving dynamically adjusting the
 * window until the maximum character length is identified. With HashSet usage, every time each
 * character is added and removed from HashSet at least once with time complexity O(2n).
 *
 * Approach 3: Sliding window with HashMap
 * By altering solution 2 and using HashMap instead of HashSet, we can make the characters
 * accessed once unlike HashSet and bring the time complexity to O(n) by skipping left pointer.
 *
 * Approach 4: Optimised Sliding window
 * This solution is considered optimised by array of Char with size of 128 instead using
 * HashSet and HashMap, there by making each character process once with fixed size array.
 *
 */
public class LongestSubstringCalculator {

    /*** Approach 1: Brute Force
     * @param - input string for manipulation.
     * @return - returns the maximum length of substring without repeated chars.
     */
    public int lengthOfLongestSubstringBruteForce(String strToManipulate) {
        if (strToManipulate == null || strToManipulate.isEmpty()) {
            return 0;
        }

        int maxLength = 0;
        for (int i = 0; i < strToManipulate.length(); i++) {
            for (int j = i; j < strToManipulate.length(); j++) {
                if (onlyUniqueChars(strToManipulate, i, j)) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }
        return maxLength;
    }

    private boolean onlyUniqueChars(String str, int start, int end) {
        HashSet<Character> uniqueCharSet = new HashSet<>();
        for (int i = start; i <= end; i++) {
            if (uniqueCharSet.contains(str.charAt(i))) {
                return false;
            }
            uniqueCharSet.add(str.charAt(i));
        }
        return true;
    }

    /*** Approach 2: Sliding Window with HashSet
     * @param - input string for manipulation.
     * @return - returns the maximum length of substring without repeated chars.
     */
    public int lengthOfLongestSubstringHashSet(String strToManipulate) {
        if (strToManipulate == null || strToManipulate.isEmpty()) {
            return 0;
        }

        int maxLength = 0;
        int left = 0;
        HashSet<Character> repeatedChars = new HashSet<>();

        for (int right = 0; right < strToManipulate.length(); right++) {
            while (repeatedChars.contains(strToManipulate.charAt(right))) {
                repeatedChars.remove(strToManipulate.charAt(left));
                left++;
            }
            repeatedChars.add(strToManipulate.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    /*** Approach 3: Sliding Window with HashMap
     * @param - input string for manipulation.
     * @return - returns the maximum length of substring without repeated chars.
     */
    public int lengthOfLongestSubstringHashMap(String strToManipulate) {
        if (strToManipulate == null || strToManipulate.isEmpty()) {
            return 0;
        }

        int maxLength = 0;
        int left = 0;
        HashMap<Character, Integer> charIndexMap = new HashMap<>();

        for (int right = 0; right < strToManipulate.length(); right++) {
            char currentChar = strToManipulate.charAt(right);
            if (charIndexMap.containsKey(currentChar)) {
                left = Math.max(left, charIndexMap.get(currentChar) + 1);
            }
            charIndexMap.put(currentChar, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    /*** Approach 4: Optimized Sliding Window
     * @param - input string for manipulation.
     * @return - returns the maximum length of substring without repeated chars.
     */
    public int lengthOfLongestSubstringOptimized(String strToManipulate) {
        if (strToManipulate == null || strToManipulate.isEmpty()) {
            return 0;
        }

        int maxLength = 0;
        int left = 0;
        int[] charIndex = new int[128];

        for (int right = 0; right < strToManipulate.length(); right++) {
            char currentChar = strToManipulate.charAt(right);
            left = Math.max(left, charIndex[currentChar]);
            maxLength = Math.max(maxLength, right - left + 1);
            charIndex[currentChar] = right + 1;
        }
        return maxLength;
    }
}