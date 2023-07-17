package sometests;

import org.junit.jupiter.api.Test;
import sometests.Student;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    @Test
    public void createAndWorkWithLists() {
        Student valera = new Student();
        valera.setFirstName("Valera");
        valera.setLastName("The Tester");
        valera.setEmail("valerunchik@test.lv");
        valera.setPhone("+371 567899876");

        Student liga = new Student("Līga", "Ivanova", "liga@test.lv", "+371 56755555576");
        Student dimka = new Student("Dimka", "Kucins", "email@email.lv", "+377 456789");
        Student artis = new Student("Artis", null, null, "");

        liga.setLastName("Zvaigzne");

        List<Student> students = new ArrayList<>();   //sozdali spisok v kotorom xranjatsja 4 objekta
        students.add(valera); //0
        students.add(liga);   //1
        students.add(dimka);  //2
        students.add(artis);  //3

        //------------cikl FOR -----------                ciklichnoje dejstvije tri uslovija cherez ; 1-s chego nachinajem, schetchik vsegda int, vsegda i (ot slova index)
                                                         // 0 - s kakogo nachatj elementa
                                                          // vtoroje uslovije - do kakog elementa krutitj cikl < 2 (ne vkljuchaja 2)
                                                          //tretje uslovije - wag, berem kazhdogo studentu, k kazhdomu schetchiku +1; i = i +1 ->> v java i++
                                                                                                                       // i = i +2 ->> i+2
                                                            // mi dolzhni sobratj elementi v List i iz nih iskatj nuzhnij cherez cikl

        for (int i = 0; i < students.size(); i++) {                             //students.size() - vozvrawaet konec spiska - toestj vseh studentov
            System.out.println(students.get(i).getFirstName());
        }

        //------------FOREACH-------------                         probegajet kazhduju zapisj, dva uslovija 2 - spisok po kakomu idem; 1 - peremennaja kuda on budet klastj elementi
        for (Student s :students){                                                    // s - pervaja bukva peremennoj
            //System.out.println(s.getFirstName() + " " + s.getLastName());          //pervij variant
            System.out.println(s.getFullName());                                     //vtoroj cherez custom methods
        }

        //---------------------FOREACH with IF ---------------       if
        System.out.println("Printing students with phone Nr +371");
        for (Student s : students) {
            if (s.getPhone().startsWith("+371")) {
                System.out.println(s.getFullName());
            }
        }
    }
}
 /*
 while (driver.findElements(NEXT_BTN).isEmpty()); -cikl while; proverjam poka estj eta knopka -mi chto-to delajem; kak toljko ne budet, cikl ostanovitsja
  (do something)
  */
