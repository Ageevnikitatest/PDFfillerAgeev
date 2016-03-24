package courseJava;

/**
 * Created by ANS on 22/03/16.
 */
public class Employee extends Person {


    private String company;

    public Employee (String name, String  surname, String company){
        super(name,surname);
        this.company = company;
    }

    @Override
    public void displayInfo (){
        super.displayInfo();  // super обращается к классу родитедля
        System.out.println("Компания: " + company);
    }
}
