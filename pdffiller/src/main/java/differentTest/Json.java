package differentTest;

import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ANS on 01/12/15.
 */
public class Json {

    String arrayExample = "[{\"clone_state\":\"0\",\"created\":\"10:57 am\",\"date\":\"2015-11-03 10:57:58\"," +
            "\"filename\":\"fw9  2014 - Form W-9 (Rev. December 2014)\",\"fileType\":\"pdf\",\"folder_id\":-20,\"" +
            "form_id\":6962253,\"system_id\":20210595,\"user_id\":10989184,\"status\":{\"code\":3,\"text\":\"\"}}" +
            ",{\"clone_state\":\"0\",\"created\":\"10:58 am\",\"date\":\"2015-11-03 10:58:05\",\"filename\"" +
            ":\"Guidebook_for_PDFfiller_on_Mobile\",\"fileType\":\"pdf\",\"folder_id\":-20,\"form_id\":15774449," +
            "\"system_id\":20210596,\"user_id\":10989184,\"status\":{\"code\":2,\"text\":\"\"}},{\"clone_state\":\"0\"," +
            "\"created\":\"10:58 am\",\"date\":\"2015-11-03 10:58:05\",\"filename\":\"Welcome_to_PDFfiller\"," +
            "\"fileType\":\"pdf\",\"folder_id\":-20,\"form_id\":100109021,\"system_id\":20210597,\"user_id" +
            "\":10989184,\"status\":{\"code\":2,\"text\":\"\"}}]";

    @Test

    public void jSon () throws IOException {
        System.out.println(arrayExample);
        ObjectMapper mapper = new ObjectMapper();
        List<Project> projectList =  new LinkedList<Project>(Arrays.asList(mapper.readValue(arrayExample, Project[].class)));
       // projectList = mapper.readValue(arrayExample, Project.class);
        System.out.println(projectList.get(0).filename);
        System.out.println(projectList.get(0).status.code);


    }

}
