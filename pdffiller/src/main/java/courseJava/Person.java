package courseJava;

/**
 * Created by ANS on 22/03/16.
 */
public class Person {

    private String name;
    private String surname;

    public String getName(){return name;}
    public String getSurname(){return surname;}

    public Person(String name, String surname){
        this.name =  name;
        this.surname = surname;
    }

    public void displayInfo(){

        System.out.println("Имя : " + name  + "Фамилия : " + surname);
    }
}
