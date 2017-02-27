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
    public void testKeypadSuccess() throws Exception {
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
    public void testKeypadSuccessWithNumbers() throws Exception {
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
    public void testKeypadSuccessNoAlphabet() throws Exception {
        Map<String, String> testValues = new HashMap<>();
        testValues.put("1234", "1234"); // only numbers
        testValues.put("    ", "0000"); // only whitespace
        testValues.put("!()+-*/", "1111111"); // only other character
        testValues.put(" !15 +", "011501"); // mixed
        testValues.entrySet().forEach(entry -> {
            try {
                assertEquals(entry.getValue(), KeypadUtils.getDialForString(entry.getKey()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    @Test
    public void testKeypadSuccessMixedCases() throws Exception {
        Map<String, String> testValues = new HashMap<>();
        testValues.put("hello ben", "435560236"); // only lowercase
        testValues.put("HELLO BEN", "435560236"); // only uppercase
        testValues.put("HeLLo BeN", "435560236"); // mixed cases
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

    @Test
    public void testKeypadFailureNoAlphabet() throws Exception {
        Map<String, String> testValues = new HashMap<>();
        testValues.put("1234", "1111");
        testValues.put("!12/", "1111");
        testValues.entrySet().forEach(entry -> {
            try {
                assertNotEquals(entry.getValue(), KeypadUtils.getDialForString(entry.getKey()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
