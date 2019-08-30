package regexExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexExpTutorial_1 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("a");
        Matcher m = p.matcher("Jack is a boy");
        while (m.find()) {
            System.out.println(m.start() + " " + m.group() + " ");
        }
        System.out.println("");

        Pattern p2 = Pattern.compile("cat");
        Matcher m2 = p2.matcher("About cats and dogs");
        while (m2.find()) {
            System.out.println(m2.start() + " " + m2.group() + " ");
        }
        System.out.println("");


//        special characters - metacharacters
//        []\^$.|?*+()
//       Pattern p3 = Pattern.compile("1\\+1=2")
//        Pattern p3 = Pattern.compile("1+1=2")
        Pattern p3 = Pattern.compile("\\Q1+1=2\\E");
        Matcher m3 = p3.matcher("fffff  1+1=2  ffff");
        while (m3.find()) {
            System.out.println(m3.start() + " " + m3.group() + " ");
        }
        System.out.println("");

        Pattern p4 = Pattern.compile("cat");
        Matcher m4 = p4.matcher("He captured a catfish for his cat.");
        while (m4.find()) {
            System.out.println(m4.start() + " " + m4.group() + " ");
        }
        System.out.println("");

    }
}
