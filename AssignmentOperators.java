// Demonstration of Assignment Operators in Java
// TIME COMPLEXITY: O(1)
// SPACE COMPLEXITY: O(1)

public class AssignmentOperators {
    public static void main(String[] args){
        int a = 10;
        int b = 20;

        // Addition assignment
        a += b; // a = a + b
        System.out.println("After += : " + a); // 30

        // Subtraction assignment
        a -= b; // a = a - b
        System.out.println("After -= : " + a); // 10

        // Multiplication assignment
        a *= b; // a = a * b
        System.out.println("After *= : " + a); // 200

        // Division assignment
        a /= b; // a = a / b
        System.out.println("After /= : " + a); // 10

        // Modulus assignment
        a %= b; // a = a % b
        System.out.println("After %= : " + a); // 10

        // Bitwise AND assignment
        // 10 & 20 = 0 (in binary: 1010 & 10100 = 00000)
        a &= b; // a = a & b
        System.out.println("After &= : " + a); // 0

        // Bitwise OR assignment
        // 10 | 20 = 30 (in binary: 1010 | 10100 = 11110)
        a |= b; // a = a | b
        System.out.println("After |= : " + a); // 20

        // Bitwise XOR assignment
        // 10 ^ 20 = 30 (in binary: 1010 ^ 10100 = 11110)
        a ^= b; // a = a ^ b
        System.out.println("After ^= : " + a); // 0

        // Left shift assignment
        // 0 << 2 = 0 (in binary: 0000 << 2 = 0000)
        a <<= 2; // a = a << 2
        System.out.println("After <<= : " + a); // 0

        // Right shift assignment
        // 0 >> 2 = 0 (in binary: 0000 >> 2 = 0000)
        a >>= 2; // a = a >> 2
        System.out.println("After >>= : " + a); // 0

        // Unsigned right shift assignment
        a >>>= 2; // a = a >>> 2
        System.out.println("After >>>= : " + a); // 0s
    }
}