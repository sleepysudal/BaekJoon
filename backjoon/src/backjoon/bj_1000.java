package backjoon;

import java.util.Scanner;

public class bj_1000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 정수를 입력해주세요");
		int a = sc.nextInt();
		System.out.println("두번째 정수를 입력해주세요");
		int b = sc.nextInt();
		
		int c=a+b;
		
		System.out.println("두 정수를 더한 값은 "+ c +"입니다");
		
	}

}
