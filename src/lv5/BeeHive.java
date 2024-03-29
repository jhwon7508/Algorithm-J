package lv5;

import java.util.Scanner;
public class BeeHive{
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    
    int[][] bee = new int[N][2];
    
    bee[0][0] = 1;
    bee[0][1] = 1;
    bee[1][0] = 6;
    
    if(N>1 && N <= 1000000){
      for(int i=2; i<bee.length; i++){
        bee[i][0]=bee[i-1][0]+6;
        bee[i-1][1]=bee[i-1][0]+bee[i-2][1];
      }
    }else{
      bee[N][N]=bee[N][N];
    }
    
    for(int i=0; i<bee.length; i++){
      if(N<=bee[i][1]){
        System.out.println(i+1+"\n");
        break;
      }
    }
/* 
    for(int[] b : bee){
      for(int a : b){
        System.out.print(a +" ");
      }System.out.println();
    }
 */  
    }
}

/*문제
alt text

위의 그림과 같이 육각형으로 이루어진 벌집이 있다. 그림에서 보는 바와 같이 중앙의 방 1부터 시작해서 이웃하는 방에 돌아가면서 1씩 증가하는 번호를 주소로 매길 수 있다.

숫자 N이 주어졌을 때, 벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나가는지(시작과 끝을 포함하여)를 계산하는 프로그램을 작성하시오. 예를 들면, 13까지는 3개, 58까지는 5개를 지난다.

 

입력
첫째 줄에 N(1 ≤ N ≤ 1,000,000)이 주어진다.

 

출력
입력으로 주어진 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나는지 출력한다.  

예제 입력
13
예제 출력
3
 

예제 입력
58
예제 출력
5
 

출처
ACM-ICPC Daejeon Nationalwide Internet Competition 2004 B번  */