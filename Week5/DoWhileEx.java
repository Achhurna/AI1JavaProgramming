package Week5;
import java.util.Scanner;


/**
 * Write a description of class DoWhileEx here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DoWhileEx
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        int quantity;
        int total=0;
        do
        {
            System.out.println("Resturant - Menu");
            System.out.println("1 : Burger Rs200");
            System.out.println("2 : Pizza Rs300");
            System.out.println("1 : MoMo Rs100");
            System.out.println("0 : Bill Print");
            
            System.out.println("Input your Choice");
            choice=sc.nextInt();
            switch(choice){
                case 1:System.out.println("You choose Burger");
                       System.out.println("Enter your Quantity");
                       quantity=sc.nextInt();
                       total+=200*quantity;
                       break;
                case 2:System.out.println("You choose Pizza");
                       System.out.println("Enter your Quantity");
                       quantity=sc.nextInt();
                       total+=300*quantity;
                       break;
                case 3:System.out.println("You choose Momo");
                       System.out.println("Enter your Quantity");
                       quantity=sc.nextInt();
                       total+=100*quantity;
                       break;
                case 0:
                       System.out.println("total is "+total);
                       break;
                default:
                        System.out.println("Not in Menu");
            }
        }
        while(choice!=0);
    }
}