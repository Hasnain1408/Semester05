// Level 3 Support Handler
class Level3Support extends SupportHandler {
    @Override
    public void handleRequest(String issue, int complexityLevel) {
        if (complexityLevel >= 3) {
            System.out.println("Level 3 Support resolved the issue: " + issue);
        } else if (nextHandler != null) {
            System.out.println("Level 3 Support forwarding the issue: " + issue);
            nextHandler.handleRequest(issue, complexityLevel);
        } else {
            System.out.println("Issue could not be resolved: " + issue);
        }
    }
}
