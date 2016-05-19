package courseJava.apiHttpbin;

import courseJava.apiHttpbin.responseClasses.CookiesResponse;
import courseJava.apiHttpbin.responseClasses.GetResponse;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.fluent.Request;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.Assert;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ANS on 13/05/16.
 */
public class SimpleRequests {

    ObjectMapper mapper = new ObjectMapper();

    public static String host = "httpbin.org";
    public static String scheme = "http"; // указать схему





    public URIBuilder getUriBuilder(){
        return new URIBuilder().setScheme(scheme).setHost(host);
    }
    // uriBuilder собирает из всех параметров один запрос

    public String getResponseBody(HttpResponse resp) throws ParseException, IOException {
        String respBody = EntityUtils.toString(resp.getEntity());
        int statusCode = resp.getStatusLine().getStatusCode();
        System.out.println("RESPONSE: " + respBody);
        Assert.assertEquals(statusCode, HttpStatus.SC_OK, "Status code: " + statusCode);
        return respBody;
    }


    public GetResponse get() throws IOException, URISyntaxException {
        URI uri = getUriBuilder().setPath("/get").build();
        System.out.println(uri);
        HttpResponse resp = Request.Get(uri).execute().returnResponse();
        String respBody = getResponseBody(resp);
        return mapper.readValue(respBody, GetResponse.class);
    }



    public CookiesResponse cookies(List<NameValuePair> cookies) throws IOException, URISyntaxException {
        cookies.add(new BasicNameValuePair( "name","value"));
        URI uri = getUriBuilder().setPath("/cookies")
                .setParameters(cookies)
                .build();
        System.out.println(uri);
        HttpResponse resp = Request.Get(uri).execute().returnResponse();
        String respBody = getResponseBody(resp);
        return mapper.readValue(respBody, CookiesResponse.class);

    }



    public GetResponse cookiesSetName() throws IOException, URISyntaxException {
        URI uri = getUriBuilder().setPath("/cookies/set")
                .setParameter("name","value").build();
        System.out.println(uri);
        HttpResponse resp = Request.Get(uri).execute().returnResponse();
        String respBody = getResponseBody(resp);
        return mapper.readValue(respBody, GetResponse.class);
    }














}
