package efs.task.oop;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;


public class Villager implements Fighter{
    protected final String name;
    protected final  int age;
    protected int health;


    public Villager(String name, int age) {
        this.name = name;
        this.age = age;
        this.health = 100;
    }

    public void sayHello(){
        System.out.println("Greetings traveler... I'm " + name + " and I'm " + age+ " years old");
    }

    @Override
    public void attack(Fighter victim) {
        victim.takeHit((int) ((100 - age*0.5)/10));
    }

    @Override
    public void takeHit(int damage) {
        this.health -= damage;
    }

    public int getHealth() {
        return health;
    }


    public void setHealth(int health) {
        this.health = health;
    }
}
