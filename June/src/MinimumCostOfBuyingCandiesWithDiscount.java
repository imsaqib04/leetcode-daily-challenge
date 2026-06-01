import java.util.Arrays;

public class MinimumCostOfBuyingCandiesWithDiscount {
    public int minimumCost(int[] cost) {

        int n = cost.length;
        Arrays.sort ( cost );
        int total = 0;
        int count = 0;

        for (int i = n - 1; i >= 0; i--) {
            count++;

            if (count % 3 == 0) {
                continue;
            } else {
                total = total + cost[i];
            }

            // 9 7 6 5 2 2
            // buy two third one is free.
            // so buy 9 7 and 6 is free

            // edge cases
            // if only two candies then max is that total sum
            // if only one candied then return then candies
        }
        return total;
    }
}
