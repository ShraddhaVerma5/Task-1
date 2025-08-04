import java.util.*;
public class Calculator {

    public static double add(double a, double b){
        return a+b;
    }
    public static double sub(double a, double b){
        return a-b;
    }
    public static double mul(double a, double b){
        return a*b;
    }
    public static double div(double a, double b){
        if(b==0){
            System.out.println("Cannot devide by 0");
            return 0;
        }
        return a/b;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            // Step 1: Input first number or "exit"
            System.out.print("Enter first number (or type 'exit' to quit): ");
            String input1 = sc.next();
            if (input1.equalsIgnoreCase("exit")) {
                System.out.println("Calculator closed.");
                System.exit(0);
            }
            double a = Double.parseDouble(input1);

            System.out.println("Enter the Operator:");
            char operator = sc.next().charAt(0);

            System.out.print("Enter first number (or type 'exit' to quit): ");
            String input2 = sc.next();
            if (input1.equalsIgnoreCase("exit")) {
                System.out.println("Calculator closed.");
                System.exit(0);
            }
            double b = Double.parseDouble(input2);

            double result =0;
            boolean valid =true;

            switch (operator) {
                case '+':
                    result = add(a,b);
                break;

                case '-':
                    result = sub(a,b);
                    break;

                case '*':
                    result = mul(a,b);
                    break;

                case '/':
                    result = div(a,b);
                    break;

                default:
                    System.out.println("Invalid Operator");
                    valid = false;
            }

            if(valid){
                System.out.print("Result:"+result);
            }
            System.out.println();

        }
    }
}