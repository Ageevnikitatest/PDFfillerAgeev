package courseJava;

/**
 * Created by ANS on 22/03/16.
 */
public class User {

    public String name;
    public int age ;
    public String email;
    public String password ;



        public User (String email, String password){

            this.email=email;
            this.password=password;
        }


    public  User (String email, String password, String name, int age){
        this(email,password);
        this.age = age;
        this.name = name;


    }

}
