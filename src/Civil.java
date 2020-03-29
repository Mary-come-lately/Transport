import java.util.Random;
import java.util.Scanner;

public class Civil extends Air{
    private  int passengers_quantity;
    private boolean business_class;
    public int passengers;

    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    public Civil(int power, int speed, int weight, String model, int wingspan, int passengers_quantity) {
        super(power, speed, weight, model, wingspan);
        this.passengers_quantity = passengers_quantity;
    }

    public Civil(){}

    public int getPassengers_quantity() {
        return passengers_quantity;
    }

    public void setPassengers_quantity(int passengers_quantity) {
        this.passengers_quantity = passengers_quantity;
    }

    public boolean isBusiness_class() {
        return business_class;
    }

    public void setBusiness_class(boolean business_class) {
        this.business_class = business_class;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public boolean get_bclass(){
        business_class = rand.nextBoolean();
        return business_class;
    }

    @Override
    public String toString() {
        return super.toString() + passengers_quantity + " " + get_bclass() + " " + get_power();
    }

    public int pasCount(){
        passengers = scan.nextInt();
        return passengers;
    }

    public void count_of_passengers(){
        if(passengers < passengers_quantity){
            System.out.println("You have a one more free seats");
        }
        else if(passengers == passengers_quantity){
            System.out.println("The plane is full");
        }
        else System.out.println("You need more big plane");
    }
}
