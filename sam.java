import java.util.Scanner;

public class UnitConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Unit Converter");
            System.out.println("1. Length Converter");
            System.out.println("2. Temperature Converter");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    lengthConverter(scanner);
                    break;
                case 2:
                    temperatureConverter(scanner);
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }

    private static void lengthConverter(Scanner scanner) {
        System.out.print("Enter length in meters: ");
        double meters = scanner.nextDouble();
        System.out.println("Choose conversion unit:");
        System.out.println("1. Kilometers");
        System.out.println("2. Centimeters");
        System.out.println("3. Inches");
        int unitChoice = scanner.nextInt();

        switch (unitChoice) {
            case 1:
                System.out.printf("%.2f meters = %.2f kilometers%n", meters, meters / 1000);
                break;
            case 2:
                System.out.printf("%.2f meters = %.2f centimeters%n", meters, meters * 100);
                break;
            case 3:
                System.out.printf("%.2f meters = %.2f inches%n", meters, meters * 39.3701);
                break;
            default:
                System.out.println("Invalid unit choice.");
        }
    }

    private static void temperatureConverter(Scanner scanner) {
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.printf("%.2f Celsius = %.2f Fahrenheit%n", celsius, fahrenheit);
    }
}
