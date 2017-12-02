package com.geekapk.geekrhino;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests for GeekRhino Class
 *
 * @author duangsuse
 * @since 0.1.0
 */

public class GeekRhinoUnit {
    @Test
    public void version_isCorrect() throws Exception {
        assertEquals(0, GeekRhino.VERSION_MAJOR);
        assertEquals(1, GeekRhino.VERSION_MINOR);
        assertEquals(0, GeekRhino.VERSION_PATCH);
        assertEquals("0.1.0", GeekRhino.VERSION);
    }
}
