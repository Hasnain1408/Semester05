// Level 1 Support Handler
class Level1Support extends SupportHandler {
    @Override
    public void handleRequest(String issue, int complexityLevel) {
        if (complexityLevel == 1) {
            System.out.println("Level 1 Support resolved the issue: " + issue);
        } else if (nextHandler != null) {
            System.out.println("Level 1 Support forwarding the issue: " + issue);
            nextHandler.handleRequest(issue, complexityLevel);
        } else {
            System.out.println("Issue could not be resolved: " + issue);
        }
    }
}



