package differentTest;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by ANS on 01/12/15.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Project {

    public Project(){

    }

    public String clone_state ;
    public String created;
    public String date;
    public String filename;
    public String fileType;
    public int form_id;
    public int system_id;
    public int user_id;
    public Status status;

}
