package cn.iisheng.doulivedemo.createorder.common;

import java.math.BigDecimal;

/**
 * @author iisheng
 * @date 2021/10/24 15:40:50
 */
public class OrderParams {
    /**
     * 商品id
     */
    private Integer goodsId;

    /**
     * 商品类型
     */
    private Integer goodsType;

    /**
     * 下单策略
     */
    private Integer strategy;

    /**
     * 计算后要保存到订单中的金额 （非前端传）
     */
    private BigDecimal amount;

    /**
     * 是否是优惠券
     */
    private Boolean isCoupon;

    public Boolean getCoupon() {
        return isCoupon;
    }


    public void setCoupon(Boolean coupon) {
        isCoupon = coupon;
    }

    public void setMember(Boolean member) {
        isMember = member;
    }

    /**
     * 是否是会员
     */
    private Boolean isMember;

    public Boolean getMember() {
        return isMember;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getGoodsType() {
        return goodsType;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public void setGoodsType(Integer goodsType) {
        this.goodsType = goodsType;
    }

    public void setStrategy(Integer strategy) {
        this.strategy = strategy;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public Integer getStrategy() {
        return strategy;
    }
}
