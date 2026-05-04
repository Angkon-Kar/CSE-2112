import java.util.Scanner;
public class CircleArea {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the radius of the circle: ");
       double radius = sc.nextDouble();
       double area = Math.PI * radius * radius;
       System.out.println("The area of the circle with radius " + radius + " is: " + area);
   }
}

/*
Enter the radius of the circle: 5
The area of the circle with radius 5.0 is: 78.53981633974483
*/
