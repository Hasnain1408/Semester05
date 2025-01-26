package Strategy;


class NormalBehavior implements RobotBehavior {
    @Override
    public void performAction(RobotContext context) {
        System.out.println("Robot is in normal mode: Moving around and exploring.");
       
    }
}

