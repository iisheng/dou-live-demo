package cn.iisheng.doulivedemo.createorder.withpattern.strategy;

import cn.iisheng.doulivedemo.createorder.common.OrderParams;
import cn.iisheng.doulivedemo.createorder.common.OrderResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Objects;

/**
 * @author iisheng
 * @date 2020/07/24 14:36:49
 */
@Component
public class OrderStrategyFactory {

    @Autowired
    private Map<String, OrderStrategy> orderStrategyMap;

    public OrderResponse createOrder(OrderParams params) {
        if (Objects.isNull(params)) {
            throw new RuntimeException("params is error");
        }

        // 防止前端没传相关策略 给个默认策略
        if (Objects.isNull(params)) {
            params.setStrategy(OrderStrategyEnum.COURSE.getCode());
        }

        // 根据参数 code 获取 订单策略枚举 获取不到 会抛出 参数非法
        OrderStrategyEnum orderStrategy = OrderStrategyEnum.parseCode(params.getStrategy());
        // 获取具体策略对象 使用该策略创建订单
        return orderStrategyMap.get(orderStrategy.getValue()).createOrder(params);
    }

}
