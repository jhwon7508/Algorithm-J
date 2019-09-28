package lv3;
import java.util.Scanner;
public class ReverseArray2{
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int[][] arr = new int[10][10];
    
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr[i].length; j++){
        arr[i][j]=sc.nextInt();
      }
    }
    
    for(int i=0; i<N; i++){
      for(int j=0; j<arr[i].length; j++){
        if(arr[i][j]==0){
          arr[i][j]=1;
        }else if(arr[i][j]==1){
          arr[i][j]=0;
        }
      }
    }
    
    for(int i=0; i<N; i++){
      for(int j=0; j<arr.length; j++){
        if(arr[j][i]==0){
          arr[j][i]=1;
        }else if(arr[j][i]==1){
          arr[j][i]=0;
        }
      }
    }
    
    for(int i=0; i<N; i++){
      for(int j=0; j<N; j++){
        if(i==j){
          if(arr[i][j]==0){
            arr[i][j]=1;
          }else if(arr[i][j]==1){
            arr[i][j]=0;
          }
        }
      }
    }
  
    for(int[] a:arr){
      for(int b:a){
        System.out.print(b+" ");
      }System.out.println();
    }
    
    }
}
/*문제
뒤집기 게임의 룰은 다음과 같다.

뒤집기 게임을 진행할 맵과 뒤집기 횟수 N이 주어진다.
뒤집기 행위는 뒤집을 원소가 1이면 0으로 만들고, 0이면 1로 만든다는 뜻이다.
첫번째 뒤집을 때는 1행의 원소들과 1열의 원소들을 모두 뒤집는다. 두번째 뒤집을 때는 2행의 원소들과 2열의 원소들을 모두 뒤집는다. 마찬가지로 i번째 뒤집을 때는 i행의 원소들과 i열의 원소들을 모두 뒤집는다. 이렇게 총 N번의 뒤집기를 한다. (행과 열의 번호는 1번부터 시작한다.)
10×10크기 맵의 상태와 N이 주어졌을 때 뒤집기 게임을 모두 시행하고 난 뒤의 맵을 출력하는 프로그램을 작성해보자  

입력
입력 첫째 줄에는 뒤집을 횟수 N이 주어진다. N은 10 이하의 자연수이다.

둘째 줄에는 10×10크기 맵의 상태가 주어진다.  

출력
뒤집기 게임을 하고난 뒤의 맵의 상태를 출력한다.

 

예제 입력
1
0 0 0 0 0 0 0 0 0 0 
0 0 0 0 0 0 0 0 0 0 
0 0 0 0 0 0 0 0 0 0 
0 0 0 0 0 0 0 0 0 0 
0 0 0 0 0 0 0 0 0 0 
0 0 0 0 0 0 0 0 0 0 
0 0 0 0 0 0 0 0 0 0 
0 0 0 0 0 0 0 0 0 0 
0 0 0 0 0 0 0 0 0 0 
0 0 0 0 0 0 0 0 0 0 
예제 출력
1 1 1 1 1 1 1 1 1 1 
1 0 0 0 0 0 0 0 0 0 
1 0 0 0 0 0 0 0 0 0 
1 0 0 0 0 0 0 0 0 0 
1 0 0 0 0 0 0 0 0 0 
1 0 0 0 0 0 0 0 0 0 
1 0 0 0 0 0 0 0 0 0 
1 0 0 0 0 0 0 0 0 0 
1 0 0 0 0 0 0 0 0 0 
1 0 0 0 0 0 0 0 0 0 
 

예제 입력
2
0 0 1 1 1 0 0 1 1 1 
1 0 1 0 1 0 0 1 0 0 
1 0 0 0 0 0 0 0 0 0 
1 0 0 0 0 0 0 0 0 0 
1 0 0 0 0 0 0 0 0 0 
1 0 0 0 0 0 0 0 0 0 
1 0 1 0 1 0 0 1 0 0 
1 0 0 0 0 0 0 0 0 0 
0 0 1 1 1 0 0 1 1 1 
1 0 0 0 0 0 0 0 0 0 
예제 출력
1 0 0 0 0 1 1 0 0 0
1 1 0 1 0 1 1 0 1 1
0 1 0 0 0 0 0 0 0 0
0 1 0 0 0 0 0 0 0 0
0 1 0 0 0 0 0 0 0 0
0 1 0 0 0 0 0 0 0 0
0 1 1 0 1 0 0 1 0 0
0 1 0 0 0 0 0 0 0 0
1 1 1 1 1 0 0 1 1 1
0 1 0 0 0 0 0 0 0 0*/