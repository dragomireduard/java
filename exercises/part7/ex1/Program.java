package part7.ex1;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int first = 0;
        int second = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            switch (command) {
                case "add":

                        if (first + amount <= 100) {
                            first += amount;
                        } else {
                            first = 100;
                        }

                    break;
                case "move":

                    if (amount <= 0 || first == 0) {
                        return;
                    }

                    if (first - amount < 0) {
                        amount = first;
                    }

                    if (amount >= 100) {
                        first = 0;
                        second = 100;

                    } else if (second + amount <= 100) {
                        second += amount;
                        first -= amount;
                    } else if (amount + second > 100 && amount + first > 100) {

                        second = 100;

                        first = 0;
                    }

                    break;
                case "remove":

                    if (amount <= 0) {
                        return;
                    }

                    if (amount > second) {
                        amount = 0;
                    } else {
                        second -= amount;
                    }

                    break;
                default:
                    System.out.println("Unknown command");
            }
        }

    }
}
