package lv1;

import java.util.Scanner;
public class SaveMoney{
    public static void main(String[] args){

      Scanner sc = new Scanner(System.in);
      
      int M = sc.nextInt();
      int cnt = 0;
      int sum = 0;
      
      if(M>=1 && M<=10000){
      while(sum<=M){
        cnt++;
        sum = sum+cnt;
        
        if(sum>=M){
          break;
        }
      }System.out.print(cnt);        
        
    }
  }
}

/*문제
철수는 2018년 새해를 맞아 돈을 모으기로 했다. 돈을 하루에 얼마씩 모을지 고민하던 철수는 다음과 같이 규칙을 정하기로 한다.

돈을 모으기 시작한날 1원을 저금한다. 그 다음날에는 2원을 저금한다. 그 다음날에는 3원을 저금한다. 이러한 규칙을 따라 돈을 모으기 시작한 날부터 n일째 되는 날에는 n원을 저금한다.

이렇게 저금을 하다가, 모인 돈이 M원 이상이 되면 돈을 그만 모은다.

철수가 모으고자 하는 돈의 액수 M이 주어질 때, 며칠동안 돈을 저금해야 하는지를 출력하는 프로그램을 작성하시오.

예를 들어, 철수가 10원을 모으고 싶다고 하자. 그렇다면 4일차까지 돈을 모으게 되면 1+2+3+4 = 10원이 되므로 4일차까지 돈을 모으면 된다. 만약 20원으로 모으고 싶다면, 6일차에 21원을 모으게 되므로 6일차까지 돈을 모아야 한다.

 

입력
첫 번째 줄에 모으고 싶은 액수 M이 주어진다. (1 <= M <= 10000)

 

출력
철수가 며칠동안 돈을 모아야 하는지를 출력한다.

 

예제 입력
10
예제 출력
4*/