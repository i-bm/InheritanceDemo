import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ProgrammerTest {
    @Test
void getProgrammer(){
    Person isaac = new Programmer("Isaac", LocalDate.of(1901,9,23),new Company("Turntabl","Information Technology","Ghana"));
       Programmer p = new Programmer();
        System.out.println(isaac);
        p.coding();
        isaac.eat();
        isaac.learn();
        isaac.walk();
    }
}