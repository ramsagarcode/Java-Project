package org.com;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        HotelBill hotelBill = new HotelBill();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to our hotel!");
        boolean continueAddingItems = true;
        while (continueAddingItems) {
            System.out.print("Enter item name: ");
            String itemName = scanner.nextLine();
            System.out.print("Enter item price: ");
            double itemPrice = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character
            hotelBill.addItem(new Item(itemName,itemPrice));

            System.out.print("Do you want to add more items? (yes/no): ");
            String choice = scanner.nextLine();
            continueAddingItems = choice.equalsIgnoreCase("yes");
        }

        System.out.println("\nGenerating bill...\n");
        hotelBill.genrateBill();

        System.out.println("\nThank you for staying with us!");
        scanner.close();
}}
