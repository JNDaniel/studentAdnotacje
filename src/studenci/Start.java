package studenci;

import java.util.*;

public class Start {
    public static void main(String[] args) {
        Student daniel = new Student("Daniel", "Janowski", 202167);
        daniel.dodajOcene((float) 5);
        daniel.dodajOcene((float) 4);
        daniel.dodajOcene((float) 5);
        Student mateusz = new Student("Ferdynand", "Kiepski", 202105);
        mateusz.dodajOcene((float) 5);
        mateusz.dodajOcene((float) 4);
        mateusz.dodajOcene((float) 3);
        Student antosik = new Student("Arnold", "Boczek", 202106);
        antosik.dodajOcene((float) 5);
        antosik.dodajOcene((float) 2);
        antosik.dodajOcene((float) 1);

        List<Student> students = new ArrayList<>(Arrays.asList(mateusz, daniel, antosik));
        System.out.println(students);
        System.out.println("\n\n------------------------------\nPosortowane\n------------------------------\n\n");
        try {
            Collections.sort(students, students.get(0).getComparator());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Bledny komparator");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        //Collections.sort(students,new NrAlbumuComparator());
        //((o2, o1) -> o1.getSrednia().compareTo(o2.getSrednia()))

        System.out.println(students);
    }
}
