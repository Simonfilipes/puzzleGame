import java.util.Scanner;

public class Main {

    public static void clearConsole() {
        // Código ANSI para limpar a tela
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int error = 0;

        while (true) {

            try {

                clearConsole();

                if (error == 1) {
                    System.out.println("You must have written something wrong.");
                    System.out.println("Check your input and try again.");
                    System.out.println();

                    error = 0;
                }

                System.out.println("Welcome to my calculator!");

                System.out.println();

                System.out.println("[1] - Sum");
                System.out.println("[2] - Subtract");
                System.out.println("[3] - Exit");

                System.out.println();

                System.out.print("Your answer: ");

                long choose = scanner.nextInt();
                scanner.nextLine();

                if (choose == 3) {
                    clearConsole();

                    System.out.println("Thanks for enjoying!");
                    System.out.println();

                    break;
                }

                if (choose != 1 && choose != 2 && choose != 3) {
                    clearConsole();

                    System.out.println("Chek your answer, you must have written something wrong.");
                    System.out.println();
                    break;
                }

                clearConsole();

                System.out.println("Now, choose the two numbers for sum or subtract.");

                System.out.println();

                System.err.print("First number: ");
                long num1 = scanner.nextInt();
                scanner.nextLine();
                System.err.print("Secont number: ");
                long num2 = scanner.nextInt();
                scanner.nextLine();

                clearConsole();

                long r = 0;

                if (choose == 1) {
                    r = num1 + num2;
                }
                if (choose == 2) {
                    r = num1 - num2;
                }

                System.out.println("Your answer is: " + r);

                System.out.println();

                System.out.println("You just need to write yes ou no!");
                System.out.print("Do you wanna continue? ");
                String exit = scanner.nextLine().trim();

                if (exit.equals("yes")) {
                } else if (exit.equals("no")) {
                    clearConsole();

                    System.out.println("Thanks for enjoying!");
                    System.out.println();

                    break;
                } else {
                    clearConsole();

                    System.out.println("Chek your answer, you must have written something wrong.");
                    System.out.println();
                    break;
                }

                clearConsole();

            } catch (Exception e) {
                clearConsole();

                System.out.println("An error occurred: " + e.getMessage());

                error = 1;

                scanner.nextLine(); // Limpa o buffer do scanner
            }

        }

        scanner.close();

    }
}