package lv2;

import java.util.Scanner;
public class Array2{
    public static void main(String[] args){

      Scanner sc = new Scanner(System.in);
      
      int N = sc.nextInt();
      int M = sc.nextInt();
      
      int[][] arr = new int[N][M];
      
      for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr[i].length; j++){
        arr[i][j]=sc.nextInt();
        }
      }
      
      int A = sc.nextInt();
      int B = sc.nextInt();
      
      for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr[i].length; j++){
          if(i==A && j==B){
            System.out.print(arr[i][j]);
          }
        }
      }      
      
    }
}

/*문제
N*M의 2차원 배열이 주어지고, 주어진 2차원 배열의 [A][B]에는 어떠한 값이 있는지 출력하는 프로그램을 작성해보자. (단, 2차원 배열을 활용할 것)  

입력
첫째 줄에 자연수 행의 개수 N,열의 개수 M이 주어진다.(1<=N,M<=100) 둘째 줄 부터 N*M의 배열이 주어지고, 마지막 줄에는 A,B가 주어진다. ( 0<=A<N, 0<=B<M )

 

출력
첫째 줄에 N*M배열의 [A][B]의 값을 출력한다.

 

예제 입력
3 4
1 2 3 4
5 6 7 8
9 10 11 12
1 1
예제 출력
6*/