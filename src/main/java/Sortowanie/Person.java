package Sortowanie;

public class Person implements Comparable<Person> {
    private int age;
    private String name;
    private String lastname;

    public Person(int age, String name, String lastname) {
        this.age = age;
        this.name = name;
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public int compareTo(Person person) {
        int result = this.name.compareTo(person.name);
        if (result == 0) {
            result = this.lastname.compareTo(person.lastname);
            if(result==0){
                return this.age-person.age;
            }
            return result;
        }
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}

