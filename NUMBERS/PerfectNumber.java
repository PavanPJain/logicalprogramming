package NUMBERS;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=scn.nextInt();
        int sum=0;
        int a=1;
        while(a<=num/2){
            if(num%a==0){
                sum=sum+a;
            }
            a++;
        }       
        if(sum==num){
            System.out.println("Perfect Number");
        } 
        else{
            System.out.println("Not a Perfect Number");
        }
    }
}
