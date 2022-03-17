package com.owned.design.principles.stupid.weird.singleton;

final class MainApplication {

    public static void main(String[] args) {

        JdbcConnectionV1.getInstance().connect();
        JdbcConnectionV1.getInstance().status();
        JdbcConnectionV1.getInstance().disconnect();
        JdbcConnectionV1.getInstance().status(); //looks like nice, isn't it?

        /**
         * ... wait ...
         * check its client usage
         *
         * */
        final ExampleServiceUsingJdbcConnection exampleServiceUsingJdbcConnection = new ExampleServiceUsingJdbcConnection(JdbcConnectionV1.getInstance());


        /**
         *
         * WHATTTTT?? Think about how you will test ExampleServiceCallingJdbcConnection
         *
         * From effective Java:
         * Making a class a singleton can make it difficult to test its clients, as it’s impossible to substitute a mock implementation for a singleton unless it implements an interface that serves as its type.
         *
         * ... let's do it ...
         *
         * @see JdbcConnectionV2 .... now we can use Connection fakes !!
         *
         * ... wait ...
         *
         * How about testing JdbcConnectionV2.java?
         * Your turn ...
         *
         * Wait ... we will refactor as Effective Java says ...
         * @see JdbcConnectionV3
         */
    }
}