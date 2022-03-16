package com.owned.design.principles.stupid.weird.singleton;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class JdbcConnectionV2 implements Connection {

    private static JdbcConnectionV2 INSTANCE;
    private String url;
    private boolean status;

    private JdbcConnectionV2() {}

    public static synchronized JdbcConnectionV2 getInstance() {
        if(INSTANCE == null){
            INSTANCE = new JdbcConnectionV2();
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

interface Connection {}
