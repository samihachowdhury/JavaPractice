package com.company;

import java.util.Scanner;

public class inputValidation {

    // Prompt player and validate their input;

    public static String prompt(String message, Scanner scannerObject, String... validInputs) {

        String playerInput = "";
        boolean isValid = false;

        // Check if player enters some input
        do {
            // Prompt for input
            System.out.print(message);

            // Check if user enters any input
            if (scannerObject.hasNextLine()) {
                playerInput = scannerObject.nextLine();

                if (validInputs.length > 0) {
                    isValid = checkSpecific(playerInput, validInputs);
                } else {
                    isValid = checkDefault(playerInput);
                }
            }
        } while (!isValid);

        return playerInput;
    }

    public static String promptln(String message, Scanner scannerObject, String... validInputs) {

        String playerInput = "";
        boolean isValid = false;

        // Check if the user enters some input
        do {
            // Prompt the user  for input
            System.out.println(message);

            // Check if user enters any input
            if (scannerObject.hasNextLine()) {
                playerInput = scannerObject.nextLine();

                if (validInputs.length > 0) {
                    isValid = checkSpecific(playerInput, validInputs);
                } else {
                    isValid = checkDefault(playerInput);
                }
            }
        } while (!isValid);

        return playerInput;
    }

    public static int promptlnInt(String message, Scanner scannerObject, int... validInputs) {

        int playerInput = 0;
        boolean isValid = false;

        // Check if user enters some input
        do {
            // Prompt user for input
            System.out.println(message);

            // Check if the user  enters any input
            if (scannerObject.hasNextInt()) {
                playerInput = scannerObject.nextInt();

                if (validInputs.length > 0) {
                    isValid = checkSpecificInt(playerInput, validInputs);
                } else {
                    isValid = checkDefaultInt(playerInput);
                }
            }
            scannerObject.nextLine();
        } while (!isValid);

        return playerInput;
    }


    public static boolean checkSpecific(String playerInput, String... validInputs) {
        boolean isValid = false;


        for (String entry : validInputs) {
            if (playerInput.equals(entry)) {
                isValid = true;
                break;
            }
        }

        return isValid;
    }

    public static boolean checkSpecificInt(int playerInput, int... validInputs) {
        boolean isValid = false;

        if (validInputs.length == 1) {
            if (playerInput >= validInputs[0]) {
                isValid = true;
            }
        } else if (validInputs.length == 2) {
            if ((playerInput >= validInputs[0]) && (playerInput <= validInputs[1])) {
                isValid = true;
            }
        }
        return isValid;
    }

    public static boolean checkDefault(String playerInput) {
        boolean isValid = false;

        for (int i = 0; i < playerInput.length(); i++) {
            Character character = playerInput.charAt(i);

            // Non-alphanumeric characters except
            // space ' ' and dash '-' are not allowed
            if (!Character.isLetterOrDigit(character) && !character.equals(' ') && !character.equals('-')) {
                isValid = false;
                break;
                // The first character cant be a space or a dash
            } else if ((i == 0) && (character.equals(' ') || character.equals('-'))) {
                isValid = false;
                break;
            } else {
                isValid = true;
            }
        }

        return isValid;
    }

    public static boolean checkDefaultInt(int playerInput) {
        boolean isValid = false;

        if (playerInput >= 0) {
            isValid = true;
        }

        return isValid;
    }
}