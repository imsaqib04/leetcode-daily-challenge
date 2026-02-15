// 8-March 2025

public class Minimum_Recolors_To_Get {
    public int minimumRecolors(String blocks, int k) {


        int n = blocks.length ();
        int result = Integer.MAX_VALUE;
        int w = 0;


        for (int i = 0; i < k; i++) {
            if (blocks.charAt ( i ) == 'W') {
                w++;
            }
        }
        result = w;

        for (int i = k; i < blocks.length (); i++) {
            if (blocks.charAt ( i ) == 'W') {
                w++;
            }

            if (blocks.charAt ( i - k ) == 'W') {
                w--;
            }

            result = Math.min ( result, w );
        }
        return result;


        // int n= blocks.length();
        // int result = Integer.MAX_VALUE;

        // for(int i =0;i<=n-k;i++){

        //     int wCount = 0;

        //     for(int j = i;j<i+k;j++){
        //         if(blocks.charAt(j) == 'W'){
        //             wCount++;
        //         }
        //     }

        //     result = Math.min(result,wCount);
        // }
        // return result;
    }
}