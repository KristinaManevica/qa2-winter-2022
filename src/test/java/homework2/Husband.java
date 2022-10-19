package homework2;

public class Husband {

    private int age;
    private double salary;
    char salaryCurrencySymbol;
    private int taxFromSalary;
    private boolean beard;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public char getSalaryCurrencySymbol() {
        return salaryCurrencySymbol;
    }

    public void setSalaryCurrencySymbol(char salaryCurrencySymbol) {
        this.salaryCurrencySymbol = salaryCurrencySymbol;
    }

    public int getTaxFromSalary() {
        return taxFromSalary;
    }

    public void setTaxFromSalary(int taxFromSalary) {
        this.taxFromSalary = taxFromSalary;
    }

    public boolean IsBeard() {
        return beard;
    }

    public void setIsBeard(boolean beard) {
        this.beard = beard;
    }
}
