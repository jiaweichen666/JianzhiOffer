package AllKindsOfCollectionIterate;

public class Person implements Comparable{
    private String name;
    private int age;

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

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        int agecode = new Integer(age).hashCode();
        int namecode = name.hashCode();
        return agecode + namecode;
    }

    @Override
    public boolean equals(Object obj) {
        Person person = (Person) obj;
        if (this.age == person.getAge() && this.name.equals(person.getName()))
            return true;
        return false;
    }

    @Override
    public int compareTo(Object o) {
        Person person = (Person) o;
        if (this.age > person.age)
            return 1;
        else if (this.age < person.age)
            return  -1;
        else
            return 0;
    }
}
