public class AbstractTank extends AbstractFactoryProducer{

    private EnemyVechile enemyVechile = null;

    @Override
    EnemyVechile vechileInDemand(String Name) {
        if(Name.equals("WT")) {
            enemyVechile = new WaterTank();
        }
        return enemyVechile;
    }
}
