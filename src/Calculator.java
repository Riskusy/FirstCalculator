import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        start();

        while (true) {
            System.out.println("Input: ");
            String line = scanner.nextLine();

            if (line.equals("exit")) {
                exitCalc();
                break;
            }

            try {
                String[] symbols = line.split (" ");
                if (symbols.length != 3) throw new Exception("Неверное значение,калькулятор расчитан до 10, запустите калькулятор еще раз.");

                Number firstNumber = NumberRome.parseAndValidate(symbols[0]);
                Number secondNumber = NumberRome.parseAndValidate(symbols[2], firstNumber.getType());
                String result = Action.calculate(firstNumber, secondNumber, symbols[1]);
                System.out.println("Output: \n" + result);
            }catch (Exception e) {
                System.out.println(e.getMessage());
                exitCalc();
                break;
            }
        }

        scanner.close();
    }

    private static void start() {
        System.out.println("Калькулятор с арабскими и римскими цифрами от 1 до 10.");

    }

    private static void exitCalc() {
        System.out.println("Bye now");
    }

}
