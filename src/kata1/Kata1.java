package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Student alejandro = new Student("Alejandro", new Date(82, 8, 9));
        System.out.println(alejandro.getName());
        System.out.println(alejandro.getAge());
        // TODO code application logic here
    }
}
