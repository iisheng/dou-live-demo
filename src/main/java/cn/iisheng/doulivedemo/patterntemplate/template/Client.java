package cn.iisheng.doulivedemo.patterntemplate.template;


/**
 * @author iisheng
 * @date 2021/10/24 11:16:29
 * @description 模板方法场景类
 */
public class Client {

    public static void main(String[] args) {
        AbstractTemplate template = new Concreate1();
        // 调用模板方法
        template.templateMethod();
    }
}
