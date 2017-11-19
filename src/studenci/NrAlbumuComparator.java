package studenci;
import java.util.Comparator;

public class NrAlbumuComparator implements Comparator<Student>
{
    @Override
    public int compare(Student o1, Student o2) {
        return new Integer(o1.getNumerAlbumu()).compareTo(new Integer(o2.getNumerAlbumu()));
    }
}
