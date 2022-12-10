package internationalization.com;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class MyDate {
    public static void main(String[] args) {
        System.out.println(DateFormat.getDateInstance(0).format(new date()));
        System.out.println(DateFormat.getDateInstance(1).format(new date()));
        System.out.println(DateFormat.getDateInstance(2).format(new date()));
        System.out.println(DateFormat.getDateInstance(3).format(new date()));

//        displaying the current date according to UK,US and ITALY specific ways
        DateFormat uk=DateFormat.getDateInstance(0, Locale.UK);
        System.out.println(uk.format(new Date()));

        DateFormat ital=DateFormat.getDateInstance(0, Locale.ITALY);
        System.out.println(ital.format(new Date()));
    }
}
