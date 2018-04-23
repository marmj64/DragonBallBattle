package com.example.john.dragonballbattle;

import java.util.ArrayList;

/**
 * Created by John on 4/19/2018.
 */

public class Goku extends Fighter implements FighterMoves {
    private int multiplier = 1;

    public Goku(){
        super("Goku", 200, "Kaioken", "Kamehameha", "Instant Transmission", "Spirit Bomb");
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
        return "Strong Attack Is Twice As Strong";
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
