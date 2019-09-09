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
import java.util.Collections;
import java.util.Scanner;

public class CSC240_Week1MsgMapping {

    //TODO: Make a 2D array
    //TODO: Make array to store words (non duplicate)

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
    public static <String> ArrayList<String> removeDuplicates(ArrayList<String> list) {
        // Creates new list
        ArrayList<String> newList = new ArrayList<String>();
        // Scans old list, and places non duplicated words into new list.
        for (String word : list) {

            // If this word is not in newList, add it
            if (!list.contains(word)) {

                newList.add(word);
            }
        }

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

    public static void main(String[] args) throws IOException {

        /*TODO: WHEN TRYING TO RUN THIS FILE, MAKE SURE YOU CHANGE THE PATHNAME OF THE .txt FILE
         *  TO WHERE YOU SAVED IT. THIS IS CRUCIAL IN ORDER TO HAVE THIS PROGRAM FUNCTION PROPERLY! */
        //File file = new File("C:\\Users\\cxdor\\IdeaProjects\\CSC240_Week1MsgMapping\\src\\message.txt");
        Scanner cd = new Scanner(System.in);
        // This function will have the program ask for user input
        System.out.print("Enter the name of the file you wish to use:");
        String fileName = cd.nextLine();

        File file = new File(fileName);

    }

//    @Override
//    public int hashCode() {
//        return super.hashCode();
//    }


}

