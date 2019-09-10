/*
 * Developer: Cody D'Orazio
 * Class: Computer Science III (CSC240)
 * Assigned: 08/29/19
 * Lab 1: Message Mapping Scheme
 * Description: This IntelliJ application will take the given .txt file and
 * Last Edited: 09/09/19
 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class runner {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();

        /*This scanner, called "c", is what I decided to name my scanner funtion. */
        Scanner c = new Scanner(System.in);

        System.out.print("Enter the name of the file you wish to use: ");
        String fileName = c.nextLine();

        File file = new File(fileName);

        /*This scanner called "input" will be used to take
        * the users input into the machine for use.*/
        Scanner input = new Scanner(file);

        for (String cd : list) {
            //System.out.println(cd);
            System.out.print(cd);
        }



        /*//File file = new File("C:\\Users\\cxdor\\IdeaProjects\\CSC240_Week1MsgMapping\\src\\message.txt");
        Scanner cd = new Scanner(System.in);
        // This function will have the program ask for user input
        System.out.print("Enter the name of the file you wish to use:");
        String fileName = cd.nextLine();

        File file = new File(fileName);*/

    }
}
