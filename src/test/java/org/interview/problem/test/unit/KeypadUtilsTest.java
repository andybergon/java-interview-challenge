package org.interview.problem.test.unit;

import com.google.common.collect.ImmutableMap;
import org.interview.problem.KeypadUtils;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class KeypadUtilsTest{

    @Test(expected = IllegalArgumentException.class)
    public void testKeypadError(){
        KeypadUtils.getDialForString(null);
    }

    @Test
    public void testKeypadSuccess(){
        Map<String, String> testValues = ImmutableMap.of("Hello", "43666",
                        "how are you today ?", "4690273096808632901");
        testValues.entrySet().forEach( entry ->
                assertEquals(entry.getValue(), KeypadUtils.getDialForString(entry.getKey())));
    }

    @Test
    public void testKeypadFailure(){
        Map<String, String> testValues = ImmutableMap.of("Whats up?", "1234",
                "#123{]=-", "1234");
        testValues.entrySet().forEach( entry ->
                assertNotEquals(entry.getValue(), KeypadUtils.getDialForString(entry.getKey())));
    }
}