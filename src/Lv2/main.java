package Lv2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);

        while (true) {
            int firstNumber;
            int secondNumber;

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
            String operator = sc.nextLine();

            try {
                double result = calculator.calculate(operator, firstNumber, secondNumber);
                System.out.println("결과: " + result);
            }catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            } //예외처리


            System.out.print("계산을 계속하시겠습니까? (exit 입력 시 종료 / enter 누르면 계속 ) ");
            String answer = sc.nextLine();
            if (answer.equals("exit")) {
                break;
            }
        }
        System.out.println("종료되었습니다");

        System.out.print("결과를 삭제하시겠습니까?");
        System.out.print("'remove' 입력 시, 가장 먼저 저장된 결과 값이 삭제됩니다.");
        String action = sc.nextLine();
        if (action.equals("remove")){
            calculator.removeResult();
            System.out.println("가장 먼저 저장된 결과가 삭제되었습니다.");
        }


    }
}







