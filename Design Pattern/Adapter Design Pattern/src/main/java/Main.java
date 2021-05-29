public class Main {

    public static void main(String[] args) {

        //.. initialize both the object using the same interface even when one is incompitable with other...
        EnemyAttack enemyAdapter = new EnemyAdapter(new EnemyRobot());
        EnemyAttack enemyAttack = new LandTank();

        enemyAdapter.weapon();
        enemyAdapter.assgnDriver("medivier");
        enemyAdapter.driveForward();


        enemyAttack.weapon();
        enemyAttack.assgnDriver("medivier");
        enemyAdapter.driveForward();
    }

}
