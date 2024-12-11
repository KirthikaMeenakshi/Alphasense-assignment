package com.alphasense.assignment;

public class Application {
    /***
     *     Main method to run the application and its functions.
     *     For more test cases refer the LongestSubstringCalculatorTest.java class
     *     with different scenarios and approaches tested.
     */

    public static void main(String[] args) {
        LongestSubstringCalculator calculator = new LongestSubstringCalculator();

        // Validate Repeated Characters
        System.out.println("\n**** SCENARIOS AS PER REQUIREMENT ***** ");
        System.out.println("Validating << Repeated String 'abcabcbb'  >> Expected - 3 / Actual Result - "+calculator.lengthOfLongestSubstringOptimized("abcabcbb"));
        System.out.println("Validating << Repeated String 'pwwkew'    >> Expected - 3 / Actual Result - "+calculator.lengthOfLongestSubstringOptimized("pwwkew"));
        System.out.println("Validating << Repeated String 'dwdf'      >> Expected - 3 / Actual Result - "+calculator.lengthOfLongestSubstringOptimized("dwdf"));
        // Validate all same characters
        System.out.println("Validating << Repeated Unique 'bbbbb'     >> Expected - 1 / Actual Result - "+calculator.lengthOfLongestSubstringOptimized("bbbbb"));

        System.out.println("\n**** OTHER EDGE CASES CONSIDERED ***** ");
        // Validate Empty String
        System.out.println("Validating << Empty String ''             >> Expected - 0 / Actual Result - "+calculator.lengthOfLongestSubstringBruteForce(""));
        // Validate Empty Space
        System.out.println("Validating << Empty Space String ' '      >> Expected - 1 / Actual Result - "+calculator.lengthOfLongestSubstringHashSet( " "));
        // Validate Single Character
        System.out.println("Validating << Single character String 'A' >> Expected - 1 / Actual Result - "+calculator.lengthOfLongestSubstringHashMap("A"));
        // Validate Unique Characters
        System.out.println("Validating << Unique String 'ghijklmn'    >> Expected - 8 / Actual Result - "+calculator.lengthOfLongestSubstringOptimized("ghijklmn"));
        // Validate Mixed String
        System.out.println("Validating << Mixed String '123abc12345'  >> Expected - 8 / Actual Result - "+calculator.lengthOfLongestSubstringHashMap("123abc12345"));
    }
}