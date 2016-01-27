package differentTest;

import org.apache.http.HttpResponse;
import org.apache.http.client.fluent.Request;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by ANS on 02/12/15.
 */
public class ApiLesson {

    @Test
    public void getData() throws IOException {


        Request.Get("https://pdffiller.com").execute().returnResponse();
        HttpResponse resp = Request.Get("https://pdffiller.com").execute().returnResponse();
        String respBody = EntityUtils.toString(resp.getEntity());
        System.out.println(respBody);

    }
}


// брать курс валют на финанс  , на привате тоже и сравнить курсы
// распарсить стрингу . вытащить html  обрезать по курсу , присвоить к стринге и сравнить .


