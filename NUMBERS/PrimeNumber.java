package NUMBERS;

import java.util.Scanner;

public class PrimeNumber {
   public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=scn.nextInt();
        int a=2;
        while(a<=num/2){
            if(num%a==0){
                break;
            }
            a++;
        }
        if(a>num/2){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }
   } 
}
