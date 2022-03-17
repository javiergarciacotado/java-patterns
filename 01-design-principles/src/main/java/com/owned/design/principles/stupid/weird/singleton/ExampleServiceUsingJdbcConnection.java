package com.owned.design.principles.stupid.weird.singleton;

public class ExampleServiceUsingJdbcConnection {

    private JdbcConnectionV1 jdbcConnectionV1;
    private Connection jdbcConnectionV2;

    //Using JdbcConnection singleton instance
    public ExampleServiceUsingJdbcConnection(JdbcConnectionV1 jdbcConnectionV1) {
        this.jdbcConnectionV1 = jdbcConnectionV1;
    }

    //Using interface instead
    public ExampleServiceUsingJdbcConnection(Connection connection) {
        jdbcConnectionV2 = connection;
    }
}
