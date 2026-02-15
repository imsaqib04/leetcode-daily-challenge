//1-March
public class ApplyOperationInArray {
    public int[] applyOperations(int[] nums) {

        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != 0) {

                if (nums[i] == nums[i + 1]) {
                    nums[i] = nums[i] * 2;
                    nums[i + 1] = 0;
                } else {
                    continue;
                }
            }
        }

        int k = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                if (i != k) {                  //
                    int temp = nums[k];
                    nums[k] = nums[i];
                    nums[i] = temp;
                }
                k++;
            }
        }
        return nums;
    }
}