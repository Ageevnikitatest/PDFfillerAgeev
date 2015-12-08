package differentTest;

import org.testng.annotations.Test;

/**
 * Created by ANS on 08/12/15.
 */
public class StringLesson {
    String s = "My name is Nik";

    @Test
    public void substring(){

        String name = s.substring(11);
        System.out.println(name);
        int indexBegin = s.indexOf("is") + "".length();
        System.out.println(s.substring(indexBegin));
    }
}
