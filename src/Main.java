import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Predicate<Person> truDelete = a -> a.getAge() < 18;
        TreeSet<Person> persons = new TreeSet<>(new PersonComparator(1) {});
        persons.add(new Person("Олег", "Нестеров-Мусорский", 32));
        persons.add(new Person("Павел", "Бухаров", 13));
        persons.add(new Person("Ярослав", "Борисов Моисеев", 41));
        persons.add(new Person("Руслан", "Сосланов", 31));
        persons.add(new Person("Алексей", "Суриков", 9));
        persons.removeIf(truDelete);
        System.out.println(persons);
    }
}
