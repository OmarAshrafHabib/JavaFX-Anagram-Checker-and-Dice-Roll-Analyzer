# JavaFX Anagram Checker & Dice Roll Analyzer

## Overview
This project includes two main components to practice JavaFX, string manipulation, and array handling in Java.

1. **Anagram Checker**: A JavaFX application that determines if two entered words are anagrams of each other. The GUI allows users to input words and displays results based on letter matching.

2. **Dice Roll Analyzer**: A utility class that includes methods for analyzing dice rolls. It provides functionalities to identify the longest increasing sequence in a series of dice rolls and to check if any two dice rolls add up to a given target.

### Key Components

1. **Anagram Checker GUI**:
   - Accepts two word inputs and determines if they are anagrams.
   - Ignores case differences in letters.
   - GUI includes a button to trigger the anagram check and display results.

2. **DiceAnalyzer Class**:
   - **getLongestIncreasingSequence**: Finds and returns the length of the longest sequence of adjacent increasing values in an array of dice rolls.
   - **isTargetSumPossible**: Checks if any two dice rolls from an array sum up to a specified target value.
   - Both methods are static, requiring no object instantiation to use.

### Features
- **JavaFX GUI**: A simple interface for the anagram checker, providing feedback on input and results.
- **Array Processing**: Utilizes loops and logic to process arrays without altering original data.
- **Static Methods**: Similar to the Math class, the `DiceAnalyzer` class includes static methods that operate directly on input parameters.
- **Efficient Design**: Avoids sorting or creating new arrays to enhance performance in both string and array operations.

## Usage
1. Run the **Anagram Checker** application to test word pairs for anagram status via the GUI.
2. Use the **DiceAnalyzer** methods by running the provided `Question2TestDriver` to test longest sequence identification and target sum verification.

## Documentation
Javadoc comments are included in `DiceAnalyzer` to explain the purpose and parameters of each method.

## Project Files
- `AnagramChecker.java`: JavaFX GUI application for checking anagrams.
- `DiceAnalyzer.java`: Contains static methods for analyzing dice rolls.
- `Question2TestDriver.java`: Test driver for validating `DiceAnalyzer` methods.
- Sample output screenshots and driver output included.
