public class AbstractUfo extends AbstractFactoryProducer{

    private EnemyVechile enemyVechile = null;
    @Override
    EnemyVechile vechileInDemand(String name) {
        if (name.equals("NU")) {
            enemyVechile = new NormalUfo();
        } else if(name.equals("BU")) {
            enemyVechile = new BIgUfo();
        }
        return enemyVechile;
    }
}
