/*
At a local movie theater, the price of a ticket is based on the customer's age, as follows:

Ticket Prices by Age Group:

Child (under 12): $10
Teen (12–17): $12
Adult (18–64): $15
Senior (65 and above): $13
Customers also earn loyalty points each time they visit. The points can be used for discounts on ticket prices, as follows:

Points	Discount
0-99	No discount
100-199	5 percent
200-299	8 percent
300 or more	10 percent
For example, if a customer has 120 points, they get a 5 percent discount on their ticket price.

Write a program that calculates the price of a movie ticket. Your program's class should be named MovieTicket.
The program should prompt the user to enter their age and the number of loyalty points they have. Then, it should
display the base price of the ticket, the amount of discount (if any), and the final price.

The following sample run shows an example of the program's output. Pay close attention to the wording of the prompts
and other messages. Your program's prompts and messages must match these. Be sure to round all dollar amounts to 2 decimal points.

Sample Run with User Input Shown in <>

Enter your age: <25>
Enter your loyalty points: <150>
Base Ticket Price: $15.00
Discount Amount: $0.75
Final Price: $14.25

*/

import java.util.Scanner;


public class MovieTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Enter your loyalty points: ");
        int points = scanner.nextInt();


        double basePrice;

            if (age < 12) {
                basePrice = 10.00;
            } else if (age >= 12 && age <= 17) {
                basePrice = 12.00;
            } else if (age >= 18 && age <= 64) {
                basePrice = 15.00;
            } else {
                basePrice = 13.00;
            }

        double discount;

            if (points < 100) {
                discount = 0;
            } else if (points >= 100 && points <= 199) {
                discount =basePrice*.05;     //5 percent off
            } else if (points >= 200 && points <= 299) {
                discount =basePrice*.08;
            } else {
                discount =basePrice*.1;
            }

            double finalPrice = basePrice-discount;

        System.out.println("Base Ticket Price: " + basePrice+"$");
        System.out.println("Discount Amount: " + discount+"$");
        System.out.println("Final Price: "+ finalPrice+"$");



    }
}
