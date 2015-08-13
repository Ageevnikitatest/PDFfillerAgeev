package pdffillerTest;

import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ANS on 11/08/15.
 */
public class MarketingUrl extends BeforeAfter  {

@Test

public static void list () {


     Cookie cookieDisableCaptcha = new AutotestCookie().getCookie();
    driver.get("http://www.pdffiller.com/");
    driver.manage().addCookie(cookieDisableCaptcha);

    List<Integer> formList = Arrays.asList(100018326, 100077356, 41887, 6961919, 100030287, 100050444, 100055378,
            100039538, 100113804, 100102153, 100083985, 6954747, 5451079, 6954761, 6962092, 6954731, 6961827, 6961275,
            100009952, 6832941, 100114272, 100042726, 100054264, 100059999, 6961757, 5433310, 212025, 837687, 69738,
            100011254, 214449, 6962123, 164845, 100031107, 6962119, 100029827, 159105, 100001722, 100055410,
            100036889, 100034784, 100075916, 6961367, 100042715, 100257569, 100348893, 100056915, 260996, 100055026,
            100077323, 5524089, 1018158, 22899, 287751, 6954772, 897342, 1076490, 100293856, 6962126, 6961769,
            100006424, 1244190, 100048283, 1473959, 6928366, 6955078, 14619038, 28211674, 42814121, 41772446,
            100010834, 302853, 6949261, 100259597, 100085868, 100085531, 6954656, 100084818, 100055026, 6961503,
            56615, 102502, 1056082, 6954717, 6961940, 6954809, 6954526, 100014245, 1076479, 100020832, 100026434,
            236658, 100036844, 898079, 100045712, 148419, 6961849, 100079451, 100106730);

        for (Integer id: formList) {
        PageObject.openUrl("http://www.pdffiller.com/" + id);
           if (PageObject.getLinkAndCheck("--") || PageObject.getLinkAndCheck("-.")||
                    PageObject.getLinkAndCheck("---")||PageObject.getLinkAndCheck("_")) {
                System.out.println(id);
            }

        }

    }
    }

