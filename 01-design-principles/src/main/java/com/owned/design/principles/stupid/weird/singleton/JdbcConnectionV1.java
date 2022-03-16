package com.owned.design.principles.stupid.weird.singleton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JdbcConnectionV1 {

    private static JdbcConnectionV1 INSTANCE;
    private String url;
    private boolean status;

    private JdbcConnectionV1() {}

    public static synchronized JdbcConnectionV1 getInstance() {
        if(INSTANCE == null){
            INSTANCE = new JdbcConnectionV1();
        }
        return INSTANCE;
    }

    public void connect() {
        status = true;
        log.info("connected");
    }

    public void disconnect() {
        status = false;
        log.info("disconnected");
    }

    public void status(){
        log.info("connection status " + status);
    }

}
