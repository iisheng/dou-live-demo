package cn.iisheng.doulivedemo.patterntemplate.template;

/**
 * @author iisheng
 * @date 2021/10/24 11:10:55
 * @description 抽象模板类
 */
public abstract class AbstractTemplate {

    /**
     * 基本方法
     */
    protected abstract void doSomething();

    /**
     * 基本方法
     */
    protected abstract void doAnything();

    /**
     * 模板方法
     */
    public void templateMethod() {
        // 调用基本方法，完成业务逻辑
        this.doSomething();
        this.doAnything();
    }

}
