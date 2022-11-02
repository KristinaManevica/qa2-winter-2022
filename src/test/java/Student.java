public class Student {
    //--------------------ATRIBUTES_______________________
    private String firstName;    //eti prenodlezhat klassu
    private String lastName;
    private String email;
    private String phone;

    //konstruktor eto metod podgatavljivajet class k rabote ogovrit chto i kak
    //vsegda public
    //vsegda ne ukazivajem chto void, nikogda ne vozvrawaet
    //vsegda nazvanije kak i class i s boljwoj bukvi
    //sozdajem pustoj
    //sozdajem v odnu strochku konstruktor
    //sozdajem libo pustim
    //libo konstruktor v strochku - zapolnjajew objekt cherez konstruktor, mozhno ubratj setter
    //bolee praviljno cherez konstruktor + getter (praviljnee cherez kontruktor)
    //pustoj konstruktor chtobi cherez setter getter zapolnjajew objekt valera.setPhone("+371 567899876");

//-------------------------------KONSTRUKTORI----------------------------
    public Student() {

    }

    public Student(String firstName, String lastName, String email, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    //---------------------------GETTERS/SETTERS
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    //-------------------------------CUSTOM METHODS---------------------- metodi dlja svoih nuzhd mogut bitj/mogut ne bitj (v nazvanii glagol
    public String getFullName() {
        return firstName + " " + lastName;

    }
}
