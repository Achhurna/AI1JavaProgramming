package Week2;
import java.util.Scanner;


/**
 * Write a description of class W2_5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class W2_5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input First Number:");
        int FirstNumber = sc.nextInt();
        System.out.println("Input Second Option:");
        int SecondNumber = sc.nextInt();
        int Sum = FirstNumber + SecondNumber;
        int Diff = FirstNumber - SecondNumber;
        int Mul = FirstNumber * SecondNumber;
        int Div = FirstNumber / SecondNumber;
        int Rem = FirstNumber % SecondNumber;
        System.out.println("Sum is: "+Sum+"\nDifference is: "+Diff+"\nMultiplication is: "+Mul+"\nDivision is: "+Div+"\nRemainder is: "+Rem);
    }
}