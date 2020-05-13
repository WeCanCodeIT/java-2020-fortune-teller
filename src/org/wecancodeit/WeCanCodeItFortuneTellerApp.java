package org.wecancodeit;


import java.util.Scanner;

public class WeCanCodeItFortuneTellerApp {

    public static void main(String[] args) {
        System.out.println("Hello, welcome to We Can Code IT's Fortune Teller Application!");

        Scanner input = new Scanner(System.in);

        String firstName = askForFirstName(input);

        String lastName = askForLastName(input);

        int userAge = askForUserAge(input);

        int userBirthMonth = askForUserBirthMonth(input);

        String favoriteColor = askForFavoriteColor(input);

        int siblingCount = askForSiblingCount(input);

        int yearsToRetirement = determineYearsToRetirement(userAge);

        String vacationHomeLocation = determineVacationHomeLocation(siblingCount);

        String modeOfTransportation = determineModeOfTransportation(favoriteColor);

        double bankBalance = determineBankBalance(userBirthMonth);

        System.out.println(determineFortune(firstName, lastName, yearsToRetirement, vacationHomeLocation, modeOfTransportation, bankBalance));
    }

    private static String determineFortune(String firstName, String lastName, int yearsToRetirement, String vacationHomeLocation, String modeOfTransportation, double bankBalance) {
        return firstName + " " + lastName + " will retire in " + yearsToRetirement + " years,\n" +
                "with $" + bankBalance + " in the bank,\n" +
                "a vacation home in "+ vacationHomeLocation +",\n" +
                "and travel by "+modeOfTransportation + ".";
    }

    private static String askForFirstName(Scanner input) {
        System.out.println("What is your first name:");
        return input.nextLine();
    }

    private static String askForLastName(Scanner input) {
        System.out.println("What is your last name:");
        return input.nextLine();
    }

    private static int askForUserAge(Scanner input) {
        System.out.println("What is your age:");
        return input.nextInt();
    }

    private static int askForUserBirthMonth(Scanner input) {
        System.out.println("What is your birth month number:");
        int userBirthMonth = input.nextInt();
        input.nextLine();
        return userBirthMonth;
    }

    private static String askForFavoriteColor(Scanner input) {
        System.out.println("What is your favorite ROYGBIV color, type HELP if you don't know the colors");
        String favoriteColor = input.nextLine();
        if (favoriteColor.equalsIgnoreCase("help")) {
            System.out.println("ROYGBIV stands for Red, Orange, Yellow, Green, Blue, Indigo, and Violet. Use one of these values.");
            favoriteColor = input.nextLine();
        }
        return favoriteColor;
    }

    private static int askForSiblingCount(Scanner input) {
        System.out.println("How many siblings do you have:");
        return input.nextInt();
    }

    private static int determineYearsToRetirement(int userAge) {
        int yearsToRetirement = 0;
        if (userAge % 2 == 0) {
            yearsToRetirement = 12;
        } else {
            yearsToRetirement = 14;
        }
        return yearsToRetirement;
    }

    private static String determineVacationHomeLocation(int siblingCount) {
        String vacationHomeLocation = "";
        if (siblingCount == 0) {
            vacationHomeLocation = "Boca Raton, FL";
        } else if (siblingCount == 1) {
            vacationHomeLocation = "Nassau, Bahamas";
        } else if (siblingCount == 2) {
            vacationHomeLocation = "Ponta Negra,Brazil";
        } else if (siblingCount == 3) {
            vacationHomeLocation = "Portland, Oregon";
        } else if (siblingCount > 3) {
            vacationHomeLocation = "Baton Rouge, LA";
        } else {
            vacationHomeLocation = "Chernobyl, Ukraine";
        }
        return vacationHomeLocation;
    }

    private static String determineModeOfTransportation(String favoriteColor) {
        String modeOfTransportation = "";
        switch (favoriteColor.toLowerCase()) {
            case "red":
                modeOfTransportation = "Maserati";
                break;
            case "orange":
                modeOfTransportation = "seven chihuahuas pulling a chariot.";
                break;
            case "yellow":
                modeOfTransportation = "school bus";
                break;
            case "green":
                modeOfTransportation = "Tesla";
                break;
            case "blue":
                modeOfTransportation = "Yugo";
                break;
            case "indigo":
                modeOfTransportation = "Honda Civic";
                break;
            case "violet":
                modeOfTransportation = "Mini Cooper";
                break;
            default:
                modeOfTransportation = "taxi cab";
        }
        return modeOfTransportation;
    }

    private static double determineBankBalance(int userBirthMonth) {
        double bankBalance = 0.0;
        if (userBirthMonth > 0 && userBirthMonth <= 4) {
            bankBalance = 256000.76;
        } else if (userBirthMonth > 4 && userBirthMonth <= 8) {
            bankBalance = 3687105.42;
        }else if (userBirthMonth> 8 && userBirthMonth<=12){
            bankBalance = 45.65;
        }
        return bankBalance;
    }
}
