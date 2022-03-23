package com.owned.design.patterns.structural.facade;

import lombok.extern.slf4j.Slf4j;

/**
 * Trade activity complies with regulatory systems
 *
 */
@Slf4j
public class RegulatorySystem {

    public void auditTrade(TradeDetails tradeDetails) {
        log.info("Checking regulatory compliance...");
    }
}
