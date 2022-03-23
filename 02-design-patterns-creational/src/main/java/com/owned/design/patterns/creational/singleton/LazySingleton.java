package com.owned.design.patterns.creational.singleton;

import lombok.extern.slf4j.Slf4j;

/**
 * The old skool way of creating <em>lazy</em> singletons.
 */
@Slf4j
public class LazySingleton {

    /**
     * Lazily create the object when the client tries to access it for the first time.
     *
     * The <code>volatile</code> forces threads to ALWAYS get the latest version value of the variable.
     */
    private static volatile LazySingleton SINGLE_INSTANCE;

    /**
     * Lock down the constructor
     */
    private LazySingleton() {}

    /**
     * Returns the lazily created single instance of this class.
     *
     * @return single instance of this class.
     */
    public static LazySingleton getInstance() {
        if (SINGLE_INSTANCE == null) { //not created yet
            synchronized (LazySingleton.class) {
                if (SINGLE_INSTANCE == null) {
                    SINGLE_INSTANCE = new LazySingleton();
                }
            }
        }
        return SINGLE_INSTANCE;
    }
}
