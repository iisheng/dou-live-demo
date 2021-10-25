package cn.iisheng.doulivedemo.createorder.withpattern.strategy;

import cn.iisheng.doulivedemo.createorder.common.OrderParams;
import cn.iisheng.doulivedemo.createorder.withpattern.template.AbstractCreateOrderTemplate;
import org.springframework.stereotype.Component;

/**
 * @author iisheng
 * @date 2021/10/24 15:56:58
 */
@Component("member")
public class MemberStrategy extends AbstractCreateOrderTemplate {

    /**
     * 这里 处理 会员 订单相关的具体 逻辑
     * @param params
     */
    @Override
    protected void dealWithOrder(OrderParams params) {
        // 1. 查询会员 相关 商品属性
        // 2. 处理商品相关 价格

    }
}
