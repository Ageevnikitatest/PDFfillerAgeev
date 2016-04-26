package courseJava.interFace;

import imap.BeforeAfter;
import org.testng.annotations.DataProvider;

/**
 * Created by ANS on 22/04/16.
 */
public class RegFormKisRuTest extends BeforeAfter {













    @DataProvider(name="regForms")
    public Object[][] regForms() {
        return new Object[][] {
                { "https://kismia.com/#registration", new RegForm5(driver) },
                { "https://kismia.com/#registration", new RegForm5(driver) },
        };
    }
}
