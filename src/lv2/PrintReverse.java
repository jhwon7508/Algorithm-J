package lv2;

import java.util.Scanner;
public class PrintReverse{
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int[] arr = new int[n];
    
    if(n>=1 && n<=1000){
      for(int i=0; i<arr.length; i++){
        arr[i]=sc.nextInt();
      }for(int j=n-1; j>=0; j--){
        System.out.print(arr[j] + " ");
      }
      
      
    }  
  }
}

/*문제
정수를 입력으로 받아 입력 받은 수를 거꾸로 출력하는 문제이다.

 

입력
입력의 첫 수는 수의 개수 n 이다. ( 1 <= n <= 1000 ) 다음 줄에는 수들이 입력으로 주어진다. 각 수의 범위는 -10000 < n < 10000 이다.

 

출력
한 줄에 입력받은 수를 거꾸로 출력한다.

 

예제 입력
5
1 2 3 4 5
예제 출력
5 4 3 2 1*/