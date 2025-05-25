//------------------------------------------------------
// Assignment 3
// Written by: Helwa Salameh (1961163)
// For SE350 Section 630 – Spring 2025
//--------------------------------------------------------

public class EagerSingleton {
    private static final EagerSingleton[] instances = new EagerSingleton[3];
    private final int id;

    // Static block for eager initialization
    static {
        for (int i = 0; i < 3; i++) {
            instances[i] = new EagerSingleton(i);
            System.out.println("EagerSingleton " + i + " instantiated");
        }
    }

    // Private constructor
    private EagerSingleton(int id) {
        this.id = id;
    }

    /**
     * Returns the singleton instance for the specified index
     * @param id the index of the instance to retrieve (0-2)
     * @return the EagerSingleton instance
     * @throws IllegalArgumentException if id is not between 0-2
     */
    public static EagerSingleton getInstance(int id) {
        if (id < 0 || id >= 3) {
            throw new IllegalArgumentException("ID must be between 0 and 2");
        }
        return instances[id];
    }

    /**
     * Gets the ID of this singleton instance
     * @return the instance ID
     */
    public int getId() {
        return id;
    }
}