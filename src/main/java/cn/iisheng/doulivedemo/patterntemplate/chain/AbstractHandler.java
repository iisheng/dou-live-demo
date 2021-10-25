package cn.iisheng.doulivedemo.patterntemplate.chain;

/**
 * @author iisheng
 * @date 2021/10/24 14:44:45
 * @descripton 抽象Handler
 */
public abstract class AbstractHandler {

    private AbstractHandler nextHandler;

    /**
     * 设置下一个处理器
     *
     * @param nextHandler
     */
    public void setNext(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * 处理请求
     *
     * @param request
     */
    public final String handle(String request) {
        if (this.getLevel().equals(request)) {
            return this.echo(request);
        } else {
            if (this.nextHandler != null) {
                return this.nextHandler.echo(request);
            } else {
                throw new RuntimeException("no handler");
            }
        }
    }


    /**
     * 获取下一个处理器
     *
     * @return
     */
    public AbstractHandler getNextHandler() {
        return nextHandler;
    }

    /**
     * 获取level
     *
     * @return
     */
    protected abstract Integer getLevel();

    /**
     * 响应
     *
     * @param request
     * @return
     */
    protected abstract String echo(String request);
}


