package cn.iisheng.doulivedemo.createorder.withpattern.chain;

import cn.iisheng.doulivedemo.createorder.common.OrderParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @author iisheng
 * @date 2021/10/24 16:28:06
 */
@Component("coupon")
public class CouponDiscountHandler extends AbstractDiscountHandler {

    private static final BigDecimal COUPON = new BigDecimal(10);

    @Autowired
    public CouponDiscountHandler(MemberDiscountHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected void currentHandle(OrderParams params) {
        System.out.println("优惠券");
        BigDecimal amount = params.getAmount();
        amount = amount.subtract(COUPON);
        params.setAmount(amount);
    }

    @Override
    protected boolean canExecute(OrderParams params) {
        return params.getCoupon();
    }
}
