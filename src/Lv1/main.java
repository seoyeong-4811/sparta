package Lv1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNumber = 0;
        int secondNumber = 0;

        while (true) {
            while (true) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                firstNumber = sc.nextInt();
                System.out.print("두 번째 숫자를 입력하세요: ");
                secondNumber = sc.nextInt();
                if (firstNumber >= 0 && secondNumber >= 0) {
                    break;
                } else {
                    System.out.println("양의 정수가 아닙니다. 다시 입력해 주세요.");
                }
            }  //양의 정수(0포함) 값만 입력 할수 있도록 설정.

            sc.nextLine();
            System.out.print("사칙연산 기호를 입력하세요 (+, -, *, /): ");

            // 사칙연산 기호 입력
            String operator = sc.nextLine();
            if (operator.equals("+")) {
                int result = firstNumber + secondNumber;
                System.out.println("결과: " + result);
            } else if (operator.equals("-")) {
                int result = firstNumber - secondNumber;
                System.out.println("결과: " + result);
            } else if (operator.equals("*")) {
                int result = firstNumber * secondNumber;
                System.out.println("결과: " + result);
            } else if (operator.equals("/")) {
                if (secondNumber == 0) { //분모가 0인경우 조건 걸기
                    while (secondNumber == 0) {
                        System.out.println("0으로 나눌수 없습니다. 두 번째 숫자를 다시 입력하세요.:");
                        secondNumber = sc.nextInt();
                        sc.nextLine();
                    }

                    double result = (double) firstNumber / secondNumber;
                    System.out.println("결과: " + result);

                }
            }


            System.out.print("계산을 계속하시겠습니까? (exit 입력 시 종료 / enter 누르면 계속) ");
            String answer = sc.nextLine();
            if (answer.equals("exit")) {
                break;
            }

        } System.out.println("종료되었습니다");

    }

}