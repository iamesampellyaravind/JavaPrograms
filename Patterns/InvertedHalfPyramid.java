package patterns;

import java.util.Scanner;

public class InvertedHalfPyramid 
{
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the height of the pyramid ");
            int height = sc.nextInt();
            for(int i=1;i<=height;i++)
            {
                for(int j=height;j>=i;j--)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }   
    }
}
