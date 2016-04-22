package differentTest;

import imap.AutotestCookie;
import imap.BeforeAfter;
import imap.FileWorker;
import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;
import imap.PageObject;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ANS on 21/08/15.
 */
public class RelatedTreeMarketing extends BeforeAfter {



   // @Test1

    public void releated () throws IOException {


        Cookie cookieDisableCaptcha = new AutotestCookie().getCookie();
        driver.get("http://dev23.pdffiller.com/");
        driver.manage().addCookie(cookieDisableCaptcha);

        List<Integer> formList = Arrays.asList(1222899,
                77288,
                1151018,
                1653475,
                1117501,
                1655653,
                311048,
                248207,
                5492714,
                272316,
                306792,
                5368994,
                72626,
                5512599,
                951221,
                1656011,
                297184,
                5527958,
                1671804,
                270098,
                132206,
                263696,
                5571724,
                98078,
                5097622,
                1324066,
                42127,
                90693,
                117066,
                940817,
                5571526,
                1345718,
                337992,
                1093847,
                167491,
                48031,
                84216,
                297475,
                133088,
                5454446,
                196028,
                101328,
                5598781,
                1210430,
                1183184,
                7811,
                265703,
                100413568,
                292469,
                5549433,
                75673,
                283109,
                1323361,
                1662140,
                5473285,
                5372003,
                5736005,
                1669322,
                5734693,
                9326,
                187828,
                5200033,
                178555,
                35108,
                269955,
                94848,
                5620525,
                5547410,
                923452,
                246903,
                5400277,
                28628,
                1402327,
                897816,
                260733,
                840364,
                5308993,
                5502762,
                337549,
                5064515,
                326892,
                208263,
                131678,
                242590,
                5622791,
                49981,
                858296,
                1129197,
                305016,
                5110890,
                106277,
                5628913,
                159685
        );

        for (Integer id: formList) {
            PageObject.openUrl("http://dev23.pdffiller.com/cron/test.php?form_id=" + id);
            String text = PageObject.getText("//pre");
            FileWorker fw = new FileWorker();
            FileWorker.update("/Users/ANS/Documents/JAVA/marketing.txt", text);
        }
    }

        @Test



        public void marketin2 () throws InterruptedException {


                Cookie cookieDisableCaptcha = new AutotestCookie().getCookie();
                driver.get("http://dev23.pdffiller.com/");
                driver.manage().addCookie(cookieDisableCaptcha);

                FileWorker fw = new FileWorker();
                List<String> formList1 = fw.scanToList("/Users/ANS/Documents/JAVA/marketing.txt");
                for ( String line : formList1){

                        String id = line.substring(0,line.indexOf(":"));
                        line = line.substring(line.indexOf(":")+2);
                        //System.out.println(id);
                       // System.out.println(line);

                        String [] numbers = line.split(", ");
                        System.out.println();
                        System.out.print(id + ": ");
                        for (String num : numbers){
                               // System.out.println(num);
                                PageObject.openUrl("http://dev23.pdffiller.com/" + num);
                                Thread.sleep(1000);

                                if (!PageObject.isDisplayedXpath("//*[contains(@href,'" + id + "')]")){
                                        System.err.print(num + "  ");
                                } else {
                                        System.out.print(num + "  ");
                                }
                        }
                }
        }
}
