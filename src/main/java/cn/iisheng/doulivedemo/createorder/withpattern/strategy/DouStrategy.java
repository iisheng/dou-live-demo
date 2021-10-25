package cn.iisheng.doulivedemo.createorder.withpattern.strategy;

import cn.iisheng.doulivedemo.createorder.common.OrderParams;
import cn.iisheng.doulivedemo.createorder.withpattern.template.AbstractCreateOrderTemplate;

/**
 * @author iisheng
 * @date 2021/10/24 18:23:42
 */
public class DouStrategy extends AbstractCreateOrderTemplate {

    @Override
    protected void dealWithOrder(OrderParams params) {
        // 实现 抖音 相关的 处理 逻辑 就可以了
    }
}
