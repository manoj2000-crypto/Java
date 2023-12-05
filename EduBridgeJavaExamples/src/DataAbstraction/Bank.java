package DataAbstraction;

public abstract class Bank {

    protected float principal, time, total;

    public Bank() {
        principal = 0.0f;
        time = 0.0f;
        total = 0.0f;
    }

    public abstract float getRateOfInterest();
    public abstract void calculateSimpleInterest();
    public abstract void display();
}

