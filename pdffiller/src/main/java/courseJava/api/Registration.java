package courseJava.api;

import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Created by ANS on 26/04/16.
 */
public class Registration {



    @Test

    public  void reg () throws IOException, URISyntaxException {

        ApiUser apiUser = new ApiUser();

       String user =  apiUser.registration("QAtest+22@gmail.com","1111");
        System.out.println(user);

    }





}
