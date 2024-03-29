package lv5;

import java.util.Scanner;
public class SequenceSum{
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    
    int[] A = new int[N];
    int[][] S = new int[N][N];
    
    for(int i=0; i<S.length; i++){
      for(int j=0; j<S[i].length; j++){
        S[i][j]=sc.nextInt();
      }
    }
 
    for(int i=0; i<A.length; i++){
      if(i==0){
        A[i]=(S[i][i+1]+S[i][i+2]-S[i+1][i+2])/2; 
      }else{
        A[i]=S[i-1][i]-A[i-1];
      }
    }
 
 /*
    A[0] = (S[0][1]+S[0][2]-S[1][2])/2;        
    A[1] = S[0][1]-A[0];
    A[2] = S[1][2]-A[1];
    A[3] = S[2][3]-A[2];
 */
 
    for(int a : A){
      System.out.print(a+" ");
    }
    
  }
}

/*문제
옛날 옛적에, N개의 양의 정수를 가지는 수열 A가 있었다. 당신은 수열 자체를 알지는 못하지만 수열의 두 요소의 합은 알 수 있다. 수열 A를 찾아라!

 

입력
첫째 줄에 양의 정수 N이 주어진다. (3 <= N <= 1000 ) N개의 줄에 N개의 양의 정수가 TABLE S로 주어진다. 각 정수들은 100000 이하이다. TABLE S[ i, j ] 는 A[ i ] +A[ j ] 의 관계가 있다. (i 는 j와 같지 않을 경우에만 해당하고, 만약 i 와 j가 같다면 S[ i, j ] = 0 이다.) S[ i, j ]는 테이블에서 i번째 row와 j번째 column을 의미한다. 그리고 A[ i ] 는 수열 A의 i번째 요소를 의미한다. 어떤 입력 값에 대해서 양의 정수 수열 A는 단 하나 뿐임이 보장된다.

 

출력
첫째줄에 수열 A를 출력한다. (N개의 양의 정수를 공백을 가지고 출력한다.)

 

예제 입력
4
0 3 6 7
3 0 5 6
6 5 0 9
7 6 9 0
예제 출력
2 1 4 5
 

출처
COCI 2012/2013 Contest #6 2번

 

힌트
즉 S의 2행 3열(예제에서는 5)이 의미하는 바는 A[2] + A[3] (예제에서는 1+4) 이다.*/