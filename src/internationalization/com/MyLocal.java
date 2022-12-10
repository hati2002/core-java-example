package internationalization.com;

import java.util.Locale;

public class MyLocal {
    public static void main(String[] args) {
        Locale loc=Locale.getDefault();
        System.out.println("country is:"+loc.getCountry());
        System.out.println("language is:"+loc.getLanguage());
        System.out.println("display country is:"+loc.getDisplayCountry());
        System.out.println("display language is:"+loc.getDisplayLanguage());

        Locale loc1=new Locale("en","pak");
        System.out.println(loc1.getCountry()+loc1.getDisplayLanguage());

        String[] s=Locale.getISOLanguages();
        System.out.println("iso language are");
        for (String str:s){
            System.out.println(str);
        }

        System.out.println("iso country are");
        String[] c=Locale.getISOCountries();
        for (String con:c){
            System.out.println(con);
        }

        Locale[] l=Locale.getAvailableLocales();
        System.out.println("the available locals are:");
        for (Locale lo:l){
            System.out.println(lo.getDisplayCountry()+" "+lo.getDisplayLanguage());
        }
    }
}
