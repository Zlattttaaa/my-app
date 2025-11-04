package app7;

public class Person {
    private String Name;
    private int age;
    private String profession;

    // Конструктор класу

    public Person(String name, int age, String profession) {
        this.Name = name;
        this.age = age;
        this.profession = profession;
    }

    // Геттери

    public String getName(){
        return Name;
    }

    public int getAge(){
        return age;
    }

    public String getProfession(){
        return profession;
    }

    // Метод для зміни професії

    public void setProfession(String newProfession){
        this.profession = newProfession;
    }

    // Метод для отримання рядка з інформацією про особу

    @Override
    public String toString(){
        return "Ім'я: " + Name + ", Вік: " + age + ", Професія: " + profession;
    }
}
