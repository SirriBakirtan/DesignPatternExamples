public class NearCityCenter implements PlaceBehaviour {
    public double addingForPlace(double currentPrice) {
        return currentPrice + 1;
    }

    public String description() {
        return " Near City Center";
    }

}
