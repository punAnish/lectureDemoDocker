package org.example;


import org.junit.Test;

import static junit.framework.Assert.assertEquals;


/**
 * Unit test for simple App.
 */
public class AppTest
{
    App app = new App();

    @Test
    public void testAddMe() {
        assertEquals(3, app.addMe(1, 2));
    }
}

