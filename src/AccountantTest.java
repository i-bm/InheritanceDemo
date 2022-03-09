import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AccountantTest {
    @Test
void getAccountant(){
Person abraham = new Accountant("Abraham", LocalDate.of(1980,3,13),new Company("Deloitte & Touche","Financial and Consulting Service","UK"));
        System.out.println(abraham);
        abraham.eat();
        abraham.learn();
        abraham.walk();
    }
}