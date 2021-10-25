package cn.iisheng.doulivedemo.patterntemplate.chain;


/**
 * @author iisheng
 * @date 2021/10/24 15:07:12
 * @description 客户端
 */
public class Client {

    private static final String CURRENT = "2";

    public static void main(String[] args) {
        AbstractHandler handler1 = new ConcreteHandler1();
        AbstractHandler handler2 = new ConcreteHandler1();

        handler1.setNext(handler2);

        System.out.println(handler1.handle(CURRENT));
    }

}
