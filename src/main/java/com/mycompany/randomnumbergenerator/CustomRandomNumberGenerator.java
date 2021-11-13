/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.randomnumbergenerator;

import java.math.BigInteger;
import java.util.Date;

/**
 *
 * @author sefaonder
 */
public class CustomRandomNumberGenerator {

    String givenSeed = "";
    private String prevHash = "";
    //hash class
    HashClass hash = new HashClass();

    CustomRandomNumberGenerator(String seed) {
        this.givenSeed = seed;

    }

    CustomRandomNumberGenerator() {

    }

    public int randomSeedGenerator(int bound) {

        String seedHash = "";

        for (int i = 0; i < 16; i++) {
            //get current time milis and blocking 16th times
            seedHash = hash.sha512(System.currentTimeMillis() + this.prevHash);
            this.prevHash = seedHash;
        }
        this.prevHash = "";
        seedHash = hash.sha512(seedHash + this.givenSeed);

        BigInteger one;
        one = new BigInteger(seedHash, 16);
        //get 16 character from bigInteger

        String seed = "0." + one.toString().substring(45, 45 + 16);

        return ((int) (Double.parseDouble(seed) * bound) + 1);

    }

}
