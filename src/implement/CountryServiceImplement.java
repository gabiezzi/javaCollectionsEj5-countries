package implement;

import entity.CountryEntity;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import service.CountryService;
import utilities.CountryComparators;
import java.util.ArrayList;
import constants.CountryConstants;

public class CountryServiceImplement implements CountryService {

    HashSet<CountryEntity> countries;
    Scanner read;

    public CountryServiceImplement() {
        this.countries = new HashSet();
        this.read = new Scanner(System.in).useDelimiter("\n");
    }

    @Override
    public CountryEntity startNewCountry() {
        CountryEntity newCountry = new CountryEntity();

        System.out.println("Insert the country name");

        newCountry.setCountryName(read.next());

        return newCountry;
    }

    public void addCountryToTheSet(CountryEntity newCountry) {

        countries.add(newCountry);

    }

    public String showSetValues() {

        String setValues = "The countries of the set are : \n";

        for (CountryEntity country : countries) {
            setValues += country.toString() + "\n";
        }

        return setValues;

    }

    public String sortSetValues() {

        String sortedSetValues = "The values of the set has been sorted :\n";

        ArrayList<CountryEntity> CountryList = new ArrayList(countries);

        Collections.sort(CountryList, utilities.CountryComparators.sortByCountryName);

        for (CountryEntity country : CountryList) {

            sortedSetValues += country.toString() + "\n";

        }

        return sortedSetValues;

    }

    public Boolean removeCountry(String countryToRemove) {

        for (CountryEntity country : countries) {

            if (country.getCountryName().equals(countryToRemove)) {

                countries.remove(country);
                return true;
            }

        }

        return false;

    }

    public void menu() {
        
        int option;
         
         do {
            
             System.out.println(constants.CountryConstants.MENU_MESSAGE);
             
             option = read.nextInt();
             
             switch (option) {
                 case 1:
                     CountryEntity newCountry = startNewCountry();
                     addCountryToTheSet(newCountry);
                             
                     break;
                 case 2:
                     System.out.println(showSetValues());
                     
                     break;
                 case 3:
                     System.out.println(sortSetValues());
                     
                     break;
                 case 4:
                     System.out.println(constants.CountryConstants.REMOVE_MESSAGE);
                     String countryToRemove = read.next();
                     if (!removeCountry(countryToRemove)) {
                         System.out.println("country doesnt exist in the set");
                     }
                     break;
                 case 5:
                     String optExit;
                     
                     System.out.println("Are you sure you want to exit ?");
                     
                     optExit= read.next();
                     
                     if (optExit.equalsIgnoreCase("y")) {
                         System.out.println("The program has finished.");
                     } else {
                         
                         option = 0;
                     }
                     break;
                 default:
                     throw new AssertionError();
             }
             
             
        } while (option!=5);
        
    }

}
