package Week6;
import java.util.Scanner;


/**
 * Write a description of class MAtrix here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MAtrix
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int [][] matrix = new int[2][2];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0; j<matrix[i].length;j++)
            {
                System.out.println("enter data of["+i+"] and ["+j+"]matrix:");
                matrix[i][j]= sc.nextInt();
            }
            
        }
        for(int x=0;x<matrix.length;x++)
            {
                for(int y=0;y<matrix[x].length;y++)
                {
                    System.out.print(matrix[x][y]+"       ");
                }
                System.out.println();
            }
    }
}