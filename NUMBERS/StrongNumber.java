package NUMBERS;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=scn.nextInt();
        int copy=num;
        int sum=0;
        while(num>0){
            int t=num%10;
            int fact=1;
            while(t>0)
            {
                fact=fact*t;
                t--;
            }
            sum=sum+fact;
            num=num/10;
        }
        if(sum==copy){
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not a Strong Number");
        }
    }
}
