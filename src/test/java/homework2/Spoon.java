package homework2;

public class Spoon {

    private String material;
    private int materialSample;
    private boolean brokenStatus;
    private int count;
    private double weight;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getMaterialSample() {
        return materialSample;
    }

    public void setMaterialSample(int materialSample) {
        this.materialSample = materialSample;
    }

    public boolean IsBrokenStatus() {
        return brokenStatus;
    }

    public void setIsBrokenStatus(boolean brokenStatus) {
        this.brokenStatus = brokenStatus;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
