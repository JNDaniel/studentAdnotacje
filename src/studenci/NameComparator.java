import java.util.Comparator;

public class NameComparator implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getNazwisko().compareToIgnoreCase(o2.getNazwisko())==0)
        {
            return o1.getImie().compareToIgnoreCase(o2.getImie());
        }
        else
        {
            return o1.getNazwisko().compareToIgnoreCase(o2.getNazwisko());
        }
    }
}
git