package com.alphasense.assignment.test;

import com.alphasense.assignment.LongestSubstringCalculator;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/***
 * Test Class to verify different scenarios expected in the requirement using different approaches implemented.
 */
public class LongestSubstringCalculatorTest {
    @Test
    public void testEmptyStringOrSpace() {
        LongestSubstringCalculator calculator = new LongestSubstringCalculator();
        assertEquals(0, calculator.lengthOfLongestSubstringHashSet(""));
        assertEquals(1, calculator.lengthOfLongestSubstringHashMap(" "));
        assertEquals(0, calculator.lengthOfLongestSubstringOptimized(""));
        assertEquals(1, calculator.lengthOfLongestSubstringBruteForce(" "));
    }

    @Test
    public void testMixedCharacters() {
        LongestSubstringCalculator calculator = new LongestSubstringCalculator();
        assertEquals(8, calculator.lengthOfLongestSubstringHashSet("123abc12345"));
        assertEquals(6, calculator.lengthOfLongestSubstringHashMap("ab23!2ghk!"));
        assertEquals(7, calculator.lengthOfLongestSubstringOptimized("-abc-deg-hij-abc"));
        assertEquals(2, calculator.lengthOfLongestSubstringBruteForce("aaaabbbccd"));
    }

    @Test
    public void testSingleCharacterString() {
        LongestSubstringCalculator calculator = new LongestSubstringCalculator();
        assertEquals(1, calculator.lengthOfLongestSubstringHashSet("a"));
        assertEquals(1, calculator.lengthOfLongestSubstringHashMap("K"));
        assertEquals(1, calculator.lengthOfLongestSubstringOptimized("1"));
        assertEquals(1, calculator.lengthOfLongestSubstringBruteForce("M"));
    }

    @Test
    public void testUniqueCharacters() {
        LongestSubstringCalculator calculator = new LongestSubstringCalculator();
        assertEquals(6, calculator.lengthOfLongestSubstringHashSet("abcdef"));
        assertEquals(8, calculator.lengthOfLongestSubstringHashMap("ghijklmn"));
        assertEquals(7, calculator.lengthOfLongestSubstringOptimized("opqrstu"));
        assertEquals(5, calculator.lengthOfLongestSubstringBruteForce("vwxyz"));
    }

    @Test
    public void testRepeatingCharacters() {
        LongestSubstringCalculator calculator = new LongestSubstringCalculator();
        assertEquals(3, calculator.lengthOfLongestSubstringHashSet("abcabcbb"));
        assertEquals(3, calculator.lengthOfLongestSubstringHashMap("pwwkew"));
        assertEquals(3, calculator.lengthOfLongestSubstringOptimized("dwdf"));
        assertEquals(6, calculator.lengthOfLongestSubstringBruteForce("kirthika"));
    }

    @Test
    public void testAllSameCharacters() {
        LongestSubstringCalculator calculator = new LongestSubstringCalculator();
        assertEquals(1, calculator.lengthOfLongestSubstringHashSet("bbbbb"));
        assertEquals(1, calculator.lengthOfLongestSubstringHashMap("kkkkkk"));
        assertEquals(1, calculator.lengthOfLongestSubstringOptimized("zzzzzz"));
        assertEquals(1, calculator.lengthOfLongestSubstringBruteForce("TTTTTT"));
    }


}
