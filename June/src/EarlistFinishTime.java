class EarliestFinishTime {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {

        int n = landStartTime.length;
        int m = waterStartTime.length;
        int ans = Integer.MAX_VALUE;

        for(int i = 0;i<n;i++){
            for(int j=0;j<m;j++){
                // Land ---> Water
                int landEndTime = landStartTime[i] + landDuration[i];
                int finish1 = Math.max(landEndTime , waterStartTime[j]) + waterDuration[j];

                ans = Math.min (ans , finish1);

                // water --> land

                int waterEndTime = waterStartTime[j] + waterDuration[j];
                int finish2 = Math.max(waterEndTime , landStartTime[i]) + landDuration[i];

                ans = Math.min(ans,finish2);
            }
        }
        return ans;
    }
}