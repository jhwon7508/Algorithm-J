package lv6;

import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    String op = sc.next();
    int b = sc.nextInt();
    
    if(op.equals("+")){
      System.out.print(a+b);
    }else if(op.equals("-")){
      System.out.print(a-b);
    }else if(op.equals("*")){
      System.out.print(a*b);
    }else if(op.equals("/")){
      System.out.print(a/b);
    }
    
    }
}

/*문제
덧셈, 뺄셈, 곱셈, 나눗셈을 할 수 있는 계산기 프로그램을 만드세요.

 

입력
첫째 줄에는 숫자 a가 입력되고, 둘째 줄에는 +, -, /, * 연산자가 입력된다. 마지막 줄에는 숫자 b가 입력된다.

 

출력
a와 b를 주어진 연산자를 활용하여 연산한 결과를 출력해라.

 

예제 입력
5
+
5
예제 출력
10
 

예제 입력
5
-
12
예제 출력
-7
 

예제 입력
2
*
105
예제 출력
210
 

예제 입력
125
/
5
예제 출력
25*/