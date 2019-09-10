/*
 * Developer: Cody D'Orazio
 * Class: Computer Science III (CSC240)
 * Assigned: 08/29/19
 * Lab 1: Message Mapping Scheme
 * Description: This IntelliJ application will take the given .txt file and
 * Last Edited: 09/09/19
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CSC240_Week1MsgMapping {
    /*reads a list puts it into a new list, and reads off the old list for duplicates
    and re-attatches it to the second list.*/
    // using the contains() method for the statement above

    //TODO: Make a 2D array
    //TODO: Make array to store words (non duplicate)
    //TODO: Have an array that counts the longest line in the txt file
    //TODO: Make a loop that scans the document


    public static boolean removeDuplicateWords(ArrayList<String> wordList) {
        for (int i = 0; i < wordList.size(); i++) {
            for (int j = i + 1; j < wordList.size(); j++) {
                if (wordList.get(i).equals(wordList.get(j))) {
                    return true;
                }
            }

        }
        return false;
    }


    // Removes duplicate words from original "List"
    public static <String> ArrayList<String> removeDups(ArrayList<String> list) {

        // Creates a new arrayList called "nextList"
        ArrayList<String> nextList = new ArrayList<String>();

        // Scans old list, and places non duplicated words into new list.
        for (String word : list) {
            // If this word is not in the list then add that sucker into the array!!
            if (!list.contains(word)) {
                nextList.add(word);
            }
        }
//TODO: Left of here
        // return the new list, non duplicated words list
        return list;
    }
   /* public int remove(int index) {
        for (int i = 0; i < list.size(); i++) {
            //TODO: Finish nested 'for' loop
           // for(int)
        }

    } */

    private input() {

        Scanner input = new Scanner(file);


        while (input.hasNextLine()) {
            System.out.println(input.nextLine());
            String st = input.next();

            //TODO: Activate "words" variable and ArrayList.
            ArrayList<String> words = new ArrayList<>(Collections.singletonList(st));

            /* This for loop uses integers 'c' and 'd' to compare the words
             * in the list, and eventually print them out*/
            for (int c = 0; c < words.size(); c++) {
                for (int d = c + 1; d < words.size(); d++) {
                    if (words.get(c).equals(words.get(d))) words.remove(d);
                }
            }
            System.out.println(words);
        }
        return;
    }


}

