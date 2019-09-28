package lv1;

import java.util.Scanner;

public class CountMultiplea {

	Scanner sc = new Scanner(System.in);

	int A = sc.nextInt();
	int B = sc.nextInt();
	int C = sc.nextInt();
	
	int cnt = 0;

	if(A>=1&&A<=1000&&B>=1&&B<=1000&&C>=1&&C<=1000)
	{
		if (A <= B) {
			for (int i = A; i <= B; i++) {
				if (i % C == 0) {
					cnt++;
				}
			}
		} else {
			for (int i = B; i <= A; i++) {
				if (i % C == 0) {
					cnt++;
				}
			}
		}
	}System.out.print(cnt);
}}

/*문제
세 개의 자연수 A, B, C가 주어진다. 이 때, A부터 B까지 숫자 중에서 C의 배수의 개수를 출력하는 프로그램을 작성하시오.

예를 들어, A = 3, B = 9, C = 2 라고 하자. 그러면 3부터 9까지 숫자 중 2의 배수의 개수이므로 4, 6, 8 총 3개가 존재한다. 따라서 3을 출력한다.

또한, A = 10, B = 3, C = 4라고 하자. 그러면 10에서 3까지 숫자 중 4의 배수의 개수이므로 4, 8 총 2개가 존재한다. 따라서 2를 출력한다.

 

입력
첫 번째 줄에 A, B, C가 주어진다. (1 <= A, B, C <= 1000)

 

출력
A부터 B까지 숫자 중에서 C의 배수의 개수를 출력한다.

 

예제 입력
3 9 2
예제 출력
3*/