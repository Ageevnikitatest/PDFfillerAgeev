package courseJava.apiHttpbin.responseClasses;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by ANS on 19/05/16.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class CookiesResponse {

  //  public CookiesResponse(){}



    public class Cookies{

        public Cookies() {

        }

        @JsonProperty("_ga")
        public String ga;

        @JsonProperty("_gat")
        public String gat;


        public String k1;


        public String k2;

        public String name;

        @Override
        public String toString() {
            return "Headers [_ga = " + ga + ", _gat = " + gat   + ", k1 = " + k1  + ", k2 = " + k2 +
                    ", name = " + name + "]";
        }
    }
}

