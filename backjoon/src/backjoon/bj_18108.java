package backjoon;

import java.util.Scanner;

public class bj_18108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//서기연도를 불기연도로 바꾸려면 주어진 서기연도 값 + 544 
		//태국같은 일부 국가의 경우에는 543 년을 더한다
		//입력 : 서기 연도를 알아보고 싶은 불기 연도 y가 주어진다. (1000 ≤ y ≤ 3000)
		//출력 : 불기 연도를 서기 연도로 변환한 결과를 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("서기연도로 변환하고 싶은 불기연도를 입력해주세요");
		int fireyear = sc.nextInt(); //불기연도 입력
		
		int seogiyear = fireyear-543; //입력받은 불기연도 -543 
		
		
		System.out.println("변환된 연도는 :" +seogiyear+"년입니다");
		
	}

}
