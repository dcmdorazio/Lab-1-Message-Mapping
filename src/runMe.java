import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class runMe {
    public static void main(String[] args) throws IOException {
        //First array in project
        ArrayList<String> list1 = new ArrayList<>();

        /*This scanner, called "c", is what I decided to name my scanner function. */
        Scanner c = new Scanner(System.in);

        /* The 2 lines of code below, are to take the users input to parse the .txt file
         ** the user inputs with they keyboard*/
        System.out.print("\n" + "Enter the name of the file you wish to use: ");
        String fileName = c.nextLine();

        // Initializes the file path from the given .txt the user gives.
        File file = new File(fileName);

        /* THE PRINT FUNCTION BELOW WILL PRINT OUT THE FILE NAME THE USER
         *  HAS CHOSEN TO BE READ AND USED IN THIS PROGRAM*/
        System.out.println("\n" + "The name of the file you have chosen is: " + fileName + "\n");

        /*This scanner called "input" will be used to take
         * the users input into the machine for use.*/
        Scanner input = new Scanner(file);

        // This while loop will take the users input and view the words, and then adding them into the list
        while (input.hasNext()) {
            list1.add(input.next());
        }
        System.out.println("These are the words the file, without the duplicates: ");
        ArrayList<String> nextList = CSC240_Week1MsgMapping.removeDups(list1);
        for (String x : nextList) {
            System.out.println(x);
        }

        // This print statement should print the message count of the file given by the user.
        // /*THIS NEEDS TO BE DEBUGGED*/
        System.out.println("\n" + "The amount of Messages in " + fileName + " is: " + CSC240_Week1MsgMapping.getLineCounter(new File(fileName)));
    }
}
