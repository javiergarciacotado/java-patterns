package com.owned.design.patterns.behavioral.observer.example_1.domain.bot;

import com.owned.design.patterns.behavioral.observer.example_1.MarketObserver;
import com.owned.design.patterns.behavioral.observer.example_1.domain.market.Market;
import com.owned.design.patterns.behavioral.observer.example_1.domain.market.MarketType;
import lombok.Data;

import java.math.BigDecimal;

/**
 * This would not exist in real world. Here because I'm too lazy to type same code for each bot.
 * <p>
 */
@Data
abstract class AbstractTradingBot implements MarketObserver {

    /**
     * USD GBP market bid price
     */
    private BigDecimal latestUsdGbpMarketBidPrice = new BigDecimal("0.60");

    /**
     * USD EUR market bid price
     */
    private BigDecimal latestUsdEurMarketBidPrice = new BigDecimal("0.73");

    /**
     * The callback when stuff on the Observable (Subject) has been updated.
     *
     * @param market the Observable (Subject) is passed in the update method for Observer to get at the changed
     *                   state.
     */
    @Override
    public void update(Market market) {
        if (market.getMarketType() == MarketType.USD_GBP) {
            latestUsdGbpMarketBidPrice = market.getLastBidPrice();
        } else if (market.getMarketType() == MarketType.USD_EUR) {
            latestUsdEurMarketBidPrice = market.getLastBidPrice();
        }
    }
}
