package lv3;

import java.util.Scanner;
public class GCD_LCM{
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int m = sc.nextInt();
    
    int gcd=1;
    int lcm=1;
    
    if(n>m){
      for(int i=2; i<n; i++){
        if(n%i==0 && m%i==0){
          gcd = i;
        }
      }
    }else{
      for(int i=2; i<m; i++){
        if(n%i==0 && m%i==0){
          gcd = i;
        }
      }
    }
    
    lcm = gcd*(n/gcd)*(m/gcd);
    
    System.out.print(gcd +"\n" +lcm);
    
    }
}

/*문제
두 개의 자연수를 입력받아 최대공약수(GCD)와 최소공배수(LCM)를 출력하는 프로그램을 작성하시오.  

입력
첫째 줄에는 두 개의 자연수가 주어진다. 이 둘은 10,000 이하의 자연수이며 사이에 한 칸의 공백이 주어진다.

 

출력
첫째 줄에는 입력으로 주어진 두 수의 최대공약수를, 둘째 줄에는 입력으로 주어진 두 수의 최소공배수를 출력한다.

 

예제 입력
24 18
예제 출력
6
72*/