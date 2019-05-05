/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp.Characters;

import javaapp.Entity;

/**
 *
 * @author angel
 */
public class Vegeta extends Entity {

    public Vegeta() {
        this.name = "Vegeta";
        this.level = 1;

        this.lifelimit = 300;
        this.state = 1;
        this.exp = 1;

        this.str = 35;

        this.speed = 10;
        this.life = 300;

        this.def = .15;

        this.attack[0] = 1;
        this.attack[1] = 2;
        this.attack[2] = 4;
        this.attack[3] = 6;

    }
    
}
