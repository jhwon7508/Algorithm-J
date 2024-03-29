package lv3;
import java.util.Scanner;
public class EightNine{
    public static void main(String[] args){

// 반대로 출력하는 방식으로도 가능

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int M = sc.nextInt();
    
    int[][] arr = new int [N][M];
    int[][] reverse = new int [N][M];
    
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr[i].length; j++){
        arr[i][j]=sc.nextInt();
      }
    }
  
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr[i].length; j++){
        if(M%2==0){
          reverse[i][j] = arr[i][M-1-j];
        }else{
           if(j!=M/2){
            reverse[i][j] = arr[i][M-1-j];
          }else{
            reverse[i][j] = arr[i][j];
          }
        }
      }
    }
  
    for(int[] i:reverse){
      for(int j : i){
        System.out.print(j + " ");
      }System.out.println();
    }
    
    }
}
/*문제
영팔이는 숫자 0과 8을 굉장히 좋아하는 아이이다. 그 이유는 숫자가 좌우로 뒤집어져도 똑같이 생겼기 때문이라고 한다. 영팔이는 숫자 0과 8의 매력을 사람들에게 전파하기 위해 유리로된 N×M타일에 0과 8들을 잔뜩 써놓았다. 이제 영팔이는 0과 8로된 숫자들은 좌우로 뒤집어도 여전히 0과 8들이라는 것을 보여주려고 한다.

 

입력
a첫째줄에는 자연수 N, M이 주어진다. N은 타일행렬의 행의 개수, M은 타일행렬의 열의 수를 나타낸다. N과 M은 100 이하의 자연수이다. 둘째줄부터 N개의 줄에 걸쳐, 타일행렬의 정보를 나타내는 0과 8들이 주어진다.

 

출력
주어진 타일행렬을 좌우로 뒤집어 출력한다.

 

예제 입력
3 3
0 8 0
8 8 0
0 0 8
예제 출력
0 8 0 
0 8 8 
8 0 0 */