/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import entity.CountryEntity;
import java.util.Comparator;

/**
 *
 * @author Gabi
 */
public class CountryComparators {

    public static Comparator<CountryEntity> sortByCountryName = new Comparator<CountryEntity>() {
        @Override
        public int compare(CountryEntity country1, CountryEntity country2) {

            return country1.getCountryName().compareTo(country2.getCountryName());
        }

    };

}
