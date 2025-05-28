import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();

        while (true) {
            System.out.println("\n===== Menu =====");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = sc.nextInt();
            sc.nextLine();

            if (option == 1) {
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                sc.nextLine();
                System.out.print("Enter color: ");
                String color = sc.nextLine();
                System.out.print("Is it filled (true/false)? ");
                boolean filled = sc.nextBoolean();

                circle = new Circle(r, color, filled);
                System.out.println("Radius: " + circle.getRadius());
                System.out.println("Area: " + circle.getArea(r));
                System.out.println("Perimeter: " + circle.getPerimeter(r));
                System.out.println(circle.toString());

            } else if (option == 2) {
                System.out.print("Enter width: ");
                double w = sc.nextDouble();
                System.out.print("Enter length: ");
                double l = sc.nextDouble();
                sc.nextLine();
                System.out.print("Enter color: ");
                String color = sc.nextLine();
                System.out.print("Is it filled (true/false)? ");
                boolean filled = sc.nextBoolean();

                rectangle = new Rectangle(w, l, color, filled);
                System.out.println("Width: " + rectangle.getWidth());
                System.out.println("Length: " + rectangle.getLength());
                System.out.println("Area: " + rectangle.getArea(w, l));
                System.out.println("Perimeter: " + rectangle.getPerimeter(w, l));
                System.out.println(rectangle.toString());

            } else if (option == 3) {
                System.out.print("Enter side: ");
                double side = sc.nextDouble();
                sc.nextLine();
                System.out.print("Enter color: ");
                String color = sc.nextLine();
                System.out.print("Is it filled (true/false)? ");
                boolean filled = sc.nextBoolean();

                square = new Square(side, color, filled);
                System.out.println("Side: " + square.getSide());
                System.out.println("Area: " + square.getArea(side, side));
                System.out.println("Perimeter: " + square.getPerimeter(side, side));
                System.out.println(square.toString());

            } else if (option == 4) {
                System.out.println("Thanks for using the program. Bye!");
                break;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        sc.close();
    }
}
