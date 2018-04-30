package com.example.john.dragonballbattle;

/**
 * Created by John on 4/30/2018.
 */

public class Vegeta extends Fighter implements FighterMoves {
        private int multiplier = 1;

    public Vegeta(){
            //TEST
            super("Vegeta", 200, "Pride Boost", "Gallick Gun", "Final Explosion", "Final Flash");
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
        return "Both Opponent and Vegeta Lose 100 HP";
    }

    @Override
    public String specialAttack() {
        multiplier = 2;
        return "Kamehameha is Increased by 2-times for one move";
    }
}
