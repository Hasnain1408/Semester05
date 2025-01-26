package Strategy;

class AggressiveBehavior implements RobotBehavior {
    @Override
    public void performAction(RobotContext context) {
        System.out.println("Robot is in aggressive mode: Attacking nearby obstacles!");
       
    }
}


