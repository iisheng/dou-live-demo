package cn.iisheng.doulivedemo.createorder.withpattern.strategy;

import cn.iisheng.doulivedemo.createorder.common.OrderParams;
import cn.iisheng.doulivedemo.createorder.withpattern.template.AbstractCreateOrderTemplate;
import org.springframework.stereotype.Component;

/**
 * @author iisheng
 * @date 2021/10/24 15:56:58
 */
@Component("tmall")
public class TmallStrategy extends AbstractCreateOrderTemplate {

    @Override
    protected void dealWithOrder(OrderParams params) {
        // 做自己业务逻辑的特殊处理

        // 天猫商品 ——> 我们自己系统的商品的 映射关系

        // 查询到 具体 的商品 以及 价格 相关信息

    }
}
