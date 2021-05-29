public class LandTank implements EnemyAttack {


    @Override
    public void weapon() {
        System.out.println("tank have a missile launcher gives damage of 40");
    }

    @Override
    public void driveForward() {
        System.out.println("it has roller tyres");
    }

    @Override
    public void assgnDriver(String driver) {
        System.out.println("Driver name is " + driver );
    }
}
