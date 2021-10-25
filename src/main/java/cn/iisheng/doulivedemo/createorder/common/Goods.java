package cn.iisheng.doulivedemo.createorder.common;

import java.math.BigDecimal;

/**
 * @author iisheng
 * @date 2021/10/24 16:12:36
 */
public class Goods {
    /**
     * 自增id
     */
    private Long id;

    /**
     * 商品价格
     */
    private BigDecimal price;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
