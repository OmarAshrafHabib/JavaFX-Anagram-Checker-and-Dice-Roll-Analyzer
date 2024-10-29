public class DiceAnalyzer {
    public static int getLongestIncreasingSequence(int[] diceRolls) {
        int longestSequence = 0;
        int currentSequence = 0;
        for (int i = 1; i < diceRolls.length; i++) {
            if (diceRolls[i] > diceRolls[i - 1]) {
                currentSequence++;
            } else {
                longestSequence = Math.max(longestSequence, currentSequence);
                currentSequence = 1;
            }
        }
        return Math.max(longestSequence, currentSequence);
    }

    public static boolean isTargetSumPossible(int[] diceRolls, int target) {
        for (int i = 0; i < diceRolls.length; i++) {
            for (int j = 0; j < diceRolls.length; j++) {
                if (diceRolls[i] + diceRolls[j] == target && i != j) {
                    return true;
                }
            }
        }
        return false;
    }

}