class InvertedPyramid
{
    public static void main(String[] args) {
        int n=9;
        int str=n*2-1;
        int spc=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<spc;j++){
                System.out.print(" "+" ");
            }
            for(int k=0;k<str;k++){
                System.out.print("*"+" ");
            }
            System.out.println();
            spc++;
            str=str-2;
        }
    }
}