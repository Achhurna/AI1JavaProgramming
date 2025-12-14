package Week4;
import java.util.Scanner;


/**
 * Write a description of class Marks here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Marks
{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Input Percentage: ");
       int per = sc.nextInt();
       if((per>=95)&&(per<=100)){
           System.out.println("Distinction");
       }
       else if((per>=80)&&(per<=94)){
           System.out.println("First Division");
       }
       else if((per>=70)&&(per<=79)){
           System.out.println("Second Division");
       }
       else if((per>=50)&&(per<=69)){
           System.out.println("Third Division");
       }
       else if(per<49){
           System.out.println("FAIL");
       }
       else{
           System.out.println("Invalid");
       }
   }
}