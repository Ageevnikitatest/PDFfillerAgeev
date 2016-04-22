package courseJava;

import org.testng.annotations.Test;

/**
 * Created by ANS on 22/03/16.
 */
public class KonstructorEx {


    @Test

    public void  tryUser (){

        User2 user1 = new User2("111","111");
        User2 user2 = new User2("222","222");
        User2 user3 = new User2("333","333");



        System.out.println("User email: " + user1.email);
        System.out.println("User2 email: " + user2.email);
        System.out.println("User3 email: " + user3.email);



    }
}
