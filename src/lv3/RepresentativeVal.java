package lv3;

import java.util.*;
public class RepresentativeVal{
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int[] num = new int[10];
    int[] cnt = new int[10];
    int sum = 0;
    int max = 0;
    int index = 0;
    
    for(int i=0; i<num.length; i++){
      num[i]=sc.nextInt();
      sum += num[i];
    }
    int avg = sum/10;
    System.out.println(avg);
  
    Arrays.sort(num);
      
    for(int i=0; i<num.length; i++){
      for(int j=0; j<num.length; j++){
        if(num[i]==num[j]&&i!=j){
          cnt[i]+=1;
        }
      }
    }
    
    for(int i=num.length-1; i>=0; i--){
     if(cnt[i]>max){
        max=cnt[i];
      }else{
        max=max;
      }
      if(cnt[i]==max){
        index=i;
      }
    }
    
    System.out.print(num[index]);

  }
}

/*문제
어떤 수들이 있을 때, 그 수들을 대표하는 값으로 가장 흔하게 쓰이는 것은 평균이다. 평균은 주어진 모든 수의 합을 수의 개수로 나눈 것이다. 예를 들어 10, 40, 30, 60, 30, 20, 60, 30, 40, 50의 평균은

represent이 된다.

평균 이외의 또 다른 대표값으로 최빈값이라는 것이 있다. 최빈값은 주어진 수들 가운데 가장 많이 나타나는 수이다. 예를 들어 10, 40, 30, 60, 30, 20, 60, 30, 40, 50 이 주어질 경우, 30 이 세 번, 40 과 60 이 각각 두 번, 10, 20, 50 이 각각 한 번씩 나오므로, 최빈값은 30 이 된다. 열 개의 자연수가 주어질 때 이들의 평균과 최빈값을 구하는 프로그램을 작성하시오.

 

입력
첫째 줄부터 열 번째 줄까지 한 줄에 하나씩 자연수가 주어진다. 주어지는 자연수는 1,000 이하의 10 의 배수이다.

 

출력
첫째 줄에는 평균을 출력하고, 둘째 줄에는 최빈값을 출력한다. 최빈값이 둘 이상일 경우 그 중 최소값을 출력한다. 평균과 최빈값은 모두 자연수이다.

 

예제 입력
10
40
30
60
30
20
60
30
40
50
예제 출력
37
30*/