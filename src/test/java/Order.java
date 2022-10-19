public class Order {
    //---------------------------ATRIBUTES---------------------------variables, praviljnee private vsegda

    private double totalPrice;
    private double weight;
    private double volume;
    private int itemCount;
    private double width;
    private double height;
    private double depth;                                                   //private potomu chto toljko dlja etogo class
    private String address;
    private boolean deliveryRequested;

    //---------------------------GETTERS/SETTERS--------------------------------metodi (=funkcija) dlja raboti s etimi parametrami

    public double getTotalPrice() {                                       //public potomu chto proslojka dlja vnewnego mira
        return totalPrice;                                               //double - metod vozvrawaet drobnoje chislo
    }                                                                      // () - nuzhni parametri kakije-to
                                                                           //getTotalPrice - verni vse soderzhimoje v totalPrice
    public void setTotalPrice(double totalPrice) {                     //void = pustoj metod chto-to delajet no nichego ne vozvrawaet
        this.totalPrice = totalPrice;                                  // setTotalPrice - polozhi chto-to v totalPrice
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isDeliveryRequested() {
        return deliveryRequested;
    }

    public void setDeliveryRequested(boolean deliveryRequested) {
        this.deliveryRequested = deliveryRequested;
    }
}


//domawka v 10 objektah s atributami, dlja nih vseh getter/setter,
// posle etogo otdeljnij objekt c kotorom ih ispoljzovatj
// dlja kazhdogo objekta odna kopija, paru atributov zapolnitj i vivesti na consolj
//+
//sozdaem da objekta, objekt Transport, objekt Road marshrut, nabor parametrov sami
//zadacha - transport dolzhen soderzhatj v sebje info o rashode topliva na 100 km, skoljko bak litrov
//marshrut - info o nachajnij punkt nazvanije, nazvanije konechnogo punkta, rasstjanije mezhdu nimi
//otdlejnij klass gde mi ih prenimjaem
//tam kopija objekta transport mawina, parovoz, samoljet
//zapolnitj eti kopii nuzhnoj info
//sozdatj kopiju objekta road - tri marshruta s raznoj infoj
//v consolj vivesti info o marshrute, dlja kazhdogo marshruta poschitatj i vivesti skoljko l topliva na ego preodolenija
//i smozhet li kazhdij transport na odnom bake
//samolet potratit stoljko litro topliva i smozhet proehatj na odnom bake
//marwrut riga-tbilisi 380 km
//if else
