public class EnemyAdapter implements EnemyAttack{

    private EnemyRobot enemyRobot= null;
    public EnemyAdapter(EnemyRobot enemyRobot) {
        this.enemyRobot = enemyRobot;
    }

    @Override
    public void weapon() {
        enemyRobot.crushWithHands();
    }

    @Override
    public void driveForward() {
        enemyRobot.walkOnFeet();
    }

    @Override
    public void assgnDriver(String driver) {
        enemyRobot.kills(driver);
    }
}
