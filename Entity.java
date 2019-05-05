package javaapp;

import java.util.Random;

public class Entity{

    public int level = 1;
    public int exp = 100;

    public double life = 100;
    public double lifelimit = 200;
    public int state = 1;
    public double speed = 10;
    public int stamina = 2;
    public double str = 10;
    public double def = 10;
    public String name = "Default Name";
    public int[] attack = new int[4];

    public int chooseAttack() {
        Random rand = new Random();
        int n = rand.nextInt(stamina) + 0;
        return this.attack[n];
    }

    public void Damage(double points) {
        double sheild = points * this.def;
        points = points - sheild;
        if (points >= this.life) {
            this.life = 0;
            this.state = 0;
            System.out.println(this.name + " Died");
        } else {
            this.life -= points;
        }
    }

    public void addLife(double points) {
        for (int i = 1; i <= points; i++) {
            if (life == lifelimit) {
                i = (int) points;
            } else {
                life += 1;
            }
        }
        System.out.println(this.name + " +" + points);
    }

    public void levelUpMessage() {
        System.out.println(this.name + " Level Up!");
        System.out.println("Level " + this.level);
        System.out.println("Health Incressed! " + this.lifelimit);

    }

    public void checkExp() {
        if (this.exp == 99 && this.level == 1) {
            this.level = 2;
            incresseLife(.1);

        } else if (this.exp == 149 && this.level == 2) {
            this.level = 3;
            incresseLife(.1);

        } else if (this.exp == 199 && this.level == 3) {
            this.level = 4;
            incresseLife(.1);

        }
    }

    public void addExp(int exp) {
        System.out.println("Added Exp " + exp);
        System.out.println("Total Exp " + this.exp);
        for (int i = 1; i <= exp; i++) {
            this.exp += 1;
            checkExp();
        }
        System.out.println("--------------");
    }

    public void incresseLife(double i) {
        this.lifelimit += this.lifelimit * i;
        levelUpMessage();
    }

}
