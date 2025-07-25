import java.util.HashSet;

class MaxSum {
    public int maxSum(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        int sum = 0;

        int maxNeg = Integer.MIN_VALUE;

        // if(nums.length==1){
        //     return nums[0];
        // }

        for(int num : nums){
            if(num <= 0 )
                maxNeg = Math.max(maxNeg, num);

            else if(!set.contains(num))
                sum = sum + num;
            set.add(num);
        }
        return sum==0? maxNeg:sum;
    }
}