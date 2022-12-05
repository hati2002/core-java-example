package internationalization.com;

import java.util.Locale;

public class MyLocal {
    public static void main(String[] args) {
        Locale loc=Locale.getDefault();
        System.out.println("country is:"+loc.getCountry());
        System.out.println("language is:"+loc.getLanguage());
        System.out.println("display country is:"+loc.getDisplayCountry());
        System.out.println("display language is:"+loc.getDisplayLanguage());


    }
}
