package impl;

import classes.Market;
import classes.Person;
import enums.Country;
import enums.Product;
import sevice.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceImpl implements Service {
    List<Person> people = new ArrayList<>();
    List<Market> markets = new ArrayList<>();
    List<Country> countries = new ArrayList<>();
    List<Product> products = new ArrayList<>();

    @Override
    public List<Market> getAllMarkets() {
        return markets;
    }

    @Override
    public String getMarketAddress() {
        try {
            System.out.print("WRITE MARKET NAME:");
            Scanner scanner = new Scanner(System.in);
            String marketName = scanner.nextLine().toLowerCase();
            if (marketName.isEmpty())
                throw new Exception("THE NAME OF THE MARKET SHOULD BE WRITTEN WITHOUT WORDS!!!");
            for (Market market : markets) {
                if (market.getName().toLowerCase().equals(marketName)) return market.getAddress();
            }
        } catch (Exception a) {
            a.printStackTrace();
        }
        return "MARKET NOT FOUD!!!";

    }

    @Override
    public List<Person> getAllPerson() {
        return people;
    }

    @Override
    public List<Country> getAllCountry() {
        return countries;
    }

    @Override
    public List<Product> getAllProduct() {
        return products;
    }

    @Override
    public Market getMarketByName() {
        try {
            System.out.print("WRITE MARKET NAME:");
            Scanner scanner = new Scanner(System.in);
            String marketName = scanner.nextLine().toLowerCase();
            if (marketName.isEmpty())
                throw new Exception("THE NAME OF THE MARKET SHOULD BE WRITTEN WITHOUT WORDS!!!");
            for (Market market : markets) {
                if (market.getName().toLowerCase().equals(marketName)) return market;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String createMarket() {
        try {
            System.out.print("MARKET NAME:");
            Scanner scanner = new Scanner(System.in);
            String marketName = scanner.nextLine();
            if (marketName.isEmpty())
                throw new Exception("THE NAME OF THE MARKET SHOULD BE WRITTEN WITHOUT WORDS!!!");


            System.out.print("ENTER YOUR COUNTRY:");
            String country = scanner.nextLine();
            if (country.isEmpty())
                throw new Exception("THE NAME OF THE COUNTRY SHOULD BE WRITTEN WITHOUT WORDS!!!");


            System.out.print("WRITE THE MARKET ADDRESS^");
            String address = new Scanner(System.in).nextLine();
            if (address.isEmpty())
                throw new Exception("THE NAME OF THE ADDRESS SHOULD BE WRITTEN WITHOUT WORDS!!!");

            System.out.print("CAN YOU GET MORE? (YES/NO):");
            String Products =scanner.next().toLowerCase();
            if (Products.isEmpty())
                throw new Exception("THE NAME OF THE AN ANSWER SHOULD BE WRITTEN WITHOUT WORDS!!!");

            List<Product> products;
            if (Products.equals("YES")) products = new ArrayList<>(List.of(Product.values()));
            else products = new ArrayList<>();
            return "SUCCESSFUL!!!";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    @Override
    public List<Product> ProduktByName() {
        List<Product> resultat = new ArrayList<>();
        try {
            System.out.print("MARKET NAME:");
            Scanner scanner = new Scanner(System.in);
            String marketName = scanner.nextLine().toLowerCase();
            if (marketName.isEmpty())
                throw new Exception("THE NAME OF THE MARKET SHOULD BE WRITTEN WITHOUT WORDS!!!");

            for (Market market : markets) {
                if (market.getName().toLowerCase().equals(marketName)) {
                    System.out.print("PRODUCT NAME:");
                    String productName = new Scanner(System.in).nextLine().toLowerCase();
                    if (productName.isEmpty()) throw new Exception("THE NAME OF THE PRODUCT SHOULD BE WRITTEN WITHOUT WORDS!!!");

                    for (Product product : market.getProducts()) {
                        if (product.name().toLowerCase().contains(productName)) resultat.add(product);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultat;
    }

    @Override
    public Person getPersonByName() {
        try {
            System.out.print("WRITE PERSON NAME:");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine().toLowerCase();
            if (name.isEmpty())
                throw new Exception("THE NAME OF THE PERSON SHOULD BE WRITTEN WITHOUT WORDS!!!");

            for (Person person : people) {
                if (person.getName().toLowerCase().equals(name))
                    return person;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String purchases() {
        return null;
    }


    @Override
    public List<String> getPersonCount() {
        try{
            System.out.print("ENTER YOUR NAME:");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine().toLowerCase();
            if(name.isEmpty())
                throw new Exception("THE NAME OF THE NAME SHOULD BE WRITTEN WITHOUT WORDS!!!");


            System.out.print("ENTER YOUR PASWORD:");
            String pasword = scanner.nextLine();
            if(pasword.isEmpty())
                throw new Exception("THE NAME OF THE PASWORD SHOULD BE WRITTEN WITHOUT WORDS!!!");

            for (Person person : people) {
                if(person.getName().equals(name)){
                 if (person.getPasword().equals(pasword)){
                        return person.getCount();
                    }
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
