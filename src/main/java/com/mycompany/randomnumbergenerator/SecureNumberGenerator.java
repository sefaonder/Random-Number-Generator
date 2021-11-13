/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.randomnumbergenerator;

import java.util.LinkedList;

/**
 *
 * @author sefaonder
 */
public class SecureNumberGenerator {

    private String PrevHash = "";
    private int randomNumber;

    //to checking saving previous random number
    LinkedList<Integer> numberSpace = new LinkedList<Integer>();

    int bound;

    public SecureNumberGenerator(int bound) {
        //constructer
        this.bound = bound;

    }
    //hash class
    HashClass hash = new HashClass();

    public int randomNumberRaw(int number, String studentNo) {
        CustomRandomNumberGenerator rand = new CustomRandomNumberGenerator();
        //generated new hexCode with prevHash
        String hexCode = hash.sha512(number + studentNo + this.PrevHash);
        //assign generated hexCode to PrevHash state
        this.PrevHash = hexCode;
        String hexNumber = "";

       
        
        CustomRandomNumberGenerator randSecure = new CustomRandomNumberGenerator(hexCode);

        this.randomNumber = randSecure.randomSeedGenerator(bound - 1) + 1;
        
        //check prev random number already exist
        numberSpace.forEach((index) -> {
            while (this.randomNumber == index) {
                this.randomNumber = randSecure.randomSeedGenerator(bound - 1) + 1;
            }
        });

        numberSpace.add(this.randomNumber);
        //System.out.println("list" + numberSpace);
        //return random number

        return this.randomNumber;

    }

}
