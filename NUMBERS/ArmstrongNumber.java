package NUMBERS;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=scn.nextInt();
        int copy=num;
        int count=countDigits(num);
        int sum=0;
        while(num>0){
            int t=num%10;
            sum=sum+basePower(t, count);
            num=num/10;
        }
        if(sum==copy){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not an Armstrong Number");
        }
    }
    static int countDigits(int n)
    {
        int count=0;
        while(n>0)
        {
            count++;
            n=n/10;
        }
        return count;
    }
    static int basePower(int n,int b)
    {
        int res=1;
        while(b>0){
            res=n*res;
            b--;
        }
        return res;
    }
}
