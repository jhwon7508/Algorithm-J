package lv5;

import java.util.Scanner;
public class PROSJEK{
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int sum=0;
    
    int[] A = new int[N+1];
    int[] B = new int[N+1];
    
    
    for(int i=1; i<B.length; i++){
      B[i]=sc.nextInt();
    }
    
    A[1]=B[1];
    
    for(int i=2; i<A.length; i++){
      sum+=A[i-1];
      A[i]=i*B[i]-sum;
    }
    
    for(int i=1; i<A.length; i++){
      System.out.print(A[i]+" ");
    }
  }
}

/*문제
민건이는 수학 수업시간동안 재밌는 방법으로 수학을 연습하고 있다.

먼저 민건이는 정수 수열 A를 작성했다.

그리고 나서 그 아래에 A의 해당 항까지의 평균값을 그 항으로 하는 정수 수열 B를 쓴다.

예를 들어 , 만약 수열 A가 1, 3, 2, 6, 8 이라면 수열 B는 1/1, (1+3)/2 , (1+3+2)/3, (1+3+2+6)/4, (1+3+2+6+8)/5 즉, 1, 2, 2, 3, 4 가 된다.

수열 B가 주어졌을 때 수열 A를 구하는 프로그램을 작성하시오.

 

입력
첫째줄에 수열 B의 길이를 나타내는 N이 주어진다.(1 <= N <= 100)

두번째 줄에 수열 B를 구성하는 N개의 요소가 주어진다. Bi (1 <= Bi <= 10^9)

 

출력
첫째 줄에 수열 A를 이루는 N개의 정수를 출력해라 (1 <= Ai <= 10^9)

NOTE : 수열 A의 요소들은 정수이다.

 

예제 입력
1
2
예제 출력
2
 

예제 입력
4
3 2 3 5
예제 출력
3 1 5 11
 

예제 입력
5
1 2 2 3 4
예제 출력
1 3 2 6 8
 

출처
COCI 2014/2015 Contest #1 1번  */