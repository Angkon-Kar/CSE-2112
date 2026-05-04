import java.util.Scanner;
public class CircleArea {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double PI = 3.14159;
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        double area = PI * radius * radius;
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
        sc.close();
   }
}