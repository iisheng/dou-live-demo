package cn.iisheng.doulivedemo.createorder.common;

import cn.iisheng.doulivedemo.createorder.nopattern.OrderService;
import cn.iisheng.doulivedemo.createorder.withpattern.strategy.OrderStrategyFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author iisheng
 * @date 2021/10/24 15:40:25
 */
@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/order")
    public OrderResponse createOrder(@RequestBody OrderParams orderParams) {
        return orderService.createOrder(orderParams);
    }








    @Autowired
    private OrderStrategyFactory orderStrategyFactory;

    @PostMapping("/pattern/order")
    public OrderResponse createOrderWithPattern(@RequestBody OrderParams orderParams) {
        return orderStrategyFactory.createOrder(orderParams);
    }
}
