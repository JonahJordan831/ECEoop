/*
Goal: Use the switch statement to print output conditionally.

        Assignment: When a web server receives a request from a client, the server sends back a response code that
         indicates the success or failure of the request. The response code is a 3-digit integer. The following table
          shows some of the most common response codes, and their meanings.

Code	       	Print Statement
200	       	OK
400	       	Bad Request
401	       	Unauthorized
403	       	Forbidden
404	       	Not Found
Write a program that reads a response code as keyboard input. (Do not display a prompt. Simply read an integer as
 input.) Then use a switch statement to print the code's meaning. The program should check only for the codes listed
  in the table above. If the user enters a code that is not listed in the table, print nothing to the screen. The name
   of your program's class should be ServerResponse.

In the sample run shown below, 401 is entered as the code.

Sample Run With User Input Shown in <>

<401>
Unauthorized

*/

import java.util.Scanner;


public class DecisionStructure {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int code = scanner.nextInt();

        switch (code) {

            case (200):
                System.out.println("Ok");
                break;
            case (400):
                System.out.println("Bad Request");
                break;
            case (401):
                System.out.println("Unauthorized");
                break;
            case (403):
                System.out.println("Forbidden");
                break;
            case (404):
                System.out.println("Not Found");
                break;
            default:

                break;

        }



    }
}
