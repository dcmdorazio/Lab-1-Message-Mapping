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
import java.util.Scanner;

public class CSC240_Week1MsgMapping {

    String text = "";
    private File message = new File("/message.txt");

    try

    {
        Scanner msgScan = new Scanner(message);
        msg = msgScan.next();
    }
    catch(
    FileNotFoundException c)

    {
        c.printStackTrace();
        msg = c.getLocalizedMessage();
    }


}
