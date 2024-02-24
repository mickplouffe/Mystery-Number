import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.showMenu();
    }

    public void showMenu() {
        int choice = 0;
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.println("Welcome to guess the number!");
            System.out.println("Rules: ");
            System.out.println("You have to guess a number between 1 and the maximum number");
            System.out.println("If you guess the number correctly, you win!");
            System.out.println("If you guess the number incorrectly, you will get a hint!\n");

            System.out.println("--- Menu ---");
            System.out.println("1. Start a game of guess the number on easy mode (1-10)");
            System.out.println("2. Start a game of guess the number on normal mode (1-100)");
            System.out.println("3. Start a game of guess the number on hard mode (1-1000)");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            try
            {
                choice = scanner.nextInt();
            }
            catch (NumberFormatException e)
            {
                System.out.println("Invalid choice!");
                scanner.nextLine(); // consume the newline character
            }

            if (choice == 1)
            {
                startGame(10);
            }
            else if (choice == 2)
            {
                startGame(100);
            }
            else if (choice == 3)
            {
                startGame(1000);
            }
            else if (choice == 4)
            {
                break;
            }
            else
            {
                System.out.println("Invalid choice!");
            }
        }
    }

    public void startGame(int max) {
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        int number = (int) (Math.random() * max) + 1;

        while (true)
        {
            System.out.print("Guess the number between 1 and " + max + ": ");

            try
            {
                choice = scanner.nextInt();
            }
            catch (NumberFormatException e)
            {
                System.out.println("Invalid choice!");
                scanner.nextLine(); // consume the newline character
            }

            if (choice == number)
            {
                System.out.println("You win!");
                break;
            }
            else if (choice < 1 || choice > max)
            {
                System.out.println("Invalid guess!");
            }
            else
            {
                if (choice < number)
                {
                    System.out.println("Too low!");
                }
                else
                {
                    System.out.println("Too high!");
                }
            }
        }

        while (true)
        {
            System.out.println("Do you want to play again? (yes = 1/No = 0)");

            try
            {
                choice = scanner.nextInt();
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid choice!");
                scanner.nextLine(); // consume the newline character
            }

            if (choice == 1)
            {
                startGame(max);
                break;
            }
            else if (choice == 0)
            {
                break;
            }
            else
            {
                System.out.println("Invalid choice!");
            }
        }
    }
}