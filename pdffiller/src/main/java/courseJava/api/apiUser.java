package courseJava.api;

import org.apache.http.HttpResponse;
import org.apache.http.client.fluent.Request;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by ANS on 26/04/16.
 */
public class ApiUser extends Request1 {

    ObjectMapper objectMapper = new ObjectMapper();

    public String registration(String email, String password) throws URISyntaxException, IOException {
        URI uri = uriBuilder.setPath("/api_v3/users/add")
                .setParameter("email", email)
                .setParameter("password", password)
                .build();
        System.out.println(uri);
        HttpResponse resp = Request.Get(uri).execute().returnResponse();
        String respBody = getResponseBody(resp);
        return respBody;
    }


}
