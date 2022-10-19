package homework2;

public class Plant {

    private String name;
    private int leavesCount;
    private boolean palmType;
    private double height;
    private String heightMeasure;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLeavesCount() {
        return leavesCount;
    }

    public void setLeavesCount(int leavesCount) {
        this.leavesCount = leavesCount;
    }

    public boolean IsPalmType() {
        return palmType;
    }

    public void setIsPalmType(boolean palmType) {
        this.palmType = palmType;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getHeightMeasure() {
        return heightMeasure;
    }

    public void setHeightMeasure(String heightMeasure) {
        this.heightMeasure = heightMeasure;
    }
}
