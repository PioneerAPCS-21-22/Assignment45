package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

@TestInstance(Lifecycle.PER_CLASS)
public class AppTest {
    private Texting t;

    @BeforeAll
    public void init() {
        t = new Texting("XO");
    }

    @Test
    public void testNegativeRepeatString() {
        assertNull(t.repeatString(-1));
    }

    @Test
    public void testZeroRepeatString() {
        assertEquals("", t.repeatString(0));
    }

    @Test
    public void testPositiveRepeatString() {
        assertEquals("XO XO ", t.repeatString(2));
    }
}    

