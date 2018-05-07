package com.example.john.dragonballbattle;

/**
 * Created by John on 5/2/2018.
 */

public class Beerus extends Fighter implements FighterMoves {
    private int multiplier = 1;

    public Beerus(){
        //TEST
        super("Beerus", 200, "Pressure Point Attack", "Wrath of the God of Destruction", "Energy Nullification", "Hakai");
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
        return "Opposing Player Looses Turn";
    }

    @Override
    public String specialAttack() {
        multiplier = 2;
        return "Opponent Attack does";
    }



}
