import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Main.calc();
    }

    public static void calc() throws Exception {
        Scanner scan = new Scanner(System.in);
        String numbers = scan.nextLine();
        String[] splitNumbers = numbers.split(" ");
        if (splitNumbers.length == 0) {
            throw new Exception("Неверное значение");
        }
        if (splitNumbers.length == 1) {
            throw new Exception("Неверное значение");
        }



        var num1 = splitNumbers[0];
        var num2 = splitNumbers[2];
        var operator = splitNumbers[1];


        int x = Integer.parseInt(num1);
        int y = Integer.parseInt(num2);


        if (1 <= x && x <= 10 && 1 <= y && y <= 10) {
            if (operator.equals("+")) {
                System.out.println(x + y);
            } else if (operator.equals("-")) {
                System.out.println(x - y);
            } else if (operator.equals("*")) {
                System.out.println(x * y);
            } else if (operator.equals("/")) {
                System.out.println(x / y);
            } else {
                throw new Exception("Неверное значение");
            }

        } else {
            throw new Exception("Неверное значение");
        }
    }
}