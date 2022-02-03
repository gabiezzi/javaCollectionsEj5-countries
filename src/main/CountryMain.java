/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import implement.CountryServiceImplement;

/**
 *
 * @author Gabi
 */
public class CountryMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CountryServiceImplement newService = new CountryServiceImplement();
        newService.menu();
        

    }
    
}
