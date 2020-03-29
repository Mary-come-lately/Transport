import java.util.Scanner;

public class Freight extends Ground {
    private int carrying;
    Scanner scan = new Scanner(System.in);
    int cargo;

    public Freight(int power, int speed, int weight, String model, int quantity_wheel,
                   int fuel_consumption, int carrying) {
        super(power, speed, weight, model, quantity_wheel, fuel_consumption);
        this.carrying = carrying;
    }

    public Freight(){}

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public int Cargo(){
        cargo = scan.nextInt();
        return cargo;
    }

    public void Shipment(){
        if(cargo < carrying){
            System.out.println("You have a one more free place");
        }
        else if(cargo == carrying){
            System.out.println("The truck is full");
        }
        else System.out.println("You need more big truck");
    }

    @Override
    public String toString() {
        return super.toString() + carrying + " " + get_power();
    }
}
