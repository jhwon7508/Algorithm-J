package lv5;

import java.util.Scanner;
public class FindPrime{
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    
    
    int N = sc.nextInt();
    
    int[] prime = new int[N];
    int[] cnt = new int[N];
    
    int count = 0;
    
    for(int i=0; i<prime.length; i++){
      prime[i]=sc.nextInt();
    }
    
    for(int i=0; i<prime.length; i++){
      for(int j=1; j<=prime[i]; j++){
      if(prime[i]%j==0){
          cnt[i]+=1;
        }
      }
    }
    
    for(int i=0; i<cnt.length; i++){
      if(cnt[i]==2){
        count++;
      }
    }  
    
    System.out.print(count);
  }
}

/*문제
주어진 숫자들 중 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.  

입력
첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 줄에 걸쳐 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.

 

출력
주어진 수들 중 소수의 개수를 출력한다.

 

예제 입력
4
1
3
5
7
예제 출력
3*/