class Solution {
    private static final int[] table = new int[256];
    static {
        for (int i = 0; i < 256; i++) {
            int rev = 0, x = i;
            for (int j = 0; j < 8; j++) {
                rev = (rev << 1) | (x & 1);
                x >>= 1;
            }
            table[i] = rev;
        }
    }
    public int reverseBits(int n) {
        return (table[n & 0xff] << 24) |         // lowest 8 bits
                (table[(n >>> 8) & 0xff] << 16) | // next 8 bits
                (table[(n >>> 16) & 0xff] << 8) | // next 8 bits
                (table[(n >>> 24) & 0xff]);       // highest 8 bits
    }
}