public class OnePlusOneApartment extends Home {
    PlaceBehaviour placeBehaviour;
    double price;

    public void setPrice(double price) {
        this.price = placeBehaviour.addingForPlace(price);
    }

    public OnePlusOneApartment(PlaceBehaviour placeBehaviour) {
        this.placeBehaviour = placeBehaviour;
        description = "Your (1+1) Apartment properties is a"+placeBehaviour.description();
    }

    public double cost() {
        return price + 100.5;
    }
}
