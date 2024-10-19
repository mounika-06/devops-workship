import java.util.Scanner;

public class CountdownTimer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter countdown time in seconds: ");
        int countdownTime = scanner.nextInt();

        for (int i = countdownTime; i >= 0; i--) {
            System.out.println("Time remaining: " + i + " seconds");
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Countdown interrupted");
            }
        }

        System.out.println("Countdown complete!");
        scanner.close();
    }
}
