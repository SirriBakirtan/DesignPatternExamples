public class DomesticAppliances extends InteriorDecorator {
    private Home home;

    protected DomesticAppliances(Home home) {
        this.home = home;
    }

    public String getDescription() {
        return home.getDescription()+",Refrigerator";
    }

    public double cost() {
        return 5.111 + home.cost();
    }
}
