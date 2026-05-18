public class Bottle{

    private double capacity;
    private double amt;
    
    public Bottle(double amount){
        capacity = amount;
        amt = amount;
    }

    public double updateAmount(dooble remove) {
        double percent = capacity * 0.25;
        amt -= remove;
        if(amt < percent) {
            amt = capacity;
        }
        return amt;
    }
}
