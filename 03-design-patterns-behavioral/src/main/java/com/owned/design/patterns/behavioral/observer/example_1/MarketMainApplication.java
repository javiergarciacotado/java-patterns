package com.owned.design.patterns.behavioral.observer.example_1;

import com.owned.design.patterns.behavioral.observer.example_1.domain.bot.BbvaTradingBot;
import com.owned.design.patterns.behavioral.observer.example_1.domain.bot.LaCaixaTradingBot;
import com.owned.design.patterns.behavioral.observer.example_1.domain.market.DollarEuroMarket;
import com.owned.design.patterns.behavioral.observer.example_1.domain.market.Market;
import com.owned.design.patterns.behavioral.observer.example_1.domain.market.MarketType;

import java.math.BigDecimal;

public class MarketMainApplication {

    public static void main(String[] args) {
        final Market dollarEuroMarket = DollarEuroMarket.getInstance();
        dollarEuroMarket.registerPriceObserver(new BbvaTradingBot());
        dollarEuroMarket.registerPriceObserver(new LaCaixaTradingBot());
        dollarEuroMarket.createNewBuyOrder(BigDecimal.valueOf(10), MarketType.USD_EUR);

    }
}
