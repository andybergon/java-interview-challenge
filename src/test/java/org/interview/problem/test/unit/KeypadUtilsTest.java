package org.interview.problem.test.unit;

import org.interview.problem.KeypadUtils;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class KeypadUtilsTest {

    @Test(expected = Exception.class)
    public void testKeypadError(){
        KeypadUtils.getDialForString(null);
    }

    @Test
    public void testKeypadSuccess(){
        Map<String, String> testValues = new HashMap<>();
        testValues.put("Hello", "43666");
        testValues.put("how are you today ?", "4690273096808632901");
        testValues.entrySet().forEach( entry ->
                assertEquals(entry.getValue(), KeypadUtils.getDialForString(entry.getKey())));
    }

    @Test
    public void testKeypadFailure(){
        Map<String, String> testValues = new HashMap<>();
        testValues.put("Whats up?", "1234");
        testValues.put("#123{]=-", "1234");
        testValues.entrySet().forEach( entry ->
                assertNotEquals(entry.getValue(), KeypadUtils.getDialForString(entry.getKey())));
    }
}