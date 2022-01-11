public abstract class Coin implements Icalculate {
    public abstract double getValue();
    
     @Override
    public abstract double calculate(double amount);
    }
}
