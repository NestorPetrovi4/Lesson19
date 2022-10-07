import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Person> persons = new TreeSet<>(new PersonComparator(9) {});
        persons.add(new Person("Олег", "Нестеров", 32));
        persons.add(new Person("Ярослав", "Борисов", 41));
        persons.add(new Person("Руслан", "Сосланов", 31));
        System.out.println(persons);
    }
}
