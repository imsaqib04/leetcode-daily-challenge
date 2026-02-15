// 2-March
import java.util.*;

public class Merge2DArrayBySummingValues {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {

        Map<Integer, Integer> map = new HashMap<> ();

        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i][0] == nums2[j][0]) {
                map.put ( nums1[i][0], nums1[i][1] + nums2[j][1] );
                i++;
                j++;
            } else if (nums1[i][0] < nums2[j][0]) {
                map.put ( nums1[i][0], nums1[i][1] );
                i++;
            } else {
                map.put ( nums2[j][0], nums2[j][1] );
                j++;
            }
        }

        while (i < nums1.length) {
            map.put ( nums1[i][0], nums1[i][1] );
            i++;
        }
        while (j < nums2.length) {
            map.put ( nums2[j][0], nums2[j][1] );
            j++;
        }

        List<int[]> resultList = new ArrayList<> ();
        for (int key : new TreeSet<> ( map.keySet () )) { // Sorting by ID
            resultList.add ( new int[]{key, map.get ( key )} );
        }

        // Convert List<int[]> to int[][]
        return resultList.toArray ( new int[0][0] );

    }
}