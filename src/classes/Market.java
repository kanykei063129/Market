package classes;

import enums.Country;
import enums.Product;

import java.util.List;

public class Market {
    private String name;
    private Country country;
    private String address;
    private List<Product> products;

    public Market(String name, Country country, String address, List<Product> products) {
        this.name = name;
        this.country = country;
        this.address = address;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Market{" +
                "name='" + name + '\'' +
                ", country=" + country +
                ", address='" + address + '\'' +
                ", products=" + products +
                "\n----------------------\n";

    }
}
