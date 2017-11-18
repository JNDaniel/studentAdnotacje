import com.sun.javafx.scene.control.skin.VirtualFlow;

import java.util.*;

public class Start
{
    public static void main(String[] args)
    {
        Student daniel = new Student("Daniel","Janowski",202167);
        daniel.dodajOcene((float) 5);
        daniel.dodajOcene((float) 4);
        daniel.dodajOcene((float) 5);
        Student mateusz = new Student("Mateusz","Antczak",202105);
        mateusz.dodajOcene((float) 5);
        mateusz.dodajOcene((float) 4);
        mateusz.dodajOcene((float) 3);
        Student antosik = new Student("Piotr","Antosik",202106);
        antosik.dodajOcene((float) 5);
        antosik.dodajOcene((float) 2);
        antosik.dodajOcene((float) 1);

        List<Student> students = new ArrayList<>(Arrays.asList(mateusz,daniel,antosik));
        System.out.println(students);
        System.out.println("\n\n------------------------------\nPosortowane\n------------------------------\n\n");
        Collections.sort(students,Collections.reverseOrder(new SredniaComparator()));
        //Collections.sort(students,new NrAlbumuComparator());
        //((o2, o1) -> o1.getSrednia().compareTo(o2.getSrednia()))

        System.out.println(students);






    }
}
