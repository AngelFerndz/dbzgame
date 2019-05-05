/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

public class Arena extends Moves {

    public static Entity p1;
    public static Entity p2;
    public static String output = "";

    public Arena(Entity A, Entity B) {
        setPriority(A, B);
    }

    public String run(int Rounds) {
        output = "";
        for (int i = 0; i < Rounds; i++) {
            if (p1.life == 0 || p2.life == 0) {
                i = Rounds; //breaks for loop
            } else {
                output += "TURN :" + i + "\n";
                selectAttack(p1, p2);
                if (p2.life > 0) {
                    selectAttack(p2, p1);
                    if(i == 3){
                        p1.stamina = 3;
                        p2.stamina = 3;
                    }else if(i == 5){
                        p1.stamina = 4;
                        p2.stamina = 4;
                    }
                }
                output += "End Turn \n";
                output += p1.name + " " + p1.life + "/" + p1.lifelimit + "\n";
                output += p2.name + " " + p2.life + "/" + p2.lifelimit + "\n";
                output += "========================\n";
            }
        }
        return output;
    }

    public static void setPriority(Entity A, Entity B) {
        if (A.speed > B.speed) {
            p1 = A;
            p2 = B;

        } else {
            p1 = B;
            p2 = A;
        }
    }

    public static void selectAttack(Entity A, Entity B) {

        switch (A.chooseAttack()) {
            case 1:
                punch(A, B);
                break;
            case 2:
                kick(A, B);
                break;
            case 3:
                Kamehameha(A, B);
                break;
            case 4:
                GalickGun(A, B);
                break;
            case 5:
                SpiritBomb(A, B);
                break;
            case 6:
                FinalFlash(A, B);
                break;
            case 7:
                Heal(A);
                break;
        }
    }
}
