class BitwiseOperators {
    public static void main(String[] args) {
        // Bitwise AND (&)
        int x = 12;  // Binary: 1100
        int y = 9;   // Binary: 1001
        int resultAnd = x & y;
        System.out.println("Bitwise AND: " + resultAnd);  // Output: 8 (1000)

        // Bitwise OR (|)
        int resultOr = x | y;
        System.out.println("Bitwise OR: " + resultOr);    // Output: 13 (1101)

        // Bitwise XOR (^)
        int resultXor = x ^ y;
        System.out.println("Bitwise XOR: " + resultXor);  // Output: 5 (0101)

        // Bitwise NOT (~)
        x = 5;  // Binary: 0000 0101
        int resultNotX = ~x;
        System.out.println("Bitwise NOT: " + resultNotX); // Output: -6 (Two's complement)

        // Left Shift (<<)
        x = 12;  // Binary: 0000 1100
        int resultLeftShift = x << 2;  // Shift left by 2 bits
        System.out.println("Left Shift: " + resultLeftShift);  // Output: 48 (0011 0000)

        // Right Shift (>>)
        int resultRightShift = x >> 2;  // Shift right by 2 bits
        System.out.println("Right Shift: " + resultRightShift);  // Output: 3 (0000 0011)
    }
}
