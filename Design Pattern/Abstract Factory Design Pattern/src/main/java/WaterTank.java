public class WaterTank implements EnemyVechile{

        private String name;
        private String weapon;
        private double damage;

        public WaterTank() {
            name = "Shark-endever-3";
            weapon = "Missile";
            damage = 10.0;
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
