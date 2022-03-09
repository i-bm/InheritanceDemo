import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate dateOfBirth;
    private Company company;

    public Person(String name, LocalDate dateOfBirth, Company company) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.company = company;
    }

    public Person(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", company=" + company +
                '}';
    }

    public void learn(){
        System.out.println(getName() + " is Leaning....");
    }
    public void eat(){
        System.out.println(getName() + " is Eating....");
    }
    public void walk(){
        System.out.println(getName() + " is walking...");
    }
}
