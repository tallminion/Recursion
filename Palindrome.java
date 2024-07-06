package Recursion;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == reverse(n)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }

    // Helper method to start the recursion
    static int reverse(int n) {
        return rev(n, 0);
    }

    // Recursive method to reverse the number
    static int rev(int n, int reversed) {
        if (n == 0) {
            return reversed;
        }
        int rem = n % 10;
        reversed = reversed * 10 + rem;
        return rev(n / 10, reversed);
    }
}
