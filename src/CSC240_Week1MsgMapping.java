/*
 * Developer: Cody D'Orazio
 * Class: Computer Science III (CSC240)
 * Assigned: 08/29/19
 * Lab 1: Message Mapping Scheme
 * Description: This IntelliJ application will take the given .txt file and
 * Last Edited: 09/10/19
 */

public class CSC240_Week1MsgMapping {

    public static String[] removeDuplicate(String[] words) {
        // remember which word is a duplicate
        boolean[] isDuplicate = new boolean[words.length];
        // and count them
        int countDuplicate = 0;
        for (int i = 0; i < words.length; i++) {
            // only check "forward" because "backwards checked" duplicates have been marked yet
            for (int j = i + 1; j < words.length; j++) {
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