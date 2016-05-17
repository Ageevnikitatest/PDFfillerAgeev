package courseJava.api;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.ParseException;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;

import java.io.IOException;

/**
 * Created by ANS on 26/04/16.
 */
public class Request1 {

    public static String host = "www.irs.gov/pub/irs-pdf/fw2.pdf";
    public static String scheme = "https"; // указать схему
    public static String appKey ="web_fds3w43342Sbs";  // доп ключ, откуда обращаемся
    public static String device = "web";


    public static String userId;
    public static String token;

    public URIBuilder uriBuilder =  new URIBuilder().setScheme(scheme).setHost(host).setParameter("device", device).setParameter("appKey",appKey);
    // uriBuilder собирает из всех параметров один запрос

    public String getResponseBody(HttpResponse resp) throws ParseException, IOException {
        String respBody = EntityUtils.toString(resp.getEntity());
        int statusCode = resp.getStatusLine().getStatusCode();
        System.out.println("RESPONSE: " + respBody);
        Assert.assertEquals(statusCode, HttpStatus.SC_OK, "Status code: " + statusCode);
        return respBody;
    }



}
