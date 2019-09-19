package kata1;

import java.util.Date;

public class Kata1 {
    
    public static void main(String[] args) {
        Person person = new Person("Margarita Salas", new Date(38, 10, 30));
        System.out.println(person.getName() + " tiene la edad de " + person.getAge());
    }
    
}
