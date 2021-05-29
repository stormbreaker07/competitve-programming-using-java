public class NormalUfo implements EnemyVechile{

    private String name;
    private String weapon;
    private double damage;

    public NormalUfo() {
        name = "Zebra-1-UFO";
        weapon = "Machine gun";
        damage = 15.0;
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
