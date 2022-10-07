import java.util.Comparator;

public abstract class PersonComparator implements Comparator<Person> {
    private int maxLength;

    public PersonComparator(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public int compare(Person o1, Person o2) {
        int countPerson1 = o1.getSurname().replace("-", " ").split(" ").length;
        int countPerson2 = o2.getSurname().replace("-", " ").split(" ").length;
        if (countPerson2 > maxLength && countPerson1 > maxLength) {
            return o2.getAge() - o1.getAge();
        } else {
            if (countPerson2 - countPerson1 == 0) {
                return o2.getAge() - o1.getAge();
            } else {
                return countPerson2 - countPerson1;
            }
        }

    }
}
