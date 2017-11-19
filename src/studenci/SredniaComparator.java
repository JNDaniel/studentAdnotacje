package studenci;
import java.util.Comparator;

public class SredniaComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getSrednia().compareTo(o2.getSrednia());
    }
}
