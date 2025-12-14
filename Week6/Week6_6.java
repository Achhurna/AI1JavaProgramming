package Week6;
import java.util.Scanner;


/**
 * Write a description of class Week6_6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Week6_6
{
    public static void main(String[]a)
    {
        Scanner sc=new Scanner(System.in);
        int mat[][]=new int[2][2];
        for(int i=0;i<2;i++)
        {
            for(int j=0; j<2;j++)
            {
                System.out.println("Enter marks of["+i+"] student of["+j+"] subject: ");
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("\n VALUE IDISPLAYING IN MATRIX FORM\n");
        for(int i=0; i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(mat[i][j]+"  ");
            }
            System.out.println("\n");
        }
    }
}