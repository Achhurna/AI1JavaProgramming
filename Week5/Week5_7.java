package Week5;
import java.util.Scanner;


/**
 * Write a description of class Week5_7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Week5_7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a num");
        int n =sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }
}