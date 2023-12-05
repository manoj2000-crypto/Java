package DataAbstraction;

public class HDFC extends Bank {

    private float simpleInterest;
    private String str = "";

    public HDFC() {
        simpleInterest = 0.0f;
    }

    public float getRateOfInterest() {
        return 0.089f;
    }

    public void calculateSimpleInterest() {
        this.simpleInterest = (this.principal * getRateOfInterest() * this.time);
        this.total = (this.principal + this.simpleInterest);

        str = String.format("HDFC rate of Interest: %.2f", (getRateOfInterest() * 100));
    }

    public void display() {
    	System.out.println("---------------------------------------");
        System.out.println(str + " %");
        System.out.println("Simple Interest: " + this.simpleInterest);
        System.out.println("Total: " + this.total);
        System.out.println("---------------------------------------");
    }
}