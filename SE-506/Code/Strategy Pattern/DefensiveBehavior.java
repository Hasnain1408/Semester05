package Strategy;


class DefensiveBehavior implements RobotBehavior {
    @Override
    public void performAction(RobotContext context) {
        System.out.println("Robot is in defensive mode: Avoiding obstacles and protecting itself!");
       
    }
}
