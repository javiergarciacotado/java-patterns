package com.owned.design.principles.stupid.weird.singleton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public enum JdbcConnectionV3 {

    MYSQL_INSTANCE("jdbc://localhost:3306/db", false);

    private String url;
    private boolean status;

    JdbcConnectionV3(String url, boolean status) {
        this.url = url;
        this.status = status;
    }

    public void connect() {
        status = true;
        log.info("connected");
    }


}
