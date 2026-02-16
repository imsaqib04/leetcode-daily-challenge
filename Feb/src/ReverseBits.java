public class ReverseBits {
        // you need treat n as an unsigned value
        public int reverseBits(int n) {
            int result = 0;

            for (int i = 0; i < 32; i++) {
                int lastBit = n % 2;       // Get the last bit (0 or 1)
                result = result * 2 + lastBit;  // Add it to result (left side)
                n = n / 2;                 // Drop the last bit
            }

            return result;
        }
    }