package enums;

public enum Product {
    MILK("MILK",65),
    CHEESE("CHEESE",120),
    WATER("WATER",45),
    COLA("COLA",75),
    TEA("TEA",150),
    FANTA("FANTA",80),
    TOYBOSS_SANDWICH("TOYBOSS_SANDWICH",80,7),
    TOYBOSS_BURGER("TOYBOSS_BURGER",80,7),
    TOIBOSS_PIZZA("TOIBOSS_PIZZA",65),
    BADYRAN("BADYRAN",150,7),
    A_TOMATO("A_TOMATO",170,7),
    CARROT("CARROT",70),
    CHIPS(" CHIPS",120),
    SUGAR("SUGAR",115,7),
    SALT("SALT",10),
    WATER_OIL("WATER_OIL",155,7),
    K_CHAYU("K_CHAYU",60),
    SMETANA("SMETANA",210,7),
    BREAD("BREAD",30);

    String name;
    int price;
    int discount = 7;

    Product(String name, int price, int discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }
    Product(String name , int price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
