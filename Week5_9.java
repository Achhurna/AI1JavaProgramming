package Week5;
import java.util.Scanner;

/**
 * Write a description of class Week5_9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Week5_9
{
    public static void main(String[] args)
    {
       /*Scanner sc = new Scanner(System.in);
       System.out.println("Input a number");
       int n = sc.nextInt();*/
       for(int i=1; i<=100; i++){
           if(i%2==0){
               continue;
            }
               if(i%13==0){
                   System.out.println(i+" is divisible by 13");
                break;
            }

       }
    }
}