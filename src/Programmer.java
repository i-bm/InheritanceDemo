import java.time.LocalDate;

public class Programmer extends Person{
    public Programmer(String name, LocalDate dateOfBirth, Company company) {
        super(name, dateOfBirth, company);
    }

    @Override
    public void walk() {
        super.walk();
    }

    @Override
    public void learn() {
        super.learn();
    }

    @Override
    public void eat() {
        super.eat();
    }

    public void coding(){
        System.out.println("I love coding...:)");
    }
}
