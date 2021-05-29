public class BIgUfo implements EnemyVechile{

    private String name;
    private String weapon;
    private double damage;

    public BIgUfo() {
        name = "Hell-0-Mark-3";
        weapon = "Plasma lazer beam";
        damage = 30.0;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getWeapon() {
        return this.weapon;
    }

    @Override
    public double getDamage() {
        return this.damage;
    }
}
