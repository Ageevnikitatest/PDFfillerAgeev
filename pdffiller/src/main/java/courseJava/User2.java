package courseJava;

/**
 * Created by ANS on 22/03/16.
 */
public class User2 {

    public String name;
    public int age ;
    public String email;
    public String password ;



        public User2(String email, String password){

            this.email=email;
            this.password=password;
        }


    public User2(String email, String password, String name, int age){
        this(email,password);
        this.age = age;
        this.name = name;
    }

}
