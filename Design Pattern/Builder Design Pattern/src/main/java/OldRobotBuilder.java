public class OldRobotBuilder implements RobotBuilder{

    private Robot robot ;
    public OldRobotBuilder() {
        this.robot = new Robot();
    }



    @Override
    public void buildRobotHead() {
        this.robot.setRobotHead("Tin Head");
    }

    @Override
    public void buildRobotTorso() {
        this.robot.setRobotTorso("Almunium Torso");
    }

    @Override
    public void buildRobotHand() {
        this.robot.setRobotHand("Alchemist Arms");
    }

    @Override
    public void buildRobotLegs() {
        this.robot.setRobotLegs("Roller skates");
    }

    @Override
    public Robot getRobot() {
        return this.robot;
    }
}
