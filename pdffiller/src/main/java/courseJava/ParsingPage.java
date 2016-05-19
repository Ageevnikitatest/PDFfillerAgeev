package courseJava;

import imap.BeforeAfter;
import org.testng.annotations.Test;

/**
 * Created by ANS on 18/03/16.
 */
public class ParsingPage extends BeforeAfter {

    @Test

    public static double parsingFinanse() {

        driver.get("http://finance.i.ua");
        String sourceCode = driver.getPageSource();  // вытаскиваем html страницы

        int begin = sourceCode.indexOf("черный рынок") + "черный рынок".length();
        sourceCode = sourceCode.substring(begin);
        int end = sourceCode.indexOf("<big>") + "<big>".length();
        sourceCode= sourceCode.substring(end);
        int end1 = sourceCode.indexOf("<big>") + "<big>".length();
        sourceCode= sourceCode.substring(end1);
        int end2 = sourceCode.indexOf("</big>") ;
        sourceCode= sourceCode.substring(0,end2);
        String usdFinanc = sourceCode;
        double usdFinance = Double.parseDouble(usdFinanc);
        return usdFinance;
    }



    @Test

    public static double parsingKurs(){

        driver.get("http://kurs.com.ua/kiev");
        String sourceCode = driver.getPageSource();
        int begin = sourceCode.indexOf("<td class=\"column_2 with-arrows\">") + "<td class=\"column_2 with-arrows\">".length();
        sourceCode= sourceCode.substring(begin);
        int begin1 = sourceCode.indexOf("column_2 with-arrows")+ "column_2 with-arrows".length();
        sourceCode= sourceCode.substring(begin1);
        int end = sourceCode.indexOf("</span>") ;
        sourceCode = sourceCode.substring(0, end);
        int end1 = sourceCode.indexOf("<span>")  + "<span>".length() ;
        sourceCode = sourceCode.substring(end1);
        String kursKiev = sourceCode;
        double kursKievInt = Double.parseDouble(kursKiev);
        return kursKievInt;

    }

    @Test
    public void comparison(){

        if (parsingFinanse()>parsingKurs()){
            System.out.println("Курс ниже на: http://kurs.com.ua/kiev");
        }
        if (parsingFinanse()<parsingKurs()){
            System.out.println("Курс ниже на: http://finance.i.ua");
        }
        else {
            System.out.println("Курс равен");
        }
    }








}
