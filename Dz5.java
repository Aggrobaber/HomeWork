/**
 * Java2 HomeWork#5
 *
 * @author Vladimir Gomenyuk
 * @version 22.12.2021
 */
public class Dz5 {
    public static void main(String[] args) {
        Person person1 = new Person("Stepan", "Director", "Stepan@mailbox.com", 892312312, 500000, 44);
        person1.getInfo();
        Person person2 = new Person("Boris", "Accountant", "Boris@mailbox.com", 892312313, 750000, 35);
        person2.getInfo();
        Person person3 = new Person("Bob", "Personnel", "Bob@mailbox.com", 892312314, 250000, 41);
        person3.getInfo();
        Person person4 = new Person("Sten", "Worker", "Sten@mailbox.com", 892312315, 75000, 47);
        person4.getInfo();
        Person person5 = new Person("Orlando", "Worker2", "Orlando@mailbox.com", 892312316, 50000, 30);
        person5.getInfo();
    }
}

class Person {
    private String FullName;
    private String Position;
    private String Email;
    private int Telephone;
    private int Salary;
    private int Age;


    public Person(String FullName, String Position, String Email, int Telephone, int Salary, int Age) {
        //System.out.println("Конструктор");
        this.FullName = FullName;
        this.Position = Position;
        this.Email = Email;
        this.Telephone = Telephone;
        this.Salary = Salary;
        this.Age = Age;
    }

    public void getInfo() {
        if (Age>40)
        System.out.println(FullName + "," + Position + "," + Email + "," + Telephone + "," + Salary + "," + Age);
    }
}
