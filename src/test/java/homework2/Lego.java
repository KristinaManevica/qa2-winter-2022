package homework2;

public class Lego {

    private int setCount;
    private String condition;
    private double averageSetPrice;
    private boolean setForAdults;
    private int lostDetailCount;


    public int getSetCount() {
        return setCount;
    }

    public void setSetCount(int setCount) {
        this.setCount = setCount;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public double getAverageSetPrice() {
        return averageSetPrice;
    }

    public void setAverageSetPrice(double averageSetPrice) {
        this.averageSetPrice = averageSetPrice;
    }

    public boolean isSetForAdults() {
        return setForAdults;
    }

    public void setSetForAdults(boolean setForAdults) {
        this.setForAdults = setForAdults;
    }

    public int getLostDetailCount() {
        return lostDetailCount;
    }

    public void setLostDetailCount(int lostDetailCount) {
        this.lostDetailCount = lostDetailCount;
    }
}
