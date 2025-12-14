package Week4;
import java.util.Scanner;


/**
 * Write a description of class CalculatorSwitch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CalculatorSwitch
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a First Number");
        int num1 = sc.nextInt();
        System.out.println("Input a Second Number");
        int num2 = sc.nextInt();
        System.out.println("Input an Operator");
        char op = sc.next().charAt(0);
        switch(op)
        {
            case '+':
                System.out.println("Addition is : "+(num1+num2));
                break;
            case '-':
                System.out.println("Subtraction is : "+(num1+num2) );
                break;
            case '*':
                System.out.println("Multiplication is : "+(num1+num2));
                break;
            case '/':
                System.out.println("Divide is : "+(num1+num2));
                break;
            default:
                System.out.println("Invalid");
        }
    }
}