public class Pool extends ExteriorDecorator {
    private Home home;

    protected Pool(Home home) {
        this.home = home;
    }

    public String getDescription() {
        return home.getDescription()+",Pool";
    }

    public double cost() {
        return 15.12+home.cost();
    }
}
