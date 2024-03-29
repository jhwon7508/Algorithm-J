package lv5;

import java.util.Scanner;
public class CombinationPascal{
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt()+1;
    int m = sc.nextInt()+1;  
    
    int[][] pasc = new int[n+2][n+2];
    
    for(int i = 1 ; i < pasc.length; i++){ 
      for(int j = 1 ; j< i ; j++){ 
        pasc[i][j] = 1; 
        if( i > 1 && j >= 1 && j < i-1 ){ 
          pasc[i][j] = pasc[i-1][j-1] + pasc[i-1][j];
        }
      }
    }
    System.out.print(pasc[n+1][m]);
  }
}
/*
문제
n명의 사람중 m명을 순서에 상관없이 뽑는 경우의 수를 조합이라고 하며 nCm으로 나타낸다.

이 조합은 파스칼의 삼각형과 아주 밀접한 관련이 있다고 한다.

n과 m이 주어졌을때 nCm의 값을 출력하는 프로그램을 작성하시오.  

입력
첫째 줄에 정수 n, m(0 ≤ m ≤ n ≤ 30)이 들어온다.

 

출력
첫째 줄에 nCm의 값을 출력한다.

 

예제 입력
5 2
예제 출력
10*/