package Recursion;

public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(calc(1234));
    }
    static int calc(int num){
        if(num%10==0){
            return num;
        }
        return calc(num/10)*(num%10);
    }
}
