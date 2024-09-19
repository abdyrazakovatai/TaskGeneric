package models;

public class Animal {
    private Long id;
    private String name;
    private int age;
    private Gender gender;

    public Animal() {
    }

    public Animal(Long id, String name, int age, Gender gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "\nAnimal{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", age=" + age +
               ", gender=" + gender +
               '}';
    }
}
