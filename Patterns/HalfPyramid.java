package patterns;

import java.util.Scanner;

public class HalfPyramid 
{
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the height of the pyramid");
            int height = sc.nextInt();
            for(int i=1;i<=height;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
    
}
