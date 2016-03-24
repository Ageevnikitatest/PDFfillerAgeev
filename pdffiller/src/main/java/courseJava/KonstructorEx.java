package courseJava;

import org.testng.annotations.Test;

/**
 * Created by ANS on 22/03/16.
 */
public class KonstructorEx {


    @Test

    public void  tryUser (){

        User user1 = new User("111","111");
        User user2 = new User("222","222");
        User user3 = new User("333","333");



        System.out.println("User1 email: " + user1.email);
        System.out.println("User2 email: " + user2.email);
        System.out.println("User3 email: " + user3.email);



    }
}
