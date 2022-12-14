package sevice;

import classes.Market;
import classes.Person;
import enums.Country;
import enums.Product;

import java.util.List;

public interface Service {
    List<Market> getAllMarkets();
    String getMarketAddress();
    List<Person> getAllPerson();
    List<Country> getAllCountry();
    List<Product> getAllProduct();
    Market getMarketByName();
    String createMarket();
    List<Product> ProduktByName();
    Person getPersonByName();
    String purchases();
    List<String> getPersonCount();

}
