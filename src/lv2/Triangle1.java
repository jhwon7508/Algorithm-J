package lv2;

import java.util.Scanner;
public class Triangle1{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        String[][] arr = new String[n][n];
        
        if(n>=0 && n<=100){
          for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
              if(i>=j){
                arr[i][j]="*";
              }else{
                arr[i][j]=" ";
              }
              
              System.out.print(arr[i][j]);
            }System.out.println();
          }
          
        }
    }
}

/*문제
n층의 삼각형을 출력하는 프로그램을 작성하여라. Input, Output의 예제를 참고한다.

 

입력
첫째 줄에 정수n이 주어진다. (0≤n≤100)

 

출력
다음 예제와 같이 삼각형 모양으로 ‘*’을 출력한다.

 

예제 입력
3
예제 출력
*
**
***
*/