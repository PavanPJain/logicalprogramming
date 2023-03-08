package NUMBERS;

import java.util.Scanner;

public class DecimalHexadecimalConverter {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=scn.nextInt();
        String hex="";
        while(num>0)
        {
            int t=num%16;
            if(t>9)
                hex=(char)(t+55)+hex;
            else
                hex=t+hex;

            num=num/16;
        }
        System.out.println("Number in Hexadecimal Format : "+hex);
    }
}
