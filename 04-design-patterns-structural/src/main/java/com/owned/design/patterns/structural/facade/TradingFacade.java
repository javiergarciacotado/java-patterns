package com.owned.design.patterns.structural.facade;

/**
 * The trading facade.
 * <p>
 * Use Case: Imagine a trader has clicked on the Buy button ...
 */
public class TradingFacade {

    /**
     * Without this facade, the UI component would have to know about and call all the different
     * subsystems to execute the trade
     * <p>
     */
    public void executeBuyOrder(TradeDetails tradeDetails) {
        final TradingEngine tradingEngine = new TradingEngine();
        tradingEngine.buyOrder(tradeDetails);

        final ReconciliationSystem recoSystem = new ReconciliationSystem();
        recoSystem.balanceTheExchangeBooks(tradeDetails);

        final RiskAndControlSystem riskAndControl = new RiskAndControlSystem();
        riskAndControl.updateClientCreditScore(tradeDetails);

        final SettlementSystem settlements = new SettlementSystem();
        settlements.settle(tradeDetails);

        final RegulatorySystem regs = new RegulatorySystem();
        regs.auditTrade(tradeDetails);

        final SalesAndMarketingSystem sales = new SalesAndMarketingSystem();
        sales.updateCampaignBooks(tradeDetails);
    }
}
