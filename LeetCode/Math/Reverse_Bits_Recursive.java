class Solution {
    int reverseBitsRecursive (int n , int bits) {
        if (bits == 1) return n & 1; // base case: return the last bit
        int mask = (1 << (bits / 2)) - 1;      // half-size mask

        int left = (n >>> (bits / 2)) & mask; // extract left half
        int right = n & mask;                 // extrafct right half

        // reverse each half recursively and swap them
        return (reverseBitsRecursive(right, bits / 2) << (bits / 2)) |
                reverseBitsRecursive(left, bits / 2);
    }

    public int reverseBits(int n) {
        return reverseBitsRecursive(n, 32); // start with full 32 bits
    }
}