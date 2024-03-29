package lv5;

import java.util.Scanner;
import java.util.Arrays;
public class OrderK{
    public static void main(String[] args){

      Scanner sc = new Scanner(System.in);
      
      int N = sc.nextInt();
      int k = sc.nextInt();
      
      int arr[] = new int[N];
      
      for(int i=0; i<arr.length; i++){
        arr[i]= sc.nextInt();
      }

      Arrays.sort(arr);
      
      System.out.print(arr[N-k]);
    }
}

/*문제
N개의 자연수가 주어질 때, 이 자연수들 중에서 k번째로 큰 수를 찾는 프로그램을 작성하시오. 만약 k=1 이라면, 가장 큰 수를 찾으면 된다.

 

입력
첫 번째 줄에 자연수 N, k가 주어진다. (1 ≤ N ≤ 100,000, 1 ≤ k ≤ 10) 두 번째 줄에 N개의 자연수가 주어진다.  

출력
첫 번째 줄에 k번째 수를 출력한다.

 

예제 입력
10 3
1 5 2 3 8 4 7 3 2 10
예제 출력
7
 

예제 입력
5 4
5 5 1 2 3
예제 출력
2*/