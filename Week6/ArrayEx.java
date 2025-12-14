package Week6;
import java.util.Scanner;


/**
 * Write a description of class ArrayEx here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayEx
{
    public static void main(String[] args)
    {
        int[] age; //array declaration
        age = new int[5]; //array construction
        
        age[0]=10; //initialization
        age[1]=20;
        age[2]=30;
        age[3]=40;
        age[4]=50;
        
        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]);
        System.out.println(age[3]);
        System.out.println(age[4]);
        
        int[] num = new int[5];
        int x=2;
        for(int i=0;i<num.length;i++)
        {
            //Scanner sc = new Scanner(System.in);
            num[i]=x;
            x+=2;
            System.out.println(num[i]);
        }
        
    }
}