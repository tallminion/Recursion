package Recursion;

import java.util.Scanner;

public class CountingZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count(n));
    }
    static int count(int n){
        return check(n, 0);
    }
    static int check(int n, int c){
        if(n==0) return c;
        int rem = n%10;
        if(rem ==0){
            return check(n/10, c+1);
        }
        return check(n/10, c);
    }
}
