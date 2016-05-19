package courseJava;

/**
 * Created by ANS on 18/03/16.
 */
public class SwitchExample  {

    public static void main(String[] args) {

        int month = 5;
        String monthString;

        switch (month) {

            case 1:  monthString = "January";
                break;

            case 2:  monthString = "February";
                break;

            case 3:  monthString = "March";
                break;
            case 4:  monthString = "April";
                break;

            default:  System.out.println("Error");
        }

    }

}

