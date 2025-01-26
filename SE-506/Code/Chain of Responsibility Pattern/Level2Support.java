// Level 2 Support Handler
class Level2Support extends SupportHandler {
    @Override
    public void handleRequest(String issue, int complexityLevel) {
        if (complexityLevel == 2) {
            System.out.println("Level 2 Support resolved the issue: " + issue);
        } else if (nextHandler != null) {
            System.out.println("Level 2 Support forwarding the issue: " + issue);
            nextHandler.handleRequest(issue, complexityLevel);
        } else {
            System.out.println("Issue could not be resolved: " + issue);
        }
    }
}