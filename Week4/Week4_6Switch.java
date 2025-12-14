package Week4;
import java.util.Scanner;


/**
 * Write a description of class Week4_6Switch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Week4_6Switch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Marked Price:");
        double mp = sc.nextDouble();
        System.out.println("Input Category:");
        char ctg = sc.next().charAt(0);
        switch(ctg)
        {
            case 'A':
                double sp1 = (mp-(0.6d*mp));
                System.out.println("you got 60% Discount and Sp is: "+sp1);
                break;
            case 'B':
                double sp2 = (mp-(0.4d*mp));
                System.out.println("you got 40% Discount and Sp is: "+sp2);
                break;
            case 'C':
                double sp3 = (mp-(0.2d*mp));
                System.out.println("you got 20% Discount and Sp is: "+sp3);
                break;
            case 'D':
                double sp4 = (mp-(0.1d*mp));
                System.out.println("you got 10% Discount and Sp is: "+sp4);
                break;
            default:
                System.out.println("you got 0% Discount ");
        }
        
    }
}