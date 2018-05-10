import java.util.Scanner;

public class Problem02TriangleArea {
    public static void main(String[] args) {
        // Write a program that enters 3 points in the plane (as integer x and y coordinates),
        // calculates and prints the area of the triangle composed by these 3 points.
        // Round the result to a whole number.
        // In case the three points do not form a triangle, print "0" as result. Examples:
        //             Input  Output	  Input	 Output		 Input	Output
        // A (x, y)     -5 10 575         53 18   86          1 1     0
        // B (x, y)     25 30             56 23               2 2
        // C (x, y)     60 15             24 27               3 3

        System.out.println("Enter 3 points in the plane:");
        Scanner input = new Scanner(System.in);
        System.out.print("Ax = ");
        int aX = input.nextInt();
        System.out.print("Ay = ");
        int aY = input.nextInt();
        System.out.print("Bx = ");
        int bX = input.nextInt();
        System.out.print("By = ");
        int bY = input.nextInt();
        System.out.print("Cx = ");
        int cX = input.nextInt();
        System.out.print("Cy = ");
        int cY = input.nextInt();

        int triangleArea = Math.abs((aX * (bY - cY) + bX * (cY - aY) + cX * (aY - bY)) / 2);
        if (triangleArea == 0){
            System.out.println("The three points do not form a triangle.\nResult = 0");
        } else {
            System.out.println("The area of the triangle is " + triangleArea);
        }
    }
}
