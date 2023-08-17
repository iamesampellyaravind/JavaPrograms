package patterns;

import java.util.Scanner;

public class RectanglePattern {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the length of the rectangle");
            int length = sc.nextInt();
            System.out.println("Enter the bredth of the rectangle");
            int bredth = sc.nextInt();
            for(int i=1;i<=length;i++)
            {
                for(int j=1;j<=bredth;j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
