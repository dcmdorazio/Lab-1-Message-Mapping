/*
 * Developer: Cody D'Orazio
 * Class: Computer Science III (CSC240)
 * Assigned: 08/29/19
 * Lab 1: Message Mapping Scheme
 * Description: This IntelliJ application will take the given .txt file and
 * Last Edited: 09/10/19
 */

import java.io.*;
import java.util.ArrayList;
import java.util.stream.IntStream;

public class CSC240_Week1MsgMapping {

    /* This method will remove the duplicate words from the .txt file!*/
    static <String> ArrayList<String> removeDups(ArrayList<String> list) {
        //Second array in project
        ArrayList<String> list2 = new ArrayList<>();

        /* Loop that will search for duplicates*/
        for (String words : list) {
            if (list2.contains(words)) {
                continue;
            }
            list2.add(words);
        }
        // Returns the second array list that removes the duplicates in the users .txt file
        return list2;
    }

    /* This method is used to get the total amount
    *  of lines in the users .txt file*/
    static int getLineCounter(File findLine) throws IOException {
        try (InputStream is = new BufferedInputStream(new FileInputStream(findLine))) {
            byte[] c = new byte[1024];
            int lineCounter = 0;
            int readChars;
            while ((readChars = is.read(c)) != -1) {
                lineCounter += IntStream.range(0, readChars).filter(i -> c[i] == '\n').count();
            }
            int i = lineCounter;
            return lineCounter;

        }
    }
}

/*THE COMMENTED CODE BELOW THIS LINE ARE TEST METHODS AND
 * OTHER MISC IDEAS FOR TESTING.                                     **** IMPORTANT, PLEASE READ!!! ****
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


/*if (file.canRead()) {
            try {
                FileReader fr = new LineNumberReader(fr);
                LineNumberReader lr = new LineNumberReader(fr);
                int lineNumberCount = 0;

                try {
                    while (lr.readLine() != null) {
                        lineNumberCount++;
                    }
                    System.out.println("Total number of messages in this file: " + lineNumberCount);
                } catch (IOException a) {
                    a.printStackTrace();
                }
            } catch (FileNotFoundException a) {
                a.printStackTrace();
            }
        }*/

/* if (file.exists()) {
            try {
                FileReader fileReader = new FileReader(file);
                LineNumberReader fR = new LineNumberReader(fileReader);
                int lineNumberCount = 0;

                    while(fileReader.getLineCounter() != null) {
                        lineNumberCount ++;
                    }
                    System.out.println("test quote");

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }*/