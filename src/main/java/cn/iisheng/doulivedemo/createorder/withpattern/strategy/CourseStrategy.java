package cn.iisheng.doulivedemo.createorder.withpattern.strategy;

import cn.iisheng.doulivedemo.createorder.common.Goods;
import cn.iisheng.doulivedemo.createorder.common.OrderParams;
import cn.iisheng.doulivedemo.createorder.withpattern.chain.CourseDiscountChain;
import cn.iisheng.doulivedemo.createorder.withpattern.template.AbstractCreateOrderTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @author iisheng
 * @date 2021/10/24 15:56:58
 */
@Component("course")
public class CourseStrategy extends AbstractCreateOrderTemplate {

    @Autowired
    private CourseDiscountChain discountChain;

    @Override
    protected void dealWithOrder(OrderParams params) {
        // 获取课程信息 从db获取 这里暂时 new
        Goods goods = new Goods();
        goods.setPrice(new BigDecimal("1988"));

        params.setAmount(goods.getPrice());

        // 责任链处理价格
        discountChain.handleDiscount(params);
    }

}
