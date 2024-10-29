/**
 * This class serves as a test driver for Assignment 6 Question 2.
 * 
 * @author Omar Habib
 */
public class Question2TestDriver {

   public static void main(String[] args) {
      int[] rollsArrayA = { 2, 5, 2, 3, 5, 6 };
      int[] rollsArrayB = { 2, 3, 1, 6, 5, 1, 2, 4, 5, 6, 2, 3, 6 };
      int[] rollsArrayC = { 6, 2, 4, 3, 1, 2, 3, 3, 5, 2, 4, 4, 5, 5 };
      int[] rollsArrayD = { 6, 5, 5, 4, 3, 3, 3, 2, 1 };
      int[] rollsArrayE = {};

      System.out.println("rollsArrayA: 2, 5, 2, 3, 5, 6");
      System.out.println("longest increasing sequence (should be 4): "
            + DiceAnalyzer.getLongestIncreasingSequence(rollsArrayA));

      System.out.println("\nrollsArrayB: 2, 3, 1, 6, 5, 1, 2, 4, 5, 6, 2, 3, 6");
      System.out.println("longest increasing sequence (should be 5): "
            + DiceAnalyzer.getLongestIncreasingSequence(rollsArrayB));

      System.out.println("\nrollsArrayC: 6, 2, 4, 3, 1, 2, 3, 3, 5, 2, 4, 4, 5, 5");
      System.out.println("longest increasing sequence (should be 3): "
            + DiceAnalyzer.getLongestIncreasingSequence(rollsArrayC));

      System.out.println("\nrollsArrayD: 6, 5, 5, 4, 3, 3, 3, 2, 1");
      System.out.println("longest increasing sequence (should be 1): "
            + DiceAnalyzer.getLongestIncreasingSequence(rollsArrayD));

      System.out.println("\nrollsArrayE: array with length of 0 (no elements)");
      System.out.println("longest increasing sequence (should be 0): "
            + DiceAnalyzer.getLongestIncreasingSequence(rollsArrayE));

      System.out.println("\nSearching for target total in dice roll pairs:");

      System.out.println("3 from rollsArrayA (should be false): "
            + DiceAnalyzer.isTargetSumPossible(rollsArrayA, 3));
      System.out.println("4 from rollsArrayA (should be true): "
            + DiceAnalyzer.isTargetSumPossible(rollsArrayA, 4));
      System.out.println("5 from rollsArrayA (should be true): "
            + DiceAnalyzer.isTargetSumPossible(rollsArrayA, 5));
      System.out.println("6 from rollsArrayA (should be false): "
            + DiceAnalyzer.isTargetSumPossible(rollsArrayA, 6));

      System.out.println("2 from rollsArrayC (should be false): "
            + DiceAnalyzer.isTargetSumPossible(rollsArrayC, 2));
      System.out.println("7 from rollsArrayC (should be true): "
            + DiceAnalyzer.isTargetSumPossible(rollsArrayC, 7));
      System.out.println("12 from rollsArrayC (should be false): "
            + DiceAnalyzer.isTargetSumPossible(rollsArrayC, 12));

      System.out.println("7 from rollsArrayE (should be false): "
            + DiceAnalyzer.isTargetSumPossible(rollsArrayE, 7));
   }// end main

}// end class