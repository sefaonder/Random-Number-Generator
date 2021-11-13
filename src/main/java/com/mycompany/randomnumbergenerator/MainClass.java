/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.randomnumbergenerator;

/**
 *
 * @author sefaonder
 */
public class MainClass {

    /*public static void LFSR() {
        int state = (1 << 127) | 1;
        for (int i = 0; i < 100; i++) {
            System.out.print(state & 1);
            int newbit = (state ^ (state >> 1) ^ (state >> 2) ^ (state >> 7));
            state = (state >> 1) | (newbit << 127);

        }
    }*/

    public static void main(String[] args) {
        
        int soru_1, soru_2, soru_3, soru_4, soru_5, soru_yedek_6, soru_yedek_7;
        SecureNumberGenerator hextoNumber = new SecureNumberGenerator(40); //set bound

        //
        soru_1 = hextoNumber.randomNumberRaw(10, "032090003");
        soru_2 = hextoNumber.randomNumberRaw(soru_1, "032090003");
        soru_3 = hextoNumber.randomNumberRaw(soru_2, "032090003");
        soru_4 = hextoNumber.randomNumberRaw(soru_3, "032090003");
        soru_5 = hextoNumber.randomNumberRaw(soru_4, "032090003");
        soru_yedek_6 = hextoNumber.randomNumberRaw(soru_5, "032090003");
        soru_yedek_7 = hextoNumber.randomNumberRaw(soru_yedek_6, "032090003");

        //print the questions to console
        System.out.println("soru_1: " + soru_1);
        System.out.println("soru_2: " + soru_2);
        System.out.println("soru_3: " + soru_3);
        System.out.println("soru_4: " + soru_4);
        System.out.println("soru_5: " + soru_5);
        System.out.println("soru_6: " + soru_yedek_6);
        System.out.println("soru_7: " + soru_yedek_7);
        
 
        

       
    }

}
