package Week6;
import java.util.Scanner;


/**
 * Write a description of class UserInputArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UserInputArray
{
    public static void main(String[] args)
    {
        //int index;
        Scanner sc= new Scanner(System.in);
        System.out.println("Input sixe of Array: ");
        int size = sc.nextInt(); 
        sc.nextLine();
        String[] names= new String[size];
        for(int i=0;i<names.length;i++)
        {
            System.out.println("enter name of stu: ");
            names[i]=sc.nextLine();
            
        }
        
        for(int j=0;j<size;j++)
        {
            System.out.println(names[j]);
        }
    }
}