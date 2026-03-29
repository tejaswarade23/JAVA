package org.FileHandling;

import java.util.*;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FileHandling obj = new FileHandling();

        int choice = 0;

        do {
            try {
                System.out.println("\n===== CLASS GENERATOR MENU =====");
                System.out.println("1. Enter Class Name");
                System.out.println("2. Add Field");
                System.out.println("3. Add Method");
                System.out.println("4. Generate Class File");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");

                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    case 1:
                        System.out.print("Enter Class Name: ");
                        obj.setClassName(sc.nextLine());
                        break;

                    case 2:
                        System.out.print("Enter Field: ");
                        obj.addField(sc.nextLine());
                        break;

                    case 3:
                        System.out.println("Enter Method (type END to finish):");

                        String method = "";
                        String line;

                        while (true) {
                            line = sc.nextLine();
                            if (line.equalsIgnoreCase("END")) break;
                            method += line + "\n";
                        }

                        obj.addMethod(method);
                        break;

                    case 4:
                        obj.generateClassFile(); // ⭐ Important change
                        break;

                    case 5:
                        System.out.println("Program Ended!");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }

            } catch (InputMismatchException e) {
                System.out.println("Enter valid number!");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (choice != 5);

        sc.close();
    }
}