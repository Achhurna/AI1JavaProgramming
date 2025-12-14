package Week4;
import java.util.Scanner;


/**
 * Write a description of class Week4_6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Week4_6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Marked Price:");
        double mp = sc.nextDouble();
        System.out.println("Input Category:");
        char ctg = sc.next().charAt(0);
        if(ctg=='A'){
            double sp = (mp-(0.6d*mp));
            System.out.println("you got 60% Discount and Sp is: "+sp);
        }
        else if(ctg=='B'){
            double sp = (mp-(0.4d*mp));
            System.out.println("you got 40% Discount and Sp is: "+sp);
        }
        else if(ctg=='C'){
            double sp = (mp-(0.2d*mp));
            System.out.println("you got 20% Discount and Sp is: "+sp);
        }
        else if(ctg=='D'){
            double sp = (mp-(0.1d*mp));
            System.out.println("you got 10% Discount and Sp is: "+sp);
        }
        else{
            System.out.println("you got 0% Discount");
        }
    }
}