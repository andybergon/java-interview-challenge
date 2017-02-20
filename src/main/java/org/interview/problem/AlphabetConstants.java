package org.interview.problem;

import java.util.HashMap;
import java.util.Map;

public class AlphabetConstants {

    public static final String alphabetUppercaseString = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String alphabetLowercaseString = " abcdefghijklmnopqrstuvwxyz";
    public static final char[] alphabetUpperCase = alphabetUppercaseString.toCharArray();
    public static final char[] alphabetLowerCase = alphabetLowercaseString.toCharArray();

    public static final Map<String, String> KEY_PAD_STRING = new HashMap();
    static {
        KEY_PAD_STRING.put("a", "2");
        KEY_PAD_STRING.put("b", "2");
        KEY_PAD_STRING.put("c", "2");
        KEY_PAD_STRING.put("d", "3");
        KEY_PAD_STRING.put("e", "3");
        KEY_PAD_STRING.put("f", "3");
        KEY_PAD_STRING.put("g", "4");
        KEY_PAD_STRING.put("h", "4");
        KEY_PAD_STRING.put("i", "4");
        KEY_PAD_STRING.put("j", "5");
        KEY_PAD_STRING.put("k", "5");
        KEY_PAD_STRING.put("l", "6");
        KEY_PAD_STRING.put("m", "6");
        KEY_PAD_STRING.put("n", "6");
        KEY_PAD_STRING.put("o", "6");
        KEY_PAD_STRING.put("p", "7");
        KEY_PAD_STRING.put("q", "7");
        KEY_PAD_STRING.put("r", "7");
        KEY_PAD_STRING.put("s", "7");
        KEY_PAD_STRING.put("t", "8");
        KEY_PAD_STRING.put("u", "8");
        KEY_PAD_STRING.put("v", "8");
        KEY_PAD_STRING.put("w", "9");
        KEY_PAD_STRING.put("x", "9");
        KEY_PAD_STRING.put("y", "9");
        KEY_PAD_STRING.put("z", "9");
        KEY_PAD_STRING.put(" ", "0");
    }

    public static final Map<Character, String> KEY_PAD_CHAR = new HashMap<>();
    static {
        KEY_PAD_CHAR.put('a', "2");
        KEY_PAD_CHAR.put('b', "2");
        KEY_PAD_CHAR.put('c', "2");
        KEY_PAD_CHAR.put('d', "3");
        KEY_PAD_CHAR.put('e', "3");
        KEY_PAD_CHAR.put('f', "3");
        KEY_PAD_CHAR.put('g', "4");
        KEY_PAD_CHAR.put('h', "4");
        KEY_PAD_CHAR.put('i', "4");
        KEY_PAD_CHAR.put('j', "5");
        KEY_PAD_CHAR.put('k', "5");
        KEY_PAD_CHAR.put('l', "6");
        KEY_PAD_CHAR.put('m', "6");
        KEY_PAD_CHAR.put('n', "6");
        KEY_PAD_CHAR.put('o', "6");
        KEY_PAD_CHAR.put('p', "7");
        KEY_PAD_CHAR.put('q', "7");
        KEY_PAD_CHAR.put('r', "7");
        KEY_PAD_CHAR.put('s', "7");
        KEY_PAD_CHAR.put('t', "8");
        KEY_PAD_CHAR.put('u', "8");
        KEY_PAD_CHAR.put('v', "8");
        KEY_PAD_CHAR.put('w', "9");
        KEY_PAD_CHAR.put('x', "9");
        KEY_PAD_CHAR.put('y', "9");
        KEY_PAD_CHAR.put('z', "9");
        KEY_PAD_CHAR.put(' ', "0");
    }

    public static final String ALL_OTHER_CHARS = "1";
}
