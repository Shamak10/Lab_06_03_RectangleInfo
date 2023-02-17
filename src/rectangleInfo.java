import java.util.Scanner;
public class rectangleInfo {
    public static void main(String[] args) {//Creating scanner to take input from the user
        Scanner scanner = new Scanner(System.in);
        double length = 15;//It is asking for the value of length
        double width = 15;//It is asking for the value of width
        System.out.print("Enter the length:15 \n");
        System.out.print("Enter the width:15 \n");
        if (length <= 0 || width <= 0) {//Length and width cannot be less the zero
            System.err.println("Invalid input. It cannot be in a negative value.");
            //It is invalid if the value is less than zero
        } else {
            double area = length * width;// calculates the area of the rectangle
            double perimeter = 2 * (length + width);//calculates the perimeter of the rectangle
            double diagonal = Math.sqrt(length * length + width * width);//calculates the diagonal length
            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + perimeter);
            System.out.println("Diagonal length: " + diagonal);
        }
    }
}
