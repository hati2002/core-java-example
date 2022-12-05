package regex.com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {
        Pattern p=Pattern.compile(".s");
        Matcher m= p.matcher("as");
        boolean b=m.matches();
        System.out.println(b);
        //another way to  write the regex
        boolean b2=Pattern.matches(".a","ka");
        System.out.println(b2);  //true because 2nd char is-- a
        boolean b1=Pattern.matches("..s","mas");
        System.out.println(b1);  //true because 3rd char is-- s

        //find()
        Pattern p1=Pattern.compile("java");
        Matcher m1=p1.matcher("Hello java");
        int c=0;
        // finding matching char
        while(m1.find())
        {
            c=c+1;
            System.out.println("Start position of matching String "+m.start());
            System.out.println("End position of Matching String (java) "+m.end());
            System.out.println(m.groupCount());
        }
        System.out.println(" Number of matches : "+c);

//        Character classes
        Pattern pat=Pattern.compile("b");
        Matcher mat=pat.matcher("ab0C3#@6d");
        while (mat.find()){
            System.out.println(mat.start()+"----"+mat.group());

            System.out.println(Pattern.matches("[amn]","man"));

            System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));

//            Write a Regular Expression to defined java identifier
            Pattern patt=Pattern.compile("[a-zA-Z-$][a-zA-Z0-9_$]*");
            Matcher match=patt.matcher(args[0]);
            while (match.find()){
                if(match.group().equals(args[0])){
                    System.out.println("Valid Identifier");
                }else{
                    System.out.println("Invalid Identifier");
                }
            }
        }
    }
}
