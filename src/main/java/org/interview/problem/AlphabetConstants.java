package org.interview.problem;

import com.google.common.collect.ImmutableMap;

import java.util.Map;

public class AlphabetConstants {

    public static final String alphabetUppercaseString = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String alphabetLowercaseString = " abcdefghijklmnopqrstuvwxyz";
    public static final char[] alphabetUpperCase = alphabetUppercaseString.toCharArray();
    public static final char[] alphabetLowerCase = alphabetLowercaseString.toCharArray();

    public static final Map<String, String> KEY_PAD_STRING = ImmutableMap.<String,String>builder()
            .put("a","2")
            .put("b","2")
            .put("c","2")
            .put("d","3")
            .put("e","3")
            .put("f","3")
            .put("g","4")
            .put("h","4")
            .put("i","4")
            .put("j","5")
            .put("k","5")
            .put("l","6")
            .put("m","6")
            .put("n","6")
            .put("o","6")
            .put("p","7")
            .put("q","7")
            .put("r","7")
            .put("s","7")
            .put("t","8")
            .put("u","8")
            .put("v","8")
            .put("w","9")
            .put("x","9")
            .put("y","9")
            .put("z","9")
            .put(" ","0")
            .build();

    public static final Map<Character, String> KEY_PAD_CHAR = ImmutableMap.<Character,String>builder()
            .put('a',"2")
            .put('b',"2")
            .put('c',"2")
            .put('d',"3")
            .put('e',"3")
            .put('f',"3")
            .put('g',"4")
            .put('h',"4")
            .put('i',"4")
            .put('j',"5")
            .put('k',"5")
            .put('l',"6")
            .put('m',"6")
            .put('n',"6")
            .put('o',"6")
            .put('p',"7")
            .put('q',"7")
            .put('r',"7")
            .put('s',"7")
            .put('t',"8")
            .put('u',"8")
            .put('v',"8")
            .put('w',"9")
            .put('x',"9")
            .put('y',"9")
            .put('z',"9")
            .put(' ',"0")
            .build();

    public static final String ALL_OTHER_CHARS = "1";
}
