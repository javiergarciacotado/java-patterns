package com.owned.design.patterns.behavioral.command.example_1.command;

import com.owned.design.patterns.behavioral.command.example_1.domain.Trade;
import com.owned.design.patterns.behavioral.command.example_1.receiver.OrderTrade;

public class OrderTradeSellCommand implements TradeCommand {

    private final OrderTrade orderTrade;

    public OrderTradeSellCommand(OrderTrade orderTrade) {
        this.orderTrade = orderTrade;
    }

    @Override
    public void execute(Trade trade) {
        orderTrade.sell(trade);
    }
}
