package cn.iisheng.doulivedemo.createorder.withpattern.chain;

import cn.iisheng.doulivedemo.createorder.common.OrderParams;

/**
 * @author iisheng
 * @date 2021/10/24 16:18:41
 */
public abstract class AbstractDiscountHandler {

    protected AbstractDiscountHandler nextHandler;

    public AbstractDiscountHandler() {

    }

    public AbstractDiscountHandler(AbstractDiscountHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * 处理请求
     *
     * @param params
     */
    public final void handle(OrderParams params) {
        // 判断 当前handler 是否能处理当前 请求
        // 能处理就 去 处理
        if (this.canExecute(params)) {
            this.currentHandle(params);
        }

        // 只要下一个handler 非空，就会 执行
        if (this.nextHandler != null) {
            this.nextHandler.handle(params);
        }
    }

    /**
     * 当前处理器 具体 要处理的 事情
     *
     * @param params
     */
    protected abstract void currentHandle(OrderParams params);

    /**
     * 判断是否可执行
     *
     * @param params
     * @return
     */
    protected abstract boolean canExecute(OrderParams params);
}
