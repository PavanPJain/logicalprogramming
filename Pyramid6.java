public class Pyramid6 {
    public static void main(String[] args) {
		int n=5;
		int spc=n-1;
		int str=1;
		int a=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<spc;j++) {
				System.out.print(" "+" ");	
			}
			for(int k=0;k<str;k++) {
				if(k==0||k==str-1||i==n-1)
					System.out.print("*"+" ");
				else
					System.out.print(" "+" ");
			}
			System.out.println();
			spc--;
			str=str+2;
			a=1;
		}
	}
}
