package Lv2;


import java.util.ArrayList;
import java.util.List;

public class Calculator {

        private List<Double> results; // 결과를 저장하는 필드

        public Calculator() {
            results = new ArrayList<>(); //생성자
        }


        public double calculate(String operator, int firstNumber, int secondNumber) {
            double answer = 0;

            if (operator.equals("+")) {
                answer = firstNumber + secondNumber;
            } else if (operator.equals("-")) {
                answer = firstNumber - secondNumber;
            } else if (operator.equals("*")) {
                answer = firstNumber * secondNumber;
            } else if (operator.equals("/")) {
                if (secondNumber == 0) {
                    throw new ArithmeticException("0으로 나눌 수 없습니다.");
                }
                answer = (double)firstNumber / secondNumber;
            }

            // 결과를 리스트에 저장
            results.add(answer);

            return answer;
        }

        // 결과를 반환하는 메서드
        public List<Double> getResults() {
            return results;
        }

        // 결과를 설정하는 메서드 (리스트를 새로 설정)
        public void setResults(List<Double> results) {
            this.results = results;
        }

        // 가장 먼저 저장된 데이터를 삭제하는 메서드
        public void removeResult() {
            if (!results.isEmpty()) {
                results.remove(0);
            } else {
                System.out.println("삭제할 결과가 없습니다.");
            }
        }
    }

