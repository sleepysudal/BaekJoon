package backjoon;

import java.util.Scanner;

public class bj_1000up {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 정수를 입력해주세요");
        int a = sc.nextInt();

        // a가 0보다 큰지 확인
        if (a > 0) {
            System.out.println("두번째 정수를 입력해주세요");
            int b = sc.nextInt();

            // b가 10보다 큰지 확인
            if (b > 10) {
                int c = a + b;
                System.out.println("두 정수를 더한 값은 " + c + "입니다");
            } else {
                System.out.println("두번째 정수는 10보다 커야 합니다");
            }
        } else {
            System.out.println("첫번째 정수는 0보다 커야 합니다");
        }

        sc.close(); // Scanner를 닫아서 자원 누수를 방지합니다
    }

}
