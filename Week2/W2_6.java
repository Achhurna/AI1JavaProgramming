package Week2;
import java.util.Scanner;


/**
 * Write a description of class W2_6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class W2_6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Level of water in Litre: ");
        int Level = sc.nextInt();
        System.out.println("Level of water is: "+Level);
        String Message = (Level>=1000)?"WARNING":"NORMAL";
        System.out.println("Status: "+Message);
    }
}