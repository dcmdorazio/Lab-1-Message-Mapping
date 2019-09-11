/*
 * Developer: Cody D'Orazio
 * Class: Computer Science III (CSC240)
 * Assigned: 08/29/19
 * Lab 1: Message Mapping Scheme
 * Description: This IntelliJ application will take the given .txt file and
 * Last Edited: 09/10/19
 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSC240_Week1MsgMapping {

    public static void main(String[] args) throws IOException {
        //First array in project
        ArrayList<String> list = new ArrayList<>();

        /*This scanner, called "c", is what I decided to name my scanner funtion. */
        Scanner c = new Scanner(System.in);

        /* The 3 lines of code below, are to take the users input to parse the .txt file
        ** the user inputs with they keyboard*/
        System.out.print("Enter the name of the file you wish to use: ");
        String fileName = c.nextLine();
        File file = new File(fileName);

        /*This scanner called "input" will be used to take
         * the users input into the machine for use.*/
        Scanner input = new Scanner(file);
        //int counter = 0;

        while (input.hasNext()) {
            list.add(input.next());
        }
        ArrayList<String> nextList = CSC240_Week1MsgMapping.removeDups(list);
        for(String x : nextList) {
            System.out.println(x);
        }

    }

    private static <String> ArrayList<String> removeDups(ArrayList<String> list) {
        //Second array in project
        ArrayList<String> nextList = new ArrayList<>();

        for (String words : list) {
            if (!nextList.contains(words)) {
                nextList.add(words);
            }
        }
        return nextList;
    }
}

/*THE COMMENTED CODE BELOW THIS LINE ARE TEST METHODS AND
* OTHER MISC IDEAS FOR TESTING.
* THEY ARE LEFT HERE TO SHOW WHOMEVER READS THIS FILE WHAT
* WAS MY INTENTION AND/OR WHAT I WAS THINKING OF DOING WHILE
* FINALIZING THIS PROJECT!!! :)*/

/* public static boolean removeDuplicateWords(ArrayList<String> wordList) {
        for (int i = 0; i < wordList.size(); i++) {
            for (int j = i + 1; j < wordList.size(); j++) {
                if (wordList.get(i).equals(wordList.get(j))) {
                    return true;
                }
            }

        }
        return false;
    }*/


/* private static void removeDuplicateWords(ArrayList<String> wordList) {
        ArrayList<String> newList = new ArrayList<>();
        for (int i = 0; i < wordList.size(); i++) {
            for (int j = i + 1; j < wordList.size(); j++) {
                if (wordList.get(i).equals(wordList.get(j))) {
                    return;
                }
            }

        }
    }*/