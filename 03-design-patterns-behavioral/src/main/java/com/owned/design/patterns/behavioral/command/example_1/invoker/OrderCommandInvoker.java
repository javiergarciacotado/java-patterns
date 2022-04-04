package com.owned.design.patterns.behavioral.command.example_1.invoker;

import com.owned.design.patterns.behavioral.command.example_1.command.TradeCommand;
import com.owned.design.patterns.behavioral.command.example_1.domain.Trade;

public class OrderCommandInvoker {

    private final TradeCommand tradeCommand;

    public OrderCommandInvoker(TradeCommand tradeCommand) {
        this.tradeCommand = tradeCommand;
    }

    public void execute(Trade trade) {
        tradeCommand.execute(trade);
    }
}
