package efs.task.oop;

public class ExtraordinaryVillager extends Villager implements Fighter{

    private final Skill skill;

    public ExtraordinaryVillager(String name, int age, Skill skill) {
        super(name, age);
        this.skill = skill;
    }

    @Override
    public void sayHello() {
        switch(this.skill){
            case IDENTIFY -> System.out.println("Greetings traveler... I'm " + name + " and I'm " + age
                    + " years old. I will identify items for you at no charge.");
            case SHELTER -> System.out.println("Greetings traveler... I'm " + name + " and I'm " + age
                    + " years old. I can offer you poor shelter.");
        }

    }

    @Override
    public void attack(Fighter victim) {
        victim.takeHit(0);
    }

    @Override
    public void takeHit(int damage) {
        super.takeHit(health);
    }

    public enum Skill {
        IDENTIFY("I will identify items for you at no charge."),
        SHELTER("I can offer you poor shelter.");

        private String message;

        Skill(String message) {
            this.message = message;
        }

        public String getDescription() {
            return message;
        }
    }


}
