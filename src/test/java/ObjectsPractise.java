import org.junit.jupiter.api.Test;

import java.awt.*;

public class ObjectsPractise {
    @Test                                                 //nuzhen metod, funkcija
    public void workingWitOrders() {                      //vsegda public tak kak biblioteka void vsegda pustije nichego ne vozvrawajut
        Order firstOrder = new Order();                  //new Order() -> delajem kopiju nawego objekta Order chto bi potom rabotatj s nej
                                                         //Order firstOrder =  -> nado sohranjatj vsegda v peremennije firstOrder, kuda sohranim nawu kopiju
        firstOrder.setTotalPrice(12.34);                 // . -> vlozhennostj, objekt house.getFloor(9).getFlat(22).getKitchen().getTeapod().on();
        firstOrder.setAddress("Rigas street 22");
        firstOrder.setItemCount(9);

        Order secondOrder = new Order();

        secondOrder.setTotalPrice(55.67);
        secondOrder.setAddress("Sipeles street 66");
        secondOrder.setItemCount(3);
                                                                     //--------vivod informacii v consolj   sokrawenije sout
        System.out.println("Hello, World!");                        //System    ->nawa sistema windows,android, i t.d.; out ->vivesti s consolj
        System.out.println("1st order:");                           //println -> enter i novaja stroka
        System.out.println(firstOrder.getTotalPrice());

        System.out.println("2nd order:");
        System.out.println(secondOrder.getTotalPrice());
    }
}
