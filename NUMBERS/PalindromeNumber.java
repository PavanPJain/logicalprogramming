package NUMBERS;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=scn.nextInt();
        int copy=num;
        int rev=0;
        while(num>0){
            int t=num%10;
            rev=rev*10+t;
            num=num/10;
        }
        if(copy==rev){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not a Palindrome Number");
        }
    }
}
