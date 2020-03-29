import java.util.Random;
import java.util.Scanner;

public class Military extends Air {
    private boolean catapult;
    private int quantity_rocket;

    Random rand = new Random();

    public Military(int power, int speed, int weight, String model, int wingspan, int quantity_rocket) {
        super(power, speed, weight, model, wingspan);
        this.quantity_rocket = quantity_rocket;
    }

    public Military(){}

    public boolean isCatapult() {
        return catapult;
    }

    public void setCatapult(boolean catapult) {
        this.catapult = catapult;
    }

    public int getQuantity_rocket() {
        return quantity_rocket;
    }

    public void setQuantity_rocket(int quantity_rocket) {
        this.quantity_rocket = quantity_rocket;
    }


    public boolean get_catapult(){
        catapult = rand.nextBoolean();
        return catapult;
    }

    @Override
    public String toString() {
        return super.toString() + get_catapult() + " " + quantity_rocket + " " + get_power();
    }

   public void Short(){
        if(quantity_rocket > 0){
            System.out.println("Go!");
        }
        else System.out.println("No ammunition");
   }

   public void Bailout(){
        if(get_catapult()){
            System.out.println("The bailout was successful");
        }
        else System.out.println("Ooops");
   }

}
