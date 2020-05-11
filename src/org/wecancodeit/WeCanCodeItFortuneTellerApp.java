package org.wecancodeit;


import java.util.Scanner;

public class WeCanCodeItFortuneTellerApp {

    /*
     * Part 1
     DONE - Ask the user for the user’s first name.
     DONE - Ask the user for the user’s last name.
    Ask the user for the user’s age.
    Ask the user for the user’s birth month (as an 'int').
    Ask the user for the user’s favorite ROYGBIV color.
        If the user does not know what ROYGBIV is, ask the user to enter “Help” to get a list of the ROYGBIV colors.
    Ask the user for the user's number of siblings.
     */
    public static void main(String[] args) {
	    System.out.println("Hello, welcome to We Can Code IT's Fortune Teller Application!");

        Scanner input = new Scanner(System.in);

        System.out.println("What is your first name:");
        String firstName = input.nextLine();
        System.out.println("Your first name is " + firstName);

        System.out.println("What is your last name:");
        String lastName = input.nextLine();
        System.out.println("Your last name is " + lastName);

        System.out.println("What is your age:");
        int userAge = input.nextInt();
        System.out.println("Your age is " + userAge);

        System.out.println("What is your birth month number:");
        int userBirthMonth = input.nextInt();
        input.nextLine();
        System.out.println("Your birth month is " + userBirthMonth);

        System.out.println("What is your favorite ROYGBIV color, type HELP if you don't know the colors");
        String favoriteColor = input.nextLine();
        System.out.println("Your favorite color is " + favoriteColor);

        System.out.println("How many siblings do you have:");
        int siblingCount = input.nextInt();
        System.out.println("You have " + siblingCount + " siblings.");
    }
}
