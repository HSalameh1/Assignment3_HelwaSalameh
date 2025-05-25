//------------------------------------------------------
// Assignment 3
// Written by: Helwa Salameh (1961163)
// For SE350 Section 630 – Spring 2025
//--------------------------------------------------------

package Singleton;

/**
 * Singleton.LazySingleton implementation that creates instances only when requested
 */
public class LazySingleton {
    private static final LazySingleton[] instances = new LazySingleton[3];
    private final int id;

    // Private constructor
    private LazySingleton(int id) {
        this.id = id;
        System.out.println("Singleton.LazySingleton " + id + " instantiated");
    }

    /**
     * Returns the singleton instance for the specified index, creating it if necessary
     * @param id the index of the instance to retrieve (0-2)
     * @return the Singleton.LazySingleton instance
     */
    public static synchronized LazySingleton getInstance(int id) {
        if (id < 0 || id >= 3) {
            throw new IllegalArgumentException("ID must be between 0 and 2");
        }
        if (instances[id] == null) {
            instances[id] = new LazySingleton(id);
        }
        return instances[id];
    }

    public int getId() {
        return id;
    }
}