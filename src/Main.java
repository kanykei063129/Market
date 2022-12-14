import classes.Person;
import impl.ServiceImpl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ServiceImpl service = new ServiceImpl();
        while (true) {

            System.out.print("""
                    1. Create Market
                    2. Get All Markets
                    3. Get All Person
                    4. Get Market by name
                    5. Get Person by name
                    6. Get All Product
                    7. Product by name
                    8. Get aAll Country
                    9. Purchases
                    10. Get Market Address
                    11. Get Person Count
                    """);
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            switch (number) {

                case 1:
                    System.out.println(service.createMarket());
                    break;

                case 2:
                    System.out.println(service.getAllMarkets());
                    break;
                case 3:
                    System.out.println(service.getAllPerson());
                case 4:
                    System.out.println(service.getMarketByName());
                    break;

                case 5:
                    System.out.println(service.getPersonByName());
                    break;
                case 6:
                    System.out.println(service.getAllProduct());
                    break;
                case 7:
                    System.out.println(service.ProduktByName());
                    break;
                case 8:
                    System.out.println(service.getAllCountry());
                    break;
                case 9:
                    System.out.println(service.purchases());
                    break;
                case 10:
                    System.out.println(service.getMarketAddress());
                    break;
                case 11:
                    System.out.println(service.getPersonCount());
            }
        }
    }
}