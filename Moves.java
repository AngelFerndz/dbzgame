package dbzgame;

import java.util.Random;

/* Angel Fernandez */
public class Moves {

    public static void punch(Entity A, Entity B) {
        Random rand = new Random();
        int i = rand.nextInt(3) + 1;
        double power = A.str * 1.1;
        Arena.output += A.name + " Threw a Punch \n";
        if (i == 1) {

            Arena.output += B.name + " Blocked Punch!\n";
        } else {
            B.Damage(power);
            Arena.output += B.name + " Hit -" + power + "\n";
        }
    }

    public static void kick(Entity A, Entity B) {
        Random rand = new Random();
        int i = rand.nextInt(3) + 1;
        double power = A.str * 1.3;

        Arena.output += A.name + " used Kick -" + power + "\n";

        if (i == 1) {
            Arena.output += B.name + " Blocked Kick!\n";
        } else {
            B.Damage(power);

        }
    }

    public static void Kamehameha(Entity A, Entity B) {
        Random rand = new Random();
        int i = rand.nextInt(5) + 1;
        double power = A.str * 2.5;

        Arena.output += A.name + " used Kamehameha! -" + power + "\n";

        if (i == 1) {
            Arena.output += B.name + " Evaded Kamehameha!\n";
        } else {
            B.Damage(power);
        }
    }

    public static void GalickGun(Entity A, Entity B) {
        Random rand = new Random();
        int i = rand.nextInt(5) + 1;
        double power = A.str * 2.5;

        Arena.output += A.name + " Galick Gun! -" + power + "\n";

        if (i == 1) {
            Arena.output += B.name + " Evaded GalickGun!\n";
        } else {
            B.Damage(power);
        }
    }

    public static void SpiritBomb(Entity A, Entity B) {
        Random rand = new Random();
        int i = rand.nextInt(20) + 1;
        double power = A.str * 5;

        Arena.output += A.name + " used SpiritBomb! -" + power + "\n";

        if (i == 1) {
            Arena.output += B.name + " Evaded SpiritBomb!\n";
        } else if (i == 20) {
            Arena.output += "Holy Fuck " + B.name + " Pushed Back The SpiritBomb!!!!\n";
            A.Damage(power);
        } else {
            B.Damage(power);
        }
    }

    public static void FinalFlash(Entity A, Entity B) {
        Random rand = new Random();
        int i = rand.nextInt(10) + 1;
        double power = A.str * 4;

        Arena.output += A.name + " used FinalFlash! -" + power + "\n";

        if (i == 1) {
            Arena.output += B.name + " Evaded FinalFlash!\n";
        } else if (i == 10) {
            Arena.output += B.name + " Countered FinalFlash!!!\n";
            A.Damage(power);
        } else {
            B.Damage(power);
        }
    }

    public static void Heal(Entity A) {
        A.addLife(20);
    }

}
