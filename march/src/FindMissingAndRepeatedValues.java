// 6-March
public class FindMissingAndRepeatedValues {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int N = n * n;
        int repeated = -1, missing = -1;

        int[] freq = new int[N + 1]; // Frequency array to store occurrences (1-based index)

        // Count occurrences of each number
        for (int[] row : grid) {
            for (int num : row) {
                freq[num]++;
            }
        }

        // Find the repeated and missing number
        for (int i = 1; i <= N; i++) {
            if (freq[i] == 0) {
                missing = i;    // Number missing from the grid
            } else if (freq[i] > 1) {
                repeated = i;   // Number appearing twice
            }
        }

        return new int[]{repeated, missing};
    }
}