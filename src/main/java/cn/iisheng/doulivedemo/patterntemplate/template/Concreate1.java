package cn.iisheng.doulivedemo.patterntemplate.template;

/**
 * @author iisheng
 * @date 2021/10/24 11:14:17
 * @description 抽象模板方法的实现类之一
 */
public class Concreate1 extends AbstractTemplate {
    /**
     * 实现基本方法
     */
    @Override
    protected void doSomething() {
        // 业务逻辑处理
    }

    @Override
    protected void doAnything() {
        // 业务逻辑处理
    }
}
