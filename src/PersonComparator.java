import java.util.Comparator;

public abstract class PersonComparator implements Comparator<Person> {
    private int maxLength;

    public PersonComparator(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public int compare(Person o1, Person o2) {
        if (o2.getSurname().length() > maxLength && o1.getSurname().length() > maxLength) {
            return o2.getAge() - o1.getAge();
        } else {
            int result = o2.getSurname().length() - o1.getSurname().length();
            if (result == 0) {
                return o2.getAge() - o1.getAge();
            } else {
                return result;
            }
        }

    }
}
