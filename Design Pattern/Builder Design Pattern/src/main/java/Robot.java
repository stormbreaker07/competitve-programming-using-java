public class Robot implements RobotPlan{

    private String robotHead;
    private String robotTorso;
    private String robotHand;
    private String robotLegs;


    @Override
    public void setRobotHead(String head) {
        this.robotHead = head;
    }

    @Override
    public void setRobotTorso(String torso) {
        this.robotTorso = torso;
    }

    @Override
    public void setRobotHand(String hand) {
        this.robotHand = hand;
    }

    @Override
    public void setRobotLegs(String legs) {
        this.robotLegs = legs;
    }

    public String getRobotHead() {
        return robotHead;
    }

    public String getRobotTorso() {
        return robotTorso;
    }

    public String getRobotHand() {
        return robotHand;
    }

    public String getRobotLegs() {
        return robotLegs;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "robotHead='" + robotHead + '\'' +
                ", robotTorso='" + robotTorso + '\'' +
                ", robotHand='" + robotHand + '\'' +
                ", robotLegs='" + robotLegs + '\'' +
                '}';
    }
}
