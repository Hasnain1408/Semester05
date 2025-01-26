package Strategy;

public class Main {
    public static void main(String[] args) {
        
        RobotContext robot1 = new RobotContext(new AggressiveBehavior(), "Position A", "Obstacle X");
        RobotContext robot2 = new RobotContext(new DefensiveBehavior(), "Position B", "Obstacle Y");

        robot1.performAction();
        robot2.performAction();

        // Change behaviors dynamically
        robot1.setBehavior(new NormalBehavior());
        robot1.updateEnvironment("Position C", "Obstacle Z");
        robot1.performAction();

        robot2.setBehavior(new AggressiveBehavior());
        robot2.updateEnvironment("Position D", "Obstacle W");
        robot2.performAction();
    }
}