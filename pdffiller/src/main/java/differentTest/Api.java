package differentTest;

import org.apache.http.HttpResponse;
import org.apache.http.client.fluent.Request;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by ANS on 27/01/16.
 */
public class Api {
    @Test
    public void getData() throws IOException {


        Request.Get("https://pdffiller.com").execute().returnResponse();
        HttpResponse resp = Request.Get("https://pdffiller.com").execute().returnResponse();
        String respBody = EntityUtils.toString(resp.getEntity());
        System.out.println(respBody);

    }
}



