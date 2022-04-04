package com.owned.design.patterns.behavioral.command.example_1.command;

import com.owned.design.patterns.behavioral.command.example_1.domain.Trade;

/**
 * The command interface
 */
public interface TradeCommand {

    /**
     * Command invoker calls this
     * @param trade the current status trade
     */
    void execute(Trade trade);
}
