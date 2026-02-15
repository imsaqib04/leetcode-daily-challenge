public class MaxCount {
    public int maximumCount(int[] nums) {

        int Ncount = 0;
        int Pcount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                Ncount++;
            } else if (nums[i] > 0) {
                Pcount++;
            }

        }

        return Math.max ( Pcount, Ncount );
    }
}