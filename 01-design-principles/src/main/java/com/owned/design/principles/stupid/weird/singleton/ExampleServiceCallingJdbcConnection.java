package com.owned.design.principles.stupid.weird.singleton;

public class ExampleServiceCallingJdbcConnection {

    private JdbcConnectionV1 jdbcConnectionV1;
    private Connection jdbcConnectionV2;

    public ExampleServiceCallingJdbcConnection(JdbcConnectionV1 jdbcConnectionV1) {
        this.jdbcConnectionV1 = jdbcConnectionV1;
        jdbcConnectionV2 = null;
    }

    public ExampleServiceCallingJdbcConnection(Connection connection) {
        jdbcConnectionV2 = connection;
    }
}
