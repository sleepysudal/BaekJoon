package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class bj_2588 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1번쨰수 입력해줘");
		int a= sc.nextInt(); // 1번째 입력받는 수 472
		
		System.out.println("2번째 수 입력해줘");
		int b = sc.nextInt(); //2번째 입력받는 수 385
		
		
		String num = Integer.toString(b);
		int[] arrNum = new int[num.length()];
		for (int i = 0; i < num.length(); i++) {
			arrNum[i] = num.charAt(i) - '0';
		}
		//System.out.println(Arrays.toString(arrNum)); // 3 ,8 ,5
		System.out.println(a*arrNum[2]); //472*5
		System.out.println(a*arrNum[1]); //472*8
		System.out.println(a*arrNum[0]); //472*3
		System.out.println(a*b); // 472*385 
		System.out.println(a*arrNum[2]+a*arrNum[1]*10+a*arrNum[0]*100);//3자리 2자리 1자리 다 계산해서 더함
	
		
	}

}
