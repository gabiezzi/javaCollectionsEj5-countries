/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.CountryEntity;

/**
 *
 * @author Gabi
 */
public interface CountryService {
    
    public CountryEntity startNewCountry();
    public void addCountryToTheSet(CountryEntity newCountry);
    public String showSetValues();
    public String sortSetValues();
    public Boolean removeCountry(String countryToRemove);
    public void menu();
    
    
    
}
