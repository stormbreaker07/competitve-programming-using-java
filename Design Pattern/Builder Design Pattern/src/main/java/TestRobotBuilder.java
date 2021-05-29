public class TestRobotBuilder {

    private static RobotBuilder robotBuilder = null;
    public static void main(String[] args) {
        robotBuilder = new OldRobotBuilder();
        RobotEngineer robotEngineer = new RobotEngineer(robotBuilder);
        robotEngineer.makeRobot();
        Robot robot = robotEngineer.getRobot();
        System.out.println(robot);
    }
}
