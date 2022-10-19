package homework2;

public class Film {

    private String name;
    private boolean comedyStatus;
    private double length;
    private char lengthMeasure;
    private int ageThreshold;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isComedyStatus() {
        return comedyStatus;
    }

    public void setComedyStatus(boolean comedyStatus) {
        this.comedyStatus = comedyStatus;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public char getLengthMeasure() {
        return lengthMeasure;
    }

    public void setLengthMeasure(char lengthMeasure) {
        this.lengthMeasure = lengthMeasure;
    }

    public int getAgeThreshold() {
        return ageThreshold;
    }

    public void setAgeThreshold(int ageThreshold) {
        this.ageThreshold = ageThreshold;
    }
}
