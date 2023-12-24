package Person;

import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private String dateOfBirth;
    private String gender;
    private List<Person> children;
    private Person spouse;

    /**
     * Pham Huong Giang - 22024572.
     */
    public Person(String name, String dateOfBirth, String gender) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.children = new ArrayList<>();
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
        spouse.spouse = this;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void addChild(Person child) {
        children.add(child);
    }

    public void displayInformation() {
        System.out.println("Name: " + name + ", Date of Birth: " + dateOfBirth + ", Gender: " + gender);
    }

    public boolean isMarried() {
        return spouse != null;
    }

    public boolean hasChildren() {
        return !children.isEmpty();
    }

    public static void main(String[] args) {
        Person james = new Person("James", "01-01-1970", "Male");
        Person hana = new Person("Hana", "05-05-1975", "Female");
        Person ryan = new Person("Ryan", "10-10-1995", "Male");
        Person kai = new Person("Kai", "15-02-2000", "Male");
        Person jennifer = new Person("Jennifer", "20-12-2005", "Female");

        james.setSpouse(hana);
        james.addChild(ryan);
        james.addChild(kai);
        kai.setSpouse(jennifer);

        System.out.println("Information of James:");
        james.displayInformation();
        System.out.println("Is James married? " + james.isMarried());
        System.out.println("Does James have children? " + james.hasChildren());


    }
}
