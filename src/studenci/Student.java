import org.jetbrains.annotations.NotNull;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
@DefaultComparator
public class Student
{
    private int numerAlbumu;
    private String imie;
    private String nazwisko;
    private String compareMethod;
    private ArrayList<Float> oceny = new ArrayList<>();

    Student(String imie,String nazwisko,int numerAlbumu)
    {
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.numerAlbumu=numerAlbumu;
    }
    public Comparator<Student> getComparator() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class comp = null;
        if(this.getClass().isAnnotationPresent(DefaultComparator.class))
        {
            DefaultComparator c = Student.class.getAnnotation(DefaultComparator.class);
            comp = Class.forName(c.compareMethod());
           return (Comparator<Student>) comp.newInstance();
        }

        return (Comparator<Student>) comp.newInstance();
    }
    public int getNumerAlbumu() {
        return numerAlbumu;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public ArrayList<Float> getOceny() {
        return oceny;
    }

    public void dodajOcene(Float mark)
    {
        this.oceny.add(mark);
    }
    @NotNull
    public Float getSrednia()
    {
        if(oceny.isEmpty()) return Float.valueOf(0);
        float sum=0;
        for(Float ocena : this.getOceny())
        {
            sum+=ocena;
        }
        DecimalFormat twoDecFormat = new DecimalFormat(".##");
        Float result = sum/oceny.size();
        return Float.valueOf(twoDecFormat.format(result));
    }


    @Override
    public String toString() {
       String temp =

                "Imię: "+imie+
                        System.lineSeparator()+
                        "------------------------------"+
                        System.lineSeparator()+
                "Nazwisko: "+nazwisko+
                        System.lineSeparator()+
                        "------------------------------"+
                        System.lineSeparator()+
                "Numer albumu: "+numerAlbumu+
                        System.lineSeparator()+
                        "------------------------------"+
                        System.lineSeparator()+
                "Oceny: : "+oceny+
                        System.lineSeparator()+
                        "------------------------------"+
                        System.lineSeparator()+
                "Srednia: "+this.getSrednia()+
                        System.lineSeparator()+
                        "------------------------------------------------------------"+
                        System.lineSeparator();
        return temp;
    }
    //@Override
   // public int compareTo(Student o) {
    //    if(this.nazwisko.compareToIgnoreCase(o.nazwisko)==0)
    //    {
     //       return this.imie.compareToIgnoreCase(o.imie);
      //  }
      //  else
      //  {
      //      return this.nazwisko.compareToIgnoreCase(o.nazwisko);
       // }
    //}
}
