import static java.lang.Math.round;

public class LetsTest {
    public static void main(String[] args) {
        Home home = new OnePlusOneApartment(new NearCityCenter());
        ((OnePlusOneApartment) home).setPrice(home.cost());
        home = new Garage(home);
        home = new Pool(home);
        home = new SalonSet(home);
        System.out.println(home.getDescription());
        System.out.println("The amount you have to pay : " + round(home.cost())+",99 Turkish Lira");
    }
}