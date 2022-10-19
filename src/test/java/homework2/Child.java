package homework2;

public class Child {

    private boolean sickness;
    private String favoriteAnswer;
    private long questionsByDay;
    private int handFingers;
    private double weight;


    public boolean IsSickness() {
        return sickness;
    }

    public void setIsSickness(boolean sickness) {
        this.sickness = sickness;
    }

    public String getFavoriteAnswer() {
        return favoriteAnswer;
    }

    public void setFavoriteAnswer(String favoriteAnswer) {
        this.favoriteAnswer = favoriteAnswer;
    }

    public long getQuestionsByDay() {
        return questionsByDay;
    }

    public void setQuestionsByDay(long questionsByDay) {
        this.questionsByDay = questionsByDay;
    }

    public int getHandFingers() {
        return handFingers;
    }

    public void setHandFingers(int handFingers) {
        this.handFingers = handFingers;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
