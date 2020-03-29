public class Ground extends Transport {
    private int quantity_wheel;
    private int fuel_consumption;

    public Ground(int power, int speed, int weight, String model, int quantity_wheel,
                  int fuel_consumption) {
        super(power, speed, weight, model);
        this.quantity_wheel = quantity_wheel;
        this.fuel_consumption = fuel_consumption;
    }

    public Ground(){}

    public int getQuantity_wheel() {
        return quantity_wheel;
    }

    public void setQuantity_wheel(int quantity_wheel) {
        this.quantity_wheel = quantity_wheel;
    }

    public int getFuel_consumption() {
        return fuel_consumption;
    }

    public void setFuel_consumption(int fuel_consumption) {
        this.fuel_consumption = fuel_consumption;
    }

    @Override
    public String toString() {
        return super.toString() + quantity_wheel + " " + fuel_consumption + " ";
    }
}
