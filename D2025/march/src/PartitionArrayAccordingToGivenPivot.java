// 3-March
public class PartitionArrayAccordingToGivenPivot {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int smaller = 0, equal = 0, larger = 0;

        // Count occurrences of numbers less than, equal to, and greater than pivot
        for (int num : nums) {
            if (num < pivot) smaller++;
            else if (num == pivot) equal++;
            else larger++;
        }

        // Rearrange elements in nums itself
        int i = 0;

        // Fill numbers less than pivot
        for (int num : nums) {
            if (num < pivot) nums[i++] = num;
        }

        // Fill numbers equal to pivot
        for (int num : nums) {
            if (num == pivot) nums[i++] = num;
        }

        // Fill numbers greater than pivot
        for (int num : nums) {
            if (num > pivot) nums[i++] = num;
        }

        return nums;
    }
}