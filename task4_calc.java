import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class task4_calc {
    
    private static final Logger LOGGER = Logger.getLogger(task4_calc.class.getName());
    
    static int scanNumber() {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        scan.close();
        LOGGER.log(Level.INFO,"User entered " + number);
        return number;
    }
// закрыли сканер
    
    static String scanOperations() {
        Scanner scan = new Scanner(System.in);
        String operations = scan.nextLine();
        LOGGER.log(Level.INFO,"User entered " + operations);
        return operations;

    }
    
    static int getResult(String opr, int num1, int num2) {
        int result = 0;
        switch (opr) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default: 
                System.out.println("Введите оператор: -, +, *, /");
                LOGGER.log(Level.WARNING,"User entered wrong operator");
                break;
        }
        LOGGER.log(Level.INFO,"Result is " + result);
        return result;

    }

    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        int num1 = scanNumber();
        System.out.println("Введите оператор: -, +, *, /");
        String operations = scanOperations();
        System.out.println("Введите второе число: ");
        int num2 = scanNumber();
        int result = getResult(operations, num1, num2);
        System.out.printf("%d %s %d = %d", num1, operations, num2, result);

    }

}
