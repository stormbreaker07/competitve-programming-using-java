public class FactoryProducer {

    private AbstractFactoryProducer abstractFactoryProducer = null;
    private EnemyVechile enemyVechile = null;

    public void chosseVechile(String name) {
        if(name.equals("WT")) {
            abstractFactoryProducer = new AbstractTank();
            enemyVechile = abstractFactoryProducer.vechileInDemand(name);
            System.out.println("Name: " + enemyVechile.getName() + ", Damage: " + enemyVechile.getDamage() + ", Weapon: " + enemyVechile.getWeapon());
        }
        else if(name.equals("NU") || name.equals("BU")) {
            abstractFactoryProducer = new AbstractUfo();
            enemyVechile = abstractFactoryProducer.vechileInDemand(name);
            System.out.println("Name: " + enemyVechile.getName() + ", Damage: " + enemyVechile.getDamage() + ", Weapon: " + enemyVechile.getWeapon());
        }
    }
}
