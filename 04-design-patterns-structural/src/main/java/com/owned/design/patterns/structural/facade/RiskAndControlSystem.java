package com.owned.design.patterns.structural.facade;

import lombok.extern.slf4j.Slf4j;

/**
 * Manages the owner banks risk
 *
 */
@Slf4j
public class RiskAndControlSystem {

    public void updateClientCreditScore(TradeDetails tradeDetails) {
        log.info("Updating Client's credit score...");
    }
}
