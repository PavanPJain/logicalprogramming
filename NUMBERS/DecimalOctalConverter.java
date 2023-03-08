package NUMBERS;

import java.util.Scanner;

public class DecimalOctalConverter {
    
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scn.nextInt();
        String bin="";
        while(num>0){
            int t=num%8;
            bin=t+bin;
            num=num/8;
        }
        System.out.println("Number in Binary : "+bin);
    }
}
