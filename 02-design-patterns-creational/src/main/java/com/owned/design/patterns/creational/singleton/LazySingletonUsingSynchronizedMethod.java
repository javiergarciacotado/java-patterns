package com.owned.design.patterns.creational.singleton;

/**
 * <p>
 * Use this approach if the Singleton has to perform resource/time expensive stuff on instantiation during startup of
 * an application, e.g. booting of app server.
 * </p>
 */
public class LazySingletonUsingSynchronizedMethod {

    /**
     * lazily create the object
     */
    private static LazySingletonUsingSynchronizedMethod SINGLE_INSTANCE;

    /**
     * Lock down once again
     */
    private LazySingletonUsingSynchronizedMethod() {
    }

    /**
     * Returns the lazily created single instance of this class.
     * <p>
        the entire method is synchronized. More expensive getting the thread
     * </p>
     * @return single instance of this class.
     */
    public static synchronized LazySingletonUsingSynchronizedMethod getInstance() {
        if (SINGLE_INSTANCE == null) {
            SINGLE_INSTANCE = new LazySingletonUsingSynchronizedMethod();
        }

        // most of the time we just drop straight down
        return SINGLE_INSTANCE;
    }
}