package lv5;

import java.util.Scanner;
public class CombinationZero{
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int m = sc.nextInt();
    int nm=n-m;
    
    int N = n;
    int M = m;
    int NM = nm;
    
    int cntN2=0;
    int cntN5=0;
    
    int cntM2=0;
    int cntM5=0;
    
    int result2=0;
    int result5=0;
    
    while(N>0){
      N=N/2;
      cntN2+=N;
    }
    
    N=n;
    while(N>0){
      N=N/5;
      cntN5+=N;
    }
    
    while(M>0){
      M=M/2;
      cntM2+=M;
    }
    
    M=m;
    while(M>0){
      M=M/5;
      cntM5+=M;
    }
      
    while(NM>0){
      NM=NM/2;
      cntM2+=NM;
    }
    
    NM=nm;
    while(NM>0){
      NM=NM/5;
      cntM5+=NM;
    }
    
    result2=cntN2-cntM2;
    result5=cntN5-cntM5;
    
    if(result2>result5){
      System.out.print(result5);
    }else{
      System.out.print(result2);
    }
    
  }
}

/*문제
n명의 사람중 m명을 순서에 상관없이 뽑는 경우의 수를 조합이라고 하며 nCm으로 나타낸다.

nCm은 수식으로 n!/m!(n-m)! 으로 구할 수 있다. (5! = 12345)

n과 m이 주어졌을때 nCm의 끝자리 0의 개수를 출력하는 프로그램을 작성하시오.  

입력
첫째 줄에 정수 n, m(0≤m≤n≤1,000,000)이 들어온다.

 

출력
첫째 줄에 0의 개수를 출력한다.

 

예제 입력
25 12
예제 출력
2*/