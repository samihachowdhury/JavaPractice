package com.company;

import java.util.Random;
import java.util.Scanner;

public class Flow {

    public static void flow() {

        System.out.println("Running flow()\n");
        AsciiChars.printChars();
        Scanner scannerObject = new Scanner(System.in);

        // String object used for input
        String prompt = new String();

        // user's name prompt
        prompt = "Please enter your name: ";
        System.out.print(prompt);
        String name = scannerObject.next();

        System.out.printf("Hello %s!", name);
        System.out.println("Would you like some numbers?\n(Enter 'yes' or 'y' to run numbers().)\n");
        String start = scannerObject.next();

        // Check user input
        if (start.equals("yes") || start.equals("y")) {
            int i;
            do {
                numbers();
                System.out.println("Would you like more numbers?\n(Enter 'yes' or 'y' to run numbers().)");
                String response = scannerObject.nextLine();
                if (response.equals("yes") || response.equals("y")) {
                    System.out.println("Thanks for playing!");
                    break;
                } else {
                    i = -1;
                }
            } while (i > -1);
        } else {
            System.out.println("Goodbye!\n***\nStopping flow()");
            System.exit(0);
        }
    }

    // Gets user inputs
    // then calculate lottery numbers
    public static void numbers() {
        System.out.println("\nRunning numbers()\n---");

        Scanner scannerObject = new Scanner(System.in);
        String prompt = new String();

        System.out.println("Do you have a red car?\n(Enter 'yes' or 'no'.)");
        String hasRedCar = scannerObject.nextLine();

        System.out.println("What is the name of favorite pet?");
        String petName = scannerObject.nextLine();

        System.out.println("How old is your favorite pet?\n (Enter a whole human year.)");
        int petAge = scannerObject.nextInt();

        System.out.println("What is your lucky number?\n (Enter a positive whole number.)");
        int luckyNumber = scannerObject.nextInt();

        System.out.println("Do you have a favorite quarterback? If so, what is their jersey number?" +
                "\n (Enter a positive whole number or '-1')");
        int jerseyNumber = scannerObject.nextInt();

        System.out.println("What is the two-digit model year of your car?" +
                "\n (e.g. 2001 -> '01'; 1973 -> '73'; Enter -1 if this does not apply to you.)");
        int carNumber = scannerObject.nextInt();

        System.out.println("What is the first name of your favorite actor?");
        String actorName = scannerObject.nextLine();

        System.out.println("Enter a random number between 1 and 50?\n (Enter a whole number.)");
        int randomNumber = scannerObject.nextInt();

        // Generate output
        int[] ticket = new int[6];

        // Random numbers
        Random rand = new Random();
        int x1 = rand.nextInt(10 * hasRedCar.length());
        int x2 = rand.nextInt(10 * hasRedCar.length());
        int x3 = rand.nextInt(10 * hasRedCar.length());
        int[] x = {x1, x2, x3};
        int y;

        // Magic ball:
        // jersey/lucky number
        y = x[rand.nextInt(3)];
        int base = -1;
        if (jerseyNumber == -1) {
            base = luckyNumber;
        } else {
            base = (y % 2) * jerseyNumber + (y % 2) * luckyNumber;
        }
        ticket[0] = (base * y) % (75 + 1);

        // Pet/actor number
        if (petName.length() >= 3) {
            ticket[1] = petName.charAt(2) % 65;
        } else {
            ticket[1] = (actorName.charAt(0) * actorName.charAt(actorName.length() - 1)) % 65;
        }

        // Car/lucky number
        if (carNumber < 0) {
            carNumber = luckyNumber;
        }
        ticket[2] = (carNumber + luckyNumber) % (65 + 1);

        // Random number
        y = x[rand.nextInt(3)];
        ticket[3] = randomNumber - y;

        // 42/pet age/car number
        ticket[4] = (42 + petAge + carNumber) % (65 + 1);

        // jersey/pet age/lucky number
        ticket[5] = (jerseyNumber + petAge + luckyNumber) % (65 + 1);

        System.out.printf("\nLottery numbers: %d %d %d %d %d Magic ball: %d", ticket[1],
                ticket[2], ticket[3], ticket[4], ticket[5], ticket[0]);
        System.out.println("\n---\nStopping numbers()");
    }
}