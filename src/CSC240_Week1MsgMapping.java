/*
 * Developer: Cody D'Orazio
 * Class: Computer Science III (CSC240)
 * Assigned: 08/29/19
 * Lab 1: Message Mapping Scheme
 * Description: This IntelliJ application will take the given .txt file and
 * Last Edited: 09/04/19
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CSC240_Week1MsgMapping {
    public static void main(String[] args) throws IOException {

        /*TODO: WHEN TRYING TO RUN THIS FILE, MAKE SURE YOU CHANGE THE PATHNAME OF THE .txt FILE
        *  TO WHERE YOU SAVED IT. THIS IS CRUCIAL IN ORDER TO HAVE THIS PROGRAM FUNCTION PROPERLY! */
        //File file = new File("C:\\Users\\cxdor\\IdeaProjects\\CSC240_Week1MsgMapping\\src\\message.txt");
        File file = new File(fileName);

        Scanner input = new Scanner(file);

        Scanner c = new Scanner(file);


        // This function will have the program ask for user input
        System.out.println("Enter the name of the file you wish to use:");

        while (c.hasNextLine()) {
            System.out.println(c.nextLine());

        }


    }
}

