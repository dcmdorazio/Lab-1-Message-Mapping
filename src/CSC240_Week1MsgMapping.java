/*
 * Developer: Cody D'Orazio
 * Class: Computer Science III (CSC240)
 * Assigned: 08/29/19
 * Lab 1: Message Mapping Scheme
 * Description: This IntelliJ application will take the given .txt file and
 * Last Edited: 09/01/19
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CSC240_Week1MsgMapping {
public static void main (String[] args) throws IOException {
    //File file = new File("C:\\Users\\cxdor\\IdeaProjects\\CSC240_Week1MsgMapping\\src\\resources\\message.txt");
    File file = new File("/message.txt");
    Scanner scan = new Scanner(file);

    while (scan.hasNextLine())
        System.out.println(scan.nextLine());


}


}

