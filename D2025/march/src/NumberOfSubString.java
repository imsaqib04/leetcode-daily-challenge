//11-March
public class NumberOfSubString {
    public int numberOfSubstrings(String s) {

        int n = s.length ();
        int count = 0;

        // Map<Integer,Character> mp = new HashMap<>();
        int[] freq = new int[3];

        int j = 0;
        int i = 0;
        while (j < n) {
            char CurrentChar = s.charAt ( j );
            int index = CurrentChar - 'a';
            freq[index]++;

            while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
                count = count + (n - j);
                char ch1 = s.charAt ( i );
                int ind = ch1 - 'a';
                freq[ind]--;
                i++;
            }
            j++;
        }
        return count;
    }
}