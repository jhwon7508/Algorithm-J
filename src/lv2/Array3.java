package lv2;

import java.util.Scanner;
public class Array3{
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
      
    int N = sc.nextInt();
    int[][] arr = new int[N][N];
  
    int i = 0;
    int j = 0;
    int number = 1;
  
    int total = 0;
    
    for(int t = N; t>0; t--){
      total+=t;
    }
    
    while(number<=total){
      arr[i][j] = number;
      number++;
      
      if(j==0){
        j=i+1;
        i=0;
      }else{
        i++;
        j--;
      }
    }
  
    for(int[] e:arr) {
        for(int f:e){
          if(f!=0){
            System.out.print(f+" ");
          }else{
            System.out.print(" ");
          }
          }
        System.out.println();
    }
    
    }
}

/*    
    if(N>=1 && N<=100){
      for(int k=0; k<arr.length; k++){
        for(int l=0; l<arr[k].length; l++){
          if(k+l < N){
            index++;
            arr[k][l] = 
            System.out.print(arr[k][l]+" ");
          }else{
            System.out.print(" ");
          }
        }System.out.println();  
      }
    }
*/
    


/*문제
N이 주어질 때, 다음과 같은 프로그램을 작성해보자.  

입력
첫째 줄에 자연수 N이 주어진다.(1<=N<=100)

 

출력
예시를 참고하여 작성하자.

 

예제 입력
3 
예제 출력
1 2 4
3 */5
6 