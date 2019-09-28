package lv2;

import java.util.Scanner;
public class Array1{
    public static void main(String[] args){

      Scanner sc = new Scanner(System.in);
      
      int N = sc.nextInt();
      int M = sc.nextInt();
      int index = 0;
      
      int[][] arr = new int[N][M];
      
      for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr[i].length; j++){
        index++;
        arr[i][j]=index;
        System.out.print(arr[i][j]+" ");
        }System.out.println();
      }

    }
}

/*문제
행의 개수 N, 열의 개수 M이 주어질 때, 다음과 같이 출력하는 프로그램을 작성해보자. (단, 2차원 배열을 활용할 것)  

입력
첫째 줄에 자연수 N,M이 주어진다.(1<=N,M<=100)

 

출력
출력 예시와 같은 형식으로 출력한다.

 

예제 입력
3 4
예제 출력
1 2 3 4
5 6 7 8
9 10 11 12*/