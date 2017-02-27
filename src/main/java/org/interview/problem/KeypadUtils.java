package org.interview.problem;

public class KeypadUtils {

    /**
     * @param text
     * @return The appropriate dial pad numbers for the given text
     * @throws Exception Throws the appropriate exception for invalid input
     */
    public static String getDialForString(final String text) throws Exception {
        if (text == null) {
            throw new IllegalArgumentException(); // can be IllegalArgumentException or NullPointerException
        }

        StringBuilder sb = new StringBuilder();
        AlphabetConstants alphabetConstants = new AlphabetConstants();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            c = Character.toLowerCase(c);

            if (alphabetConstants.KEY_PAD_CHAR.containsKey(c)) {
                sb.append(alphabetConstants.KEY_PAD_CHAR.get(c));
            } else if (Character.isDigit(c)) {
                sb.append(c);
            } else {
                sb.append(alphabetConstants.ALL_OTHER_CHARS);
            }
        }

        return sb.toString();
    }

}