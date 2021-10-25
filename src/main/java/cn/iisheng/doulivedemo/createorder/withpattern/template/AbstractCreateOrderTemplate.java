package cn.iisheng.doulivedemo.createorder.withpattern.template;

import cn.iisheng.doulivedemo.createorder.common.OrderParams;
import cn.iisheng.doulivedemo.createorder.common.OrderResponse;
import cn.iisheng.doulivedemo.createorder.withpattern.strategy.OrderStrategy;
import org.springframework.util.Assert;

/**
 * @author iisheng
 * @date 2021/10/24 16:00:54
 */
public abstract class AbstractCreateOrderTemplate  {

    /**
     * 校验参数
     * @param orderParams
     */
    public void checkParams(OrderParams orderParams) {
        Assert.notNull(orderParams.getGoodsId(), "商品id不能为空");
    }

    /**
     * 保存订单
     * @param orderParams
     */
    public void saveOrder(OrderParams orderParams) {
        // insert db
    }

    /**
     * 特殊处理订单的逻辑
     *
     * @param params
     */
    protected abstract void dealWithOrder(OrderParams params);

    /**
     * 模板方法
     * @param params
     * @return
     */
    @Override
    public OrderResponse createOrder(OrderParams params) {
        // 1. 校验参数
        this.checkParams(params);

        // 2. 特殊处理逻辑
        this.dealWithOrder(params);

        // 3. 保存订单
        this.saveOrder(params);
        return null;
    }
}
