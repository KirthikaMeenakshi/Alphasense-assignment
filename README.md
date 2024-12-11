# Longest Substring Calculator

This project implements multiple algorithms to find the length of the longest substring without repeating characters in a given string. 
It is a simple Java-based Maven project and includes a comprehensive test suite with test class and methods.

## Features

### **Algorithms Implemented:**
    1. Brute Force Method
    2. Sliding Window with `HashSet`
    2. Sliding Window with `HashMap`
    3. Optimized Sliding Window (using an array for ASCII characters)

    
### Comprehensive Testing:

   Test cases include edge cases like empty strings, strings with unique characters, strings with repeating characters, and mixed cases.

## Requirements

- Java 17+
- Maven 3+

## Dependencies

- **JUnit 5**: For testing.

## Project Structure

```
alphasense-assignment/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com.alphasense.assignment/
│   │           └── LongestSubstringCalculator.java
│   │           └── Application.java
│   └── test/
│   │   └── java/
│   │       └── com.alphasense.assignment/
│   │           └── LongestSubstringCalculatorTest.java
├── pom.xml
└── README.md
```

## Setup

1. Clone the repository: [Note: Please let me know if you need access to git URL. To use zip file proceed to step 2]
   ```bash
   git clone <repository-url>
   cd alphasense.assignment
   ```

2. Unzip the project to a folder.

3. Run the application using any IDE (I used IntelliJ)
   
   1. Import the project to an IDE.
   2. Build the project.
   3. Run Application class main method or Test class.
   
   (OR)
   
4. Run the project using CLI 
   1. Go to the project path:
   ```bash
    cd alphasense.assignment 
   ```
   2. Compile the project
   ```bash
   mvn compile
   ```
   3. Build the project using Maven:
   ```bash
   mvn clean install
   ```
   4. Run the application
   ```bash
   java -cp target/classes com.alphasense.assignment.Application
   ```
   5. Run tests:
   ```bash
   mvn test
   ```
5. Run executable Jar attached in the email directly
   ```bash
   java -cp  longest-substring-1.0-SNAPSHOT.jar com.alphasense.assignment.Application
   ```
   
## Usage

In general, instantiate the `LongestSubstringCalculator` class and call one of the available methods:

```java
LongestSubstringCalculator calculator = new LongestSubstringCalculator();
System.out.println("Validating << Repeated String 'abcabcbb'  >> Expected - 3 / Actual Result - "+calculator.lengthOfLongestSubstringHashMap("abcabcbb")); 
System.out.println("Validating << Repeated String 'pwwkew'    >> Expected - 3 / Actual Result - "+calculator.lengthOfLongestSubstringHashMap("pwwkew"));
 ```

1. Run the Application class main method in IDE or Main.class in the classpath to see the pre-populated results.

   (OR)
2. Run the LongestSubstringCalculatorTest class or test methods directly to see various algorithms tested.

## Sample Results
```
PS D:\Meenakshi\Work\Projects\AlphaSense-project\alphasense-assignment> java -cp target/classes com.alphasense.assignment.Application

**** SCENARIOS AS PER REQUIREMENT ***** 
Validating << Repeated String 'abcabcbb'  >> Expected - 3 / Actual Result - 3
Validating << Repeated String 'pwwkew'    >> Expected - 3 / Actual Result - 3
Validating << Repeated String 'dwdf'      >> Expected - 3 / Actual Result - 3
Validating << Repeated Unique 'bbbbb'     >> Expected - 1 / Actual Result - 1

**** OTHER EDGE CASES CONSIDERED ***** 
Validating << Empty String ''             >> Expected - 0 / Actual Result - 0
Validating << Empty Space String ' '      >> Expected - 1 / Actual Result - 1
Validating << Single character String 'A' >> Expected - 1 / Actual Result - 1
Validating << Unique String 'ghijklmn'    >> Expected - 8 / Actual Result - 8
Validating << Mixed String '123abc12345'  >> Expected - 8 / Actual Result - 8
PS D:\Meenakshi\Work\Projects\AlphaSense-project\alphasense-assignment> 
```
## Algorithms

### 1. Brute Force
- **Description:** Checks all the possible substrings for its uniqueness.
- **Complexity:**
    - Time: \(O(n^3)\)
    - Space: \(O(k)\)
  
### 2. Sliding Window with `HashSet`
- **Description:** Uses a sliding window and a `HashSet` to track unique characters.
- **Complexity:**
    - Time: \(O(2n)\)
    - Space: \(O(k)\)

### 3. Sliding Window with `HashMap`
- **Description:** Improves upon the `HashSet` method by directly skipping the left pointer using a `HashMap`.
- **Complexity:**
    - Time: \(O(n)\)
    - Space: \(O(k)\)

### 4. Optimized Sliding Window
- **Description:** Uses an array for ASCII characters for maximum efficiency.
- **Complexity:**
    - Time: \(O(n)\)
    - Space: \(O(1)\)






