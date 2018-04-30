package com.example.john.dragonballbattle;

import java.util.ArrayList;

/**
 * Created by John on 4/19/2018.
 */

public class Goku extends Fighter implements FighterMoves {
    private int multiplier = 1;

    public Goku(){
        //TEST
        super("Goku", 200, "Kaioken", "Kamehameha", "Instant Transmission", "Spirit Bomb");
    }

   // @Override
    public static String getFighterName() {
        return null;
    }

    @Override
    public int normalAttack() {
        return 75 * multiplier;
    }

    @Override
    public int strongAttack() {
        return 125;
        //add accuracy for the attack
    }

    @Override
    public String defenseAttack() {
        return "Opposing Player Looses Turn";    }

    @Override
    public String specialAttack() {
        multiplier = 2;
        return "Kamehameha is Increased by 2-times for one move";
    }


//    public String normalKaioken(){
//        return "Strong Attack Is Twice As Strong";
//    }
//
//    public int strongKamehameha(){
//        return 75;
//    }
//
//    public String defenseInstantTransmission(){
//        return "Opposing Player Looses Turn";
//    }
//
//    public int specialSpiritBomb(){
//        return 125;
//    }

}
