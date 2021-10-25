package cn.iisheng.doulivedemo.createorder.common;

/**
 * @author iisheng
 * @date 2021/10/24 16:12:36
 */
public class User {
    /**
     * 自增id
     */
    private Long id;

    /**
     * 商品价格
     */
    private Integer type;

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return type;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
