package lv7;

import java.util.Scanner;
public class Factorial{

  public int Fact(int N) {
    int result = 0;

  	if (N == 1) {
		  result = 1;
	  } else {
		  result = N * Fact(N-1);
	  }
	  return result;
  }

    public static void main(String[] args){

       Scanner sc = new Scanner(System.in);
       Factorial f = new Factorial();
       
       int N = sc.nextInt();
       
       if(N>=1 && N<=10){
         System.out.print(f.Fact(N));
       }
    }
    
}