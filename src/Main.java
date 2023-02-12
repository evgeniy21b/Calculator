import java.util.Scanner;

public class Main {
    public static void main (String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String numbers = scan.nextLine();
        String[] splitNumbers = numbers.split(" ");
        if  (splitNumbers.length ==0) {
            throw new Exception("Неверное значениеа"); }
        if  (splitNumbers.length == 1){
            throw new Exception("Неверное значениеа"); }



        var lenNumbers = numbers.length();
        var num1 = splitNumbers[0];
        var num2 = splitNumbers[2];
        var operator = splitNumbers[1];



        int x = Integer.parseInt (num1);
        int y = Integer.parseInt (num2);



         if ((lenNumbers >= 7) || (lenNumbers <= 3))  {
            throw new Exception("Введенное значение неверно");
        }
        else if ((x > 10) | (y > 10)) {
            throw new Exception("Число не может быть больше 10");
        }
        else if ((x < 1) | (y < 1)) {
            throw new Exception("Число не может быть меньше 1");
        }
        else if (operator.equals("+")) {
            System.out.println(x + y);
        }
        else if (operator.equals("-")) {
            System.out.println(x - y);
        }
        else if (operator.equals("*")) {
            System.out.println(x * y);
        }

        else if (operator.equals("/")) {
            System.out.println(x / y);
        }
        else {
            throw new Exception("Неверное значение");
        }

    }
}