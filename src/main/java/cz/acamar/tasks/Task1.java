package cz.acamar.tasks;

import java.util.LinkedList;

public class Task1 {

    /**
     * Task 1. Length of the last word.
     * <p>
     * Given a string s consisting of some words separated by some number of spaces,
     * return the length of the last word in the string.
     * <p>
     * A word is a maximal substring consisting of non-space characters only.
     * <p>
     * Example input: "Hello World"
     * Expected output: 5
     *
     * @param str - a string s consisting of some words separated by some number of spaces.
     * @return - the length of the last word in the string.
     */
    public int lengthOfLastWord(String str) {

        if (str == null || str.trim().isEmpty()) {
            return 0;
        }

        char[] strChars = str.trim().toCharArray();

        LinkedList<StringBuilder> strList = new LinkedList<>();
        StringBuilder oneString = new StringBuilder();

        for (int i = 0; i < strChars.length; i++) {
            if (strChars[i] != ' ') {
                oneString.append(strChars[i]);
            } else {
                strList.add(oneString);
                oneString = new StringBuilder();
            }

            if (i == strChars.length - 1) {
                strList.add(oneString);
            }
        }

        return strList.getLast().length();

    }
}
