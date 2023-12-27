package backjoon;

import java.util.Scanner;

public class bj_10869 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); //첫번째 수 입력
		int b = sc.nextInt(); //두번째 수 입력
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b); //몫
		System.out.println(a%b); //나머지
	}

}
