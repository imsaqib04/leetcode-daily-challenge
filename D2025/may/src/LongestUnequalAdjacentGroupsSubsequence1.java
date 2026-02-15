// 15 MAY 2025
import java.util.ArrayList;
import java.util.List;

public class LongestUnequalAdjacentGroupsSubsequence1 {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {

        List<String> list = new ArrayList<> ();

        list.add ( words[0] );

        int prev = groups[0];

        for (int i = 1; i < groups.length; i++) {
            if (groups[i] != prev) {
                list.add ( words[i] );
                prev = groups[i];
            }
        }
        return list;
    }
}