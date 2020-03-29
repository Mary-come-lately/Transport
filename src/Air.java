public class Air extends Transport {
    private  int wingspan;

    public Air(int power, int speed, int weight, String model, int wingspan) {
        super(power, speed, weight, model);
        this.wingspan = wingspan;
    }

    public Air(){}

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    @Override
    public String toString() {
        return super.toString() + wingspan + " ";
    }
}
