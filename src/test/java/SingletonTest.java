//------------------------------------------------------
// Assignment 3
// Written by: Helwa Salameh (1961163)
// For SE350 Section 630 – Spring 2025
//--------------------------------------------------------

import Singleton.EagerSingleton;
import Singleton.LazySingleton;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SingletonTest {

    @Test
    public void testEagerSingletonInstances() {
        // Verify all 3 instances are created upfront
        EagerSingleton s0 = EagerSingleton.getInstance(0);
        EagerSingleton s1 = EagerSingleton.getInstance(1);
        EagerSingleton s2 = EagerSingleton.getInstance(2);

        assertNotNull(s0);
        assertNotNull(s1);
        assertNotNull(s2);

        assertEquals(0, s0.getId());
        assertEquals(1, s1.getId());
        assertEquals(2, s2.getId());

        // Verify same instances are returned
        assertSame(s0, EagerSingleton.getInstance(0));
        assertSame(s1, EagerSingleton.getInstance(1));
    }

    @Test
    public void testLazySingletonInstances() {
        // First access should create the instance
        LazySingleton s0 = LazySingleton.getInstance(0);
        assertNotNull(s0);
        assertEquals(0, s0.getId());

        // Verify same instance is returned
        assertSame(s0, LazySingleton.getInstance(0));

        // Verify new instances are created only when needed
        LazySingleton s1 = LazySingleton.getInstance(1);
        assertNotNull(s1);
        assertEquals(1, s1.getId());
    }

    @Test
    public void testSingletonInvalidId() {
        assertThrows(IllegalArgumentException.class, () -> EagerSingleton.getInstance(3));
        assertThrows(IllegalArgumentException.class, () -> LazySingleton.getInstance(-1));
    }
}