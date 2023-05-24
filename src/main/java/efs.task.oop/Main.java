package efs.task.oop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        Villager kashya = new Villager("Kashya", 30);
        ExtraordinaryVillager akara = new ExtraordinaryVillager("Akara", 40, ExtraordinaryVillager.Skill.SHELTER);
        Villager gheed = new Villager("Gheed", 50);
        ExtraordinaryVillager deckardCain = new ExtraordinaryVillager("Deckard Cain", 85, ExtraordinaryVillager.Skill.IDENTIFY);
        Villager warriv = new Villager("Warriv", 35);
        Villager flawia = new Villager("Flawia", 25);



        kashya.sayHello();
        akara.sayHello();
        gheed.sayHello();
        deckardCain.sayHello();
        warriv.sayHello();
        flawia.sayHello();


        Object objectDeckardCain = deckardCain;
        Object objectAkara = akara;

        List<Villager> osadnicy = new LinkedList<>();
        osadnicy.add(kashya);
        osadnicy.add(akara);
        osadnicy.add(gheed);
        osadnicy.add(deckardCain);
        osadnicy.add(warriv);
        osadnicy.add(flawia);

        ListIterator<Villager> villagerListIterator = osadnicy.listIterator();
        Villager currentVillager = villagerListIterator.next();

        while (Monsters.getMonstersHealth()>0){
            System.out.println("Aktualnie walczacy osadnik to " + currentVillager.name);
            System.out.println("Potwory posiadaja jeszcze " + Monsters.getMonstersHealth() + " punkty zycia");
            if (Monsters.andariel.getHealth()>0) {
                currentVillager.attack(Monsters.andariel);
                Monsters.andariel.attack(currentVillager);
            }
            else{
                currentVillager.attack(Monsters.blacksmith);
                Monsters.blacksmith.attack(currentVillager);
            }
            if (!(Monsters.getMonstersHealth() > 0)){
                break;
            }
            if(!(currentVillager.getHealth()>0)){
                if (villagerListIterator.hasNext()){
                    currentVillager = villagerListIterator.next();
                }
                else{
                    System.out.println("Wszyscy osadnicy polegli");
                    break;
                }
            }

        }
        if (Monsters.getMonstersHealth() <= 0){
            System.out.println("Obozowisko ocalone!");
        }

    }
}
