//------------------------------------------------------
// Assignment 3
// Written by: Helwa Salameh (1961163)
// For SE350 Section 630 – Spring 2025
//--------------------------------------------------------

import java.util.Random;

public class Assignment3Singleton {
    public static void main(String[] args) {
        System.out.println("Starting Singleton Demonstration...");

        Random r = new Random();
        System.out.println("\nTesting EagerSingleton:");
        for (int i = 0; i < 10; i++) {
            EagerSingleton s = EagerSingleton.getInstance(r.nextInt(3));
            System.out.println("Retrieved eager singleton " + s.getId());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("\nTesting LazySingleton:");
        for (int i = 0; i < 10; i++) {
            LazySingleton s = LazySingleton.getInstance(r.nextInt(3));
            System.out.println("Retrieved lazy singleton " + s.getId());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("\nSingleton demonstration complete.");
    }
}