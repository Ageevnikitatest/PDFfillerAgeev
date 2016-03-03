package differentTest;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by ANS on 01/12/15.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Status {

    public Status(){

    }
    public int code;
    public String text;
}
