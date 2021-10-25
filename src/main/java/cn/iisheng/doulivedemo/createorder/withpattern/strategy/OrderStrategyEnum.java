package cn.iisheng.doulivedemo.createorder.withpattern.strategy;

/**
 * @author iisheng
 * @date 2020/07/24 15:06:41
 */
public enum OrderStrategyEnum {
    /**
     * 课程订单策略
     */
    COURSE("course", 1),
    /**
     * 会员订单策略
     */
    MEMBER("member", 2),
    /**
     * 天猫订单策略
     */
    TMALL("tmall", 3);

    private final String value;

    private final Integer code;


    OrderStrategyEnum(String value, Integer code) {
        this.value = value;
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }

    public static OrderStrategyEnum parseCode(Integer code) {
        for (OrderStrategyEnum orderStrategy : OrderStrategyEnum.values()) {
            if (orderStrategy.code.equals(code)) {
                return orderStrategy;
            }
        }
        throw new RuntimeException("no support");
    }

    public static OrderStrategyEnum parseValue(String value) {
        for (OrderStrategyEnum orderStrategy : OrderStrategyEnum.values()) {
            if (orderStrategy.value.equals(value)) {
                return orderStrategy;
            }
        }
        throw new RuntimeException("parse error");
    }
}