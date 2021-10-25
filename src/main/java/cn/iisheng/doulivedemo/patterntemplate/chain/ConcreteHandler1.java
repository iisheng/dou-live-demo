package cn.iisheng.doulivedemo.patterntemplate.chain;

/**
 * @author iisheng
 * @date 2021/10/24 14:55:46
 * @descripton 具体Handler1
 */
public class ConcreteHandler1 extends AbstractHandler {

    private static final Integer FIRST_HANDLER = 1;

    private static final String FIRST_ECHO = "first echo";


    @Override
    protected Integer getLevel() {
        return FIRST_HANDLER;
    }

    /**
     * 具体处理请求的方法
     * @param request
     * @return
     */
    @Override
    protected String echo(String request) {
        return FIRST_ECHO;
    }
}
