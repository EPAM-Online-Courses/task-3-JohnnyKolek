package efs.task.oop;

public class Monsters {
    public static final Monster andariel = new Monster(10,70) {
        @Override
        public void attack(Fighter victim) {
            victim.takeHit(this.getDamage());
        }

        @Override
        public void takeHit(int damage) {
            this.setHealth(this.getHealth()-damage);
            monstersHealth -= damage;

        }
    };

    public static final Monster blacksmith = new Monster(100,25) {
        @Override
        public void attack(Fighter victim) {
            victim.takeHit(this.getDamage());
        }

        @Override
        public void takeHit(int damage) {
            this.setHealth(this.getHealth()-(damage + 5));
            monstersHealth -= 5 + damage;

        }
    };
    private static int monstersHealth = andariel.getHealth() + blacksmith.getHealth();

    public static int getMonstersHealth() {
        return monstersHealth;
    }
}
