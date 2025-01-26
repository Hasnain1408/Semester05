package Strategy;

class RobotContext {
    private RobotBehavior currentBehavior;
    private String position;
    private String nearbyObstacles;

    public RobotContext(RobotBehavior initialBehavior, String position, String nearbyObstacles) {
        this.currentBehavior = initialBehavior;
        this.position = position;
        this.nearbyObstacles = nearbyObstacles;
    }

    public void setBehavior(RobotBehavior newBehavior) {
        this.currentBehavior = newBehavior;
    }

    public void performAction() {
        currentBehavior.performAction(this);
    }

    public void updateEnvironment(String newPosition, String newObstacles) {
        this.position = newPosition;
        this.nearbyObstacles = newObstacles;
        System.out.println("Environment updated - Position: " + position + ", Obstacles: " + nearbyObstacles);
    }

    // Getters for context information
    public String getPosition() {
        return position;
    }

    public String getNearbyObstacles() {
        return nearbyObstacles;
    }
}