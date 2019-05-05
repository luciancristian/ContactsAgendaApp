/*
class made for data formating from date to string and back also date validation
date format should be 01/12/2000 --- 2 digits day / 2 digits month / 4 digits year
 */
package contactsAgenda;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class DateValidation {

    public static boolean verifyDateFormat(String date) {
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        format.setLenient(false);
        try {
            format.parse(date);
        } catch (ParseException e) {
            System.out.println("Date " + date + " is not valid according to "
                    + ((SimpleDateFormat) format).toPattern() + " pattern.");
            return false;
        }
        return true;
    }

    public static Date stringToDate(String date) throws Exception {
        Date dateNew = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        return dateNew;
    }

    public static String dateToString(Date date) throws Exception {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dateNew = dateFormat.format(date);
        return dateNew.substring(0, 10);
    }
}
