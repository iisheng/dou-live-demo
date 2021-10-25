package cn.iisheng.doulivedemo.createorder.withpattern.strategy;

import cn.iisheng.doulivedemo.createorder.common.OrderParams;
import cn.iisheng.doulivedemo.createorder.common.OrderResponse;

/**
 * @author iisheng
 * @date 2020/07/23 20:19:59
 * @description 下单接口使用策略模式
 */
public interface OrderStrategy {
    /**
     * 创建订单
     *
     * @param params
     * @return
     */
    OrderResponse createOrder(OrderParams params);
}
