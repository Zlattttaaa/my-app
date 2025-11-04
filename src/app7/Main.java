package app7;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("John", 30, "Інженер");
        Person p2 = new Person("Mary", 25, "Вчитель");
        Person p3 = new Person("Bob", 35, "Лікар");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        Person alice = new Person("Alice", 28, "Архітектор");
        System.out.println(); // порожній рядок для відділення виводу
        System.out.println(alice); // початкова інформація

        alice.setProfession("Дизайнер");

        System.out.println("(Після оновлення професії)");
        System.out.println(alice);
    }
}
