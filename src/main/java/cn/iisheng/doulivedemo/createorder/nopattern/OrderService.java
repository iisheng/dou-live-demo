package cn.iisheng.doulivedemo.createorder.nopattern;

import cn.iisheng.doulivedemo.createorder.common.OrderParams;
import cn.iisheng.doulivedemo.createorder.common.OrderResponse;
import cn.iisheng.doulivedemo.createorder.common.User;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

/**
 * @author iisheng
 * @date 2021/10/24 16:08:50
 */
@Service
public class OrderService {


    /**
     * 课程订单类型
     */
    private static final Integer COURSE_TYPE_ORDER = 1;
    /**
     * 会员订单类型
     */
    private static final Integer MEMBER_TYPE_ORDER = 1;
    /**
     * 天猫订单类型
     */
    private static final Integer TMALL_TYPE_ORDER = 1;

    /**
     * 用户身份 普通用户
     */
    private static final Integer USER_TYPE_NORMAL = 1;

    /**
     * 用户身份 会员
     */
    private static final Integer USER_TYPE_MEMBER = 2;

    /**
     * 创建订单
     *
     * @param params
     * @return
     */
    public OrderResponse createOrder(OrderParams params) {

        // 参数校验
        this.checkParams(params);

        // 创建 课程订单
        if (COURSE_TYPE_ORDER.equals(params.getStrategy())) {
            // 获取课程相关信息

            // 判断是否享受 课程优惠

            // 判断是否享受 优惠券 优惠

            // 查询优惠券 判断 优惠券 过没过期 是不是 使用过

            // 判断 是否享受会员身份优惠 从DB查的user，我们这里就new 一个
            User user = new User();
            user.setType(USER_TYPE_MEMBER);

            if (USER_TYPE_MEMBER.equals(user.getType())) {
                // 这块 又要 处理  会员 相关的优惠信息

                // 价格 打5折
                // if - else

            }

            // ...



            // ...


            // ...

            // 需求来了 继续 改

        } else if (MEMBER_TYPE_ORDER.equals(params.getStrategy())) {
            // 售卖 会员

            // 这块 就是 会员 订单 的 创建 流程


            // 查询 会员商品相关信息

        } else if (TMALL_TYPE_ORDER.equals(params.getStrategy())) {
            // 获取天猫商品跟我们商品系统的对应关系相关信息
        } else {
            throw new RuntimeException("no support strategy");
        }

        return null;
    }

    /**
     * 校验参数
     *
     * @param params
     */
    private void checkParams(OrderParams params) {
        Assert.notNull(params.getGoodsId(), "商品id不能为空");
    }

    /**
     * 计算优惠
     *
     * @param params
     */
    private void calcDiscount(OrderParams params) {

    }


    /**
     * 保存订单信息
     *
     * @param params
     */
    private void saveOrder(OrderParams params) {
        // 保存订单
    }


    /**
     * 改需求新加的
     */
    private void method(){

    }
}
