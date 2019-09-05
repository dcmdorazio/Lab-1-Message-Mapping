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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CSC240_Week1MsgMapping {
    public static void main(String[] args) throws IOException {

        /*TODO: WHEN TRYING TO RUN THIS FILE, MAKE SURE YOU CHANGE THE PATHNAME OF THE .txt FILE
         *  TO WHERE YOU SAVED IT. THIS IS CRUCIAL IN ORDER TO HAVE THIS PROGRAM FUNCTION PROPERLY! */
        //File file = new File("C:\\Users\\cxdor\\IdeaProjects\\CSC240_Week1MsgMapping\\src\\message.txt");

        //Scanner scan = new Scanner(System.in);
        Scanner input = new Scanner(fileName);
        String fileName = input.nextLine();
        File file = new File(fileName);


        // This function will have the program ask for user input
        System.out.println("Enter the name of the file you wish to use:");

        while (input.hasNextLine()) {
            System.out.println(input.nextLine());
            String st = input.next();
            //TODO: Activate "words" variable and ArrayList.
            ArrayList<String> words = new ArrayList<>(Arrays.asList(st));


            /* This for loop uses integers 'c' and 'd' to compare the words
            * in the list, and eventually print them out*/
            for (int c =0; i < words.size(); i++) {
                for(int d = c + 1; d <words.size(); d++) {
                    if (words.get(c).equals(words.get(d))) words.remove(c);
                }
            }
            System.out.println(words);
        }


    }
}

