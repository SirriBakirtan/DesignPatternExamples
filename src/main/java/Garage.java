public class Garage extends ExteriorDecorator {
    Home home;

    public Garage(Home home) {
        this.home = home;
    }

    public String getDescription() {
        return home.getDescription()+",Garage";
    }

    public double cost() {
        return 10.123 + home.cost();
    }
}
