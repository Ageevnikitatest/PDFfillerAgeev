package courseJava.apiHttpbin;



import courseJava.apiHttpbin.responseClasses.CookiesResponse;
import courseJava.apiHttpbin.responseClasses.GetResponse;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ANS on 13/05/16.
 */
public class TestRequests {

    ObjectMapper mapper = new ObjectMapper();

    List<NameValuePair> cookies = new ArrayList<NameValuePair>();

    @Test
    public void testGetRequest() throws IOException, URISyntaxException {
        SimpleRequests simpleRequests = new SimpleRequests();
        GetResponse resp = simpleRequests.get();
        System.out.println(resp);
    }


    @Test
    public void testCookies ()throws IOException, URISyntaxException {

        SimpleRequests simpleRequests = new SimpleRequests();
        CookiesResponse resp = simpleRequests.cookies(cookies);
        System.out.print(resp);
    }



    @Test
    public void testCookiesSetName ()throws IOException, URISyntaxException {
        SimpleRequests simpleRequests = new SimpleRequests();
        GetResponse resp = simpleRequests.cookiesSetName();
        System.out.print(resp);
    }
}



            // со String -> Json

      /*  GetResponse getResponse = new GetResponse();
        getResponse.origin = "origin String alalalaala 923";
        getResponse.url = "https://gsdg.dg";


        String json = mapper.writeValueAsString(getResponse);
        System.out.println(json);*/

