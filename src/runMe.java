import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class runMe {
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

}
