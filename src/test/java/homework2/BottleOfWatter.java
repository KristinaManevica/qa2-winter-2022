package homework2;

public class BottleOfWatter {

    private String material;
    private boolean recycled;
    private double fullness;
    private double depositCost;
    private char depositCostMeasure;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean IsRecycled() {
        return recycled;
    }

    public void setRecycled(boolean recycled) {
        this.recycled = recycled;
    }

    public double getFullness() {
        return fullness;
    }

    public void setFullness(double fullness) {
        this.fullness = fullness;
    }

    public double getDepositCost() {
        return depositCost;
    }

    public void setDepositCost(double depositCost) {
        this.depositCost = depositCost;
    }

    public char getDepositCostMeasure() {
        return depositCostMeasure;
    }

    public void setDepositCostMeasure(char depositCostMeasure) {
        this.depositCostMeasure = depositCostMeasure;
    }
}
