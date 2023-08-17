package patterns;

import java.util.Scanner;

public class HallowRectangle
{
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the height of the rectangle ");
            int height = sc.nextInt();
            System.out.println("Enter the bredth of the rectangle ");
            int bredth = sc.nextInt();
            for(int i=1;i<=height;i++)
            {
                if(i==1 || i==height)
                {
                    for(int j=1;j<=bredth;j++)
                    {
                        System.out.print("*");
                    }
                }
                else
                {
                    for(int j=1;j<=bredth;j++)
                    {
                        if(j==1||j==bredth)
                        {
                            System.out.print("*");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            }
        }
        
    }
}

