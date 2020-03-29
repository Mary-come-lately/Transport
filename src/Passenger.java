import java.util.Scanner;

public class Passenger extends Ground {
    private String body_type;
    private int quantity_passengers;
    Scanner scan = new Scanner(System.in);
    public int time;

    public Passenger(int power, int speed, int weight, String model, int quantity_wheel,
                     int fuel_consumption, String body_type, int quantity_passengers) {
        super(power, speed, weight, model, quantity_wheel, fuel_consumption);
        this.body_type = body_type;
        this.quantity_passengers = quantity_passengers;
    }

    public Passenger(){}

    public String getBody_type() {
        return body_type;
    }

    public void setBody_type(String body_type) {
        this.body_type = body_type;
    }

    public int getQuantity_passengers() {
        return quantity_passengers;
    }

    public void setQuantity_passengers(int quantity_passengers) {
        this.quantity_passengers = quantity_passengers;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return super.toString() + body_type + " " + quantity_passengers + " " + getPower();
    }

    //время, вводимое с консоли
    public int timeDistance(){
        time = scan.nextInt();
        return time;
    }

    //расстояние, которое проедет за время на макс скорости
    public void getDistance(){
        int distance = time * getSpeed();
        System.out.println(distance);
    }

    //расход топлива
    private int fuelCount(){
        int fuel_count =getSpeed() / getFuel_consumption();
        return fuel_count;
    }
}
