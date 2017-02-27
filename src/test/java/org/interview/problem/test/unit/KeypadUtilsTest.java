package org.interview.problem.test.unit;

import org.interview.problem.KeypadUtils;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class KeypadUtilsTest {

    @Test(expected = Exception.class)
    public void testKeypadError() throws Exception {
        KeypadUtils.getDialForString(null);
    }

    @Test
    public void testKeypadSuccess() throws Exception{
        Map<String, String> testValues = new HashMap<>();
        testValues.put("Hello", "43556");
        testValues.put("how are you today ?", "4690273096808632901");
        testValues.entrySet().forEach(entry -> {
            try {
                assertEquals(entry.getValue(), KeypadUtils.getDialForString(entry.getKey()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    @Test
    public void testKeypadSuccessWithNumbers() throws Exception{
        Map<String, String> testValues = new HashMap<>();
        testValues.put("Hell4o #*", "435546011");
        testValues.put("how are you today ?", "4690273096808632901");
        testValues.entrySet().forEach(entry -> {
            try {
                assertEquals(entry.getValue(), KeypadUtils.getDialForString(entry.getKey()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    @Test
    public void testKeypadFailure() throws Exception {
        Map<String, String> testValues = new HashMap<>();
        testValues.put("Whats up?", "1234");
        testValues.put("#123{]=-", "1234");
        testValues.entrySet().forEach(entry -> {
            try {
                assertNotEquals(entry.getValue(), KeypadUtils.getDialForString(entry.getKey()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}