package cn.iisheng.doulivedemo.patterntemplate.strategy;

/**
 * @author iisheng
 * @date 2019/10/18 16:09:49
 * @description 具体的策略实现类之一
 */
public class ConcreteStrategy1 implements Strategy {

    /**
     * 具体的策略
     */
    @Override
    public void doSomething() {
        System.out.println("策略1");
    }
}
