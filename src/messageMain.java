/*
 * Developer: Cody D'Orazio
 * Class: Computer Science III (CSC240)
 * Lab 1: Message Mapping Scheme
 * Last Edited: 09/01/19
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class messageMain {



    public static void main(String[] args) throws FileNotFoundException {
        //File file = new File("C:\\Users\\cxdor\\IdeaProjects\\CSC240_Week1MsgMapping\\src\\resources\\message.txt");
        File file = new File("/message.txt");
        Scanner scan = new Scanner(file);

        while (scan.hasNextLine())
            System.out.println(scan.nextLine());

    }
}