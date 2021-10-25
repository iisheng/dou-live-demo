package cn.iisheng.doulivedemo.patterntemplate.chain;

/**
 * @author iisheng
 * @date 2021/10/24 14:55:46
 * @descripton 具体Handler2
 */
public class ConcreteHandler2 extends AbstractHandler {

    private static final Integer SECOND_HANDLER = 1;

    private static final String SECOND_ECHO = "first echo";


    @Override
    protected Integer getLevel() {
        return SECOND_HANDLER;
    }

    @Override
    protected String echo(String request) {
        return SECOND_ECHO;
    }
}
