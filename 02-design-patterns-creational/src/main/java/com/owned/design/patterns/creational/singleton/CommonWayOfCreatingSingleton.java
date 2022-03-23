package com.owned.design.patterns.creational.singleton;

/**
 * The common way of creating <em>eager</em> singletons.
 *
 * <p>
 *     Consider using a lazy Singleton instead of this approach if it conducts resource/time intensive tasks during application startup
 * </p>
 *
 * Overall tip (from Brian Button):
 *
 * <p>
 *     (try to) avoid its usage by:
 *
 *     1. They are generally used as a global instance, why is that so bad? Because you hide the dependencies of your application in your code, instead of exposing them through the interfaces. Making something global to avoid passing it around is a code smell.
 *
 *     2. They violate the single responsibility principle: by virtue of the fact that they control their own creation and lifecycle.
 *
 *     3. They inherently cause code to be tightly coupled. This makes faking them out under test rather difficult in many cases.
 *
 *     4. They carry state around for the lifetime of the application. Another hit to testing since you can end up with a situation where tests need to be ordered which is a big no no for unit tests. Why? Because each unit test should be independent from the other.
 * </p>
 *
 */
public class CommonWayOfCreatingSingleton {

    /**
     * We eagerly create the object at class loading time.
     */
    private static final CommonWayOfCreatingSingleton SINGLE_INSTANCE = new CommonWayOfCreatingSingleton();

    /**
     * To prevent Client's from creating instance of this class
     */
    private CommonWayOfCreatingSingleton() {}

    /**
     * Returns the eagerly created single instance of this class.
     *
     * @return single instance of this class.
     */
    public static CommonWayOfCreatingSingleton getInstance() {
        return SINGLE_INSTANCE;
    }
}
