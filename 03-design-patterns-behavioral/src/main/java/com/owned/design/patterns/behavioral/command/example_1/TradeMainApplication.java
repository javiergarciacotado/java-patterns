package com.owned.design.patterns.behavioral.command.example_1;

import com.owned.design.patterns.behavioral.command.example_1.command.OrderTradeBuyCommand;
import com.owned.design.patterns.behavioral.command.example_1.domain.Trade;
import com.owned.design.patterns.behavioral.command.example_1.invoker.OrderCommandInvoker;
import com.owned.design.patterns.behavioral.command.example_1.receiver.OrderTrade;

import java.math.BigDecimal;

public class TradeMainApplication {

    public static void main(String[] args) {
        final OrderCommandInvoker orderCommandInvoker = new OrderCommandInvoker(new OrderTradeBuyCommand(new OrderTrade()));
        orderCommandInvoker.execute(new Trade(1L, 100, BigDecimal.valueOf(2000)));
    }
}
