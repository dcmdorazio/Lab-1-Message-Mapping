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
import java.util.Scanner;

public class CSC240_Week1MsgMapping {

    /* Initializes the "lineCounter" for the program to
     *  print out the total number of messages in the given .txt file. */
    private static int lineCounter = 0;  // this is a "java object"


    public static void main(String[] args) throws IOException {
        //First array in project
        ArrayList<String> list = new ArrayList<>();

        /*This scanner, called "c", is what I decided to name my scanner funtion. */
        Scanner c = new Scanner(System.in);

        /* The 3 lines of code below, are to take the users input to parse the .txt file
         ** the user inputs with they keyboard*/
        System.out.print("Enter the name of the file you wish to use: ");
        String fileName = c.nextLine();

        // Initializes the file path from the given .txt the user gives.
        File file = new File(fileName);
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




        /* THE PRINT FUNCTION BELOW WILL PRINT OUT THE FILE NAME THE USER
         *  HAS CHOSEN TO BE READ AND USED IN THIS PROGRAM*/
        System.out.println("\n" + "The name of the file you have chosen is: " + fileName + "\n");

        /*This scanner called "input" will be used to take
         * the users input into the machine for use.*/
        Scanner input = new Scanner(file);

        // This while loop will take the users input and view the words, and then adding them into the list
        while (input.hasNext()) {
            //TODO: move the below "lineCounter"
            //lineCounter++;
            list.add(input.next());
        }
        System.out.println("These are the words the file, without the duplicates: ");
        ArrayList<String> nextList = removeDups(list);
        for (String x : nextList) {
            System.out.println(x);
        }

        // This print statement should print the message count of the file given by the user.
        // /*THIS NEEDS TO BE DEBUGGED*/
        System.out.println("\n" + "The amount of Messages in " + fileName + " is: " + getLineCounter(fileName));
    }

    /* This method will remove the duplicate words from the .txt file!*/
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

    /* This method is used to get the total amount
    *  of lines in the users .txt file*/
    private static int getLineCounter(String filename) throws IOException {
        try (InputStream is = new BufferedInputStream(new FileInputStream(filename))) {
            byte[] c = new byte[1024];
            int lineCounter = 0;
            int readChars = 0;
            while ((readChars = is.read(c)) != -1) {
                for (int i = 0; i < readChars; ++i) {
                    if (c[i] == '\n') {
                        lineCounter ++;
                    }
                }
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