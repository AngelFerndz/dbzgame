/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp.Characters;

import javaapp.Entity;

public class Goku extends Entity {

    public Goku() {
        this.name = "Goku";
        this.level = 1;

        this.lifelimit = 300;
        this.state = 1;
        this.exp = 1;

        this.str = 35;
        this.def = .15;
        this.speed = 10;
        this.life = 300;

        this.attack[0] = 1;
        this.attack[1] = 2;
        this.attack[2] = 3;
        this.attack[3] = 5;
    }

}
