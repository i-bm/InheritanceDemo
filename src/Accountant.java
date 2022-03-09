import java.time.LocalDate;

public class Accountant extends Person{

    public Accountant(String name, LocalDate dateOfBirth, Company company) {
        super(name, dateOfBirth, company);
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void learn() {
        super.learn();
    }

    @Override
    public void walk() {
        super.walk();
    }

    public void doAccountingStuff(){
        System.out.println("Doing accounting stuff.");
    }
}
