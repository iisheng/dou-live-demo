package cn.iisheng.doulivedemo.createorder.withpattern.chain;

import cn.iisheng.doulivedemo.createorder.common.OrderParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @author iisheng
 * @date 2021/10/24 16:28:06
 */
@Component("goods")
public class GoodsDiscountHandler extends AbstractDiscountHandler {

    /**
     * 定义了 商品 可优惠 的金额
     */
    private static final BigDecimal GOODS_DISCOUNT = new BigDecimal(1);

    @Autowired
    public GoodsDiscountHandler(CouponDiscountHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    protected void currentHandle(OrderParams params) {
        System.out.println("商品优惠");
        BigDecimal amount = params.getAmount();
        amount = amount.subtract(GOODS_DISCOUNT);
        params.setAmount(amount);
    }


    /**
     * 是否可享受、计算优惠方法
     * @param params
     * @return
     */
    @Override
    protected boolean canExecute(OrderParams params) {
        // 模拟 实际业务场景 商品id  == 1  才可以享受 商品优惠
        return params.getGoodsId().equals(1);
    }
}
