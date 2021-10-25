package cn.iisheng.doulivedemo.createorder.withpattern.chain;

import cn.iisheng.doulivedemo.createorder.common.OrderParams;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @author iisheng
 * @date 2021/10/24 16:28:06
 */
@Component("member")
public class MemberDiscountHandler extends AbstractDiscountHandler {

    private static final BigDecimal DISCOUNT = new BigDecimal("0.826");

    @Override
    protected void currentHandle(OrderParams params) {
        System.out.println("商品优惠");
        BigDecimal amount = params.getAmount();
        amount = amount.multiply(DISCOUNT);
        params.setAmount(amount);
    }

    @Override
    protected boolean canExecute(OrderParams params) {
        return params.getMember();
    }
}
