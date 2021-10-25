package cn.iisheng.doulivedemo.createorder.withpattern.chain;

import cn.iisheng.doulivedemo.createorder.common.OrderParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author iisheng
 * @date 2021/10/24 16:35:31
 */
@Component
public class CourseDiscountChain {

    @Autowired
    private GoodsDiscountHandler handler;

    public void handleDiscount(OrderParams params){
        handler.handle(params);
    }
}
