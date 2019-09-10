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

public class CSC240_Week1MsgMapping {

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
        //int counter = 0;

        /* The while and for loop below, is used to process the words
         * in the list and print them out in "List Formation". */
        while (input.hasNextLine()) {
            list.add(input.next());
        }
        for (String cd : list) {
            System.out.println(cd);
        }
    }
    /*reads a list puts it into a new list, and reads off the old list for duplicates
    and re-attatches it to the second list.*/
    // using the contains() method for the statement above


    public static String[] removeDuplicate(String[] words){
        // remember which word is a duplicate
        boolean[] isDuplicate = new boolean[words.length];
        // and count them
        int countDuplicate = 0;
        for (int i = 0; i < words.length ; i++){
            // only check "forward" because "backwards checked" duplicates have been marked yet
            for(int j = i + 1; j < words.length ; j++){
                if (words[i].equals(words[j])) {
                    isDuplicate[j] = true;
                    countDuplicate++;
                }
            }
        }
        // collect non-duplicate strings
        String[] lastList = new String[words.length - countDuplicate];
        int j = 0;
        for (int i = 0; i < isDuplicate.length; i++) {
            if (!isDuplicate[i]) {
                lastList[j] = words[i];
                j++;
            }
        }
        // and return them
        return lastList;
    }


//TODO: Have an array that counts the longest line in the txt file

   /* private static void removeDuplicateWords(ArrayList<String> wordList) {
        for (int i = 0; i < wordList.size(); i++) {
            for (int j = i + 1; j < wordList.size(); j++) {
                if (wordList.get(i).equals(wordList.get(j))) {
                    return;
                }
            }

        }
    }*/

/* END OF CSC240_WEEK1MSGMAPPING.JAVA */
}

/* THE COMMENTS BELOW ARE LEFT IN THIS FILE BECAUSE THEY INCLUDE OLD / IN PROGRESS
*  IDEAS. THESE WERE ALSO USED TO TEST MY IDEAS WITH MY ACTUAL RUNNING CODE*/

/**/ /**/ /**/ /**/ /**/ /*PLEASE*/ /*SEE*/ /*BELOW*/ /**/ /**/ /**/ /**/ /**/ /**/ /**/ /**/ /**/ /**/

/* public static boolean removeDuplicateWords(ArrayList<String> wordList) {
        for (int i = 0; i < wordList.size(); i++) {
            for (int j = i + 1; j < wordList.size(); j++) {
                if (wordList.get(i).equals(wordList.get(j))) {
                    return true;
                }
            }

        }
        return false;
    } */

///////////////////////////////////////////////////////////////////////////////

/*public void showPatients(String name) {
    boolean match = false;
    for(matchingname : patientList) {
        if (matchingname.toLowerCase.contains(name.toLowerCase())) {
            match = true;
        }
    }
} */