package courseJava.api;

/**
 * Created by ANS on 26/04/16.
 */
public class Json {

    public int userId;
    public String token;
    public boolean isPaid;
    public String pdfEmail;



    @Override
    public String toString() {
        return "UserRegResponse [userId=" + userId + ", token=" + token +
                ", isPaid=" + isPaid +  ", pdfEmail=" + pdfEmail + "]";
    }

}
