package backjoon;

import java.util.Scanner;

public class bj_10430 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문제 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
		//입력값 첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)
		//출력값 첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
		//입력예시 5 8 4 
		//출력예시 1
		//출력예시 1
		//출력예시 0
		//출력예시 0
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 수 입력해주세요");
		int a = sc.nextInt();
		
		System.out.println("두번째 수 입력해주세요");
		int b = sc.nextInt();
		
		System.out.println("세번째 수 입력해주세요");
		int c = sc.nextInt();
		
		int first = (a+b)%c; 
		int second = ((a%c) + (b%c))%c;
		int third = (a*b)%c;
		int fourth = ((a%c) * (b%c))%c;
		
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		System.out.println(fourth);
		
	}

}
