import java.util.Scanner;
public class RectangleArea {
    public static void main(String[] args) {
        Scanner umesh = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length = umesh.nextDouble();
        System.out.print("Enter width: ");
        double width =umesh.nextDouble();
        
        double area = length * width;
        System.out.println("Area of the rectangle: " + area);
    }
}