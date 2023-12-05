package DataAbstraction;

public class SBI extends Bank {

    private float simpleInterest;
    private String str = "";

    public SBI() {
        simpleInterest = 0.0f;
    }

    public float getRateOfInterest() {
        return 0.074f;
    }

    public void calculateSimpleInterest() {
        this.simpleInterest = (this.principal * getRateOfInterest() * this.time);
        this.total = (this.principal + this.simpleInterest);

        str = String.format("SBI rate of Interest: %.2f", (getRateOfInterest() * 100));
    }

    public void display() {
    	System.out.println("---------------------------------------");
        System.out.println(str + " %");
        System.out.println("Simple Interest: " + this.simpleInterest);
        System.out.println("Total: " + this.total);
        System.out.println("---------------------------------------");
    }
}

