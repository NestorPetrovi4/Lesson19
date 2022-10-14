import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        int maxLength = 1;
        Comparator<Person> personComparator = (o1, o2) -> {
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
        };
        TreeSet<Person> persons = new TreeSet<>(personComparator);
        persons.add(new Person("Олег", "Нестеров-Мусорский", 32));
        persons.add(new Person("Ярослав", "Борисов Моисеев", 41));
        persons.add(new Person("Руслан", "Сосланов", 31));
        System.out.println(persons);
    }
}
