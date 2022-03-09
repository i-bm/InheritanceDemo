import java.time.LocalDate;

public class Programmer extends Person{
    public Programmer(String name, LocalDate dateOfBirth, Company company) {
        super(name, dateOfBirth, company);
    }

    public Programmer(){}
    @Override
    public void walk() {
        super.walk();
    }

    @Override
    public void learn() {
//        super.learn();
        System.out.println("I'm leaning JAVA.");
    }

    @Override
    public void eat() {
        super.eat();
    }

    public void coding(){
        System.out.println("I love coding...:)");
    }
}
