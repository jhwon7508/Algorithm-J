package lv1;

import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
	    
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if(H>=0 && H<24 && M>=0 && M<60){
			if(M>=45){
				M=M-45;
			}else{
				H=H-1;
				M=M+15;
			}
			System.out.print(H+" "+M);
		}
    }
}