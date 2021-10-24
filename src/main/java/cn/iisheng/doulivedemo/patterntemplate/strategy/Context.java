package cn.iisheng.doulivedemo.patterntemplate.strategy;

/**
 * @author iisheng
 * @date 2019/10/18 16:10:37
 * @description 处理策略的上下文类
 */
public class Context {
    /**
     * 抽象策略
     */
    private Strategy strategy;

    /**
     * 构造函数设置具体策略
     *
     * @param strategy
     */
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 封装后的策略防范
     */
    public void doAnyThing() {
        strategy.doSomething();
    }
}
