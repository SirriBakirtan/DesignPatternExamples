public class SalonSet extends InteriorDecorator {
    private Home home;

    public SalonSet(Home home) {
        this.home = home;
    }

    public String getDescription() {
        return home.getDescription() +",Saloon Set";
    }

    public double cost() {
        return 5.342 + home.cost();
    }
}
