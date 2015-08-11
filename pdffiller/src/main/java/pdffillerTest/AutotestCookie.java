package pdffillerTest;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.openqa.selenium.Cookie;

public class AutotestCookie {
	
	
	public static String getMD5(String input) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] messageDigest = md.digest(input.getBytes());
			BigInteger number = new BigInteger(1, messageDigest);
            String hashtext = number.toString(16);
            // Now we need to zero pad it if you actually want the full 32 chars.
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        }
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
	
	private String getNewYorkDate(){
    	Date date = new Date();
		SimpleDateFormat sdfAmerica = new SimpleDateFormat("yyyy-MM-dd");
		sdfAmerica.setTimeZone(TimeZone.getTimeZone("America/New_York"));
		String sDateInAmerica = sdfAmerica.format(date);
		return sDateInAmerica;
	}
	
	public Cookie getCookie(){
		//System.out.println(dateFormat.format(cal.getTime()));
		Cookie cookieDisableCaptcha = new Cookie("autotest_run", AutotestCookie.getMD5("AUTOTEST-"+getNewYorkDate()));
		return cookieDisableCaptcha; 
	}
	
	public String getAutologinParameter(String email){
		String token = AutotestCookie.getMD5(email+getNewYorkDate()+"ALTA");
		String param = "?autotest%5Bop%5D=login&autotest%5Bdata%5D%5Bemail%5D="+email.replaceAll("@", "%40")+"&autotest%5Bdata%5D%5Btoken%5D="+token;
		return param;
	}

}
