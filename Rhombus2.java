public class Rhombus2 {
    public static void main(String[] args){
        int n=5;
        int str=1;
        int spc=n/2;
        int a=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<spc;j++)
            {
                System.out.print(" "+" ");
            }
            for(int k=0;k<str;k++)
            {
                System.out.print(a+" ");
            }
            System.out.println();
            a++;
            if(i<n/2){
                spc--;
                str=str+2;
            }
            else{
                spc++;
                str=str-2;
            }
        }
    }
}
