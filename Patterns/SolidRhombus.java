import java.util.Scanner;

public class SolidRhombus
{
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the height of rhombus");
            int height = sc.nextInt();
            for(int i=1;i<=height;i++)
            {
                for(int space=height;space>=i;space--)
                {
                    System.out.print(" ");
                }
                for(int j=1;j<=height;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        
    }
}