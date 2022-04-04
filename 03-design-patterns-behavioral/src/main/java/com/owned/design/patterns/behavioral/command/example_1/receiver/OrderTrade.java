package com.owned.design.patterns.behavioral.command.example_1.receiver;

import com.owned.design.patterns.behavioral.command.example_1.domain.Trade;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OrderTrade {

    public void buy(Trade trade) {
        log.info("buy ...");
    }

    public void sell(Trade trade) {
        log.info("sell ...");
    }

    public void cancel(Trade trade) {
        log.info("cancel ...");
    }
}
