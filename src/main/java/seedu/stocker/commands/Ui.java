package seedu.stocker.commands;

import java.util.Scanner;

public class Ui {

    public Ui() {

    }

    public void printversion1Help(){
        System.out.println("Here are a list of possible commands");
        System.out.println("1. add - Add a drug into the system");
        System.out.println("2. delete - Remove a drug from the system");
        System.out.println("3. list - List all current drugs in the system");
        System.out.println("4. find - Find a specific drug in the system");
        System.out.println("5. help - List all available commands");

        System.out.println();
        System.out.println();

        System.out.println("Here is the formatting for the commands");

        System.out.println("For add:");
        System.out.println("add /n <drug name> /d <expiry date> /q <quantity>");
        System.out.println();

        System.out.println("For delete:");
        System.out.println("delete /n <drug name>");
        System.out.println();


        System.out.println("For list:");
        System.out.println("list");
        System.out.println();


        System.out.println("For find:");
        System.out.println("find <keyword>");
        System.out.println();


        System.out.println("For help:");
        System.out.println("help");

    }

    public void uiBegin() {
        Scanner input = new Scanner(System.in);
        String instruction = input.next();

        while(instruction.equals("bye") != true) {
            switch (instruction) {
            case "help":
                printversion1Help();
                instruction = input.next();
                break;

            default:
                instruction = input.next();

            }
        }
        System.out.println("Bye! See you soon!");
    }
}