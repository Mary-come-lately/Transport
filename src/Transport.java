import java.util.Scanner;

public class Transport {

    private int power;
    private int speed;
    private int weight;
    private String model;
    private double power_kW;

    public Transport(int power, int speed, int weight, String model) {
        this.power = power;
        this.speed = speed;
        this.weight = weight;
        this.model = model;
    }

    public Transport(){}

    public double getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getSpeed() { return speed; }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPower_kW() { return power_kW; }

    public void setPower_kW(double power_kW) { this.power_kW = power_kW; }

    public double get_power(){
        power_kW = (double)power * 0.74;
        return power_kW;
    }

    public String toString(){

        return power + " " + speed + " " + weight + " " + model + " " ;
    }


}
