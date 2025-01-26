// Handler Interface
abstract class SupportHandler {
    protected SupportHandler nextHandler;

    // Set the next handler in the chain
    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // Handle the support request
    public abstract void handleRequest(String issue, int complexityLevel);
}
