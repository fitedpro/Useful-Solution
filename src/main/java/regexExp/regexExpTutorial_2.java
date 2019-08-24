package regexExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexExpTutorial_2 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[0-5a-zA-U]");
        Matcher m = p.matcher("147dA");
        while (m.find()) {
            System.out.print(m.start() + " " + m.group() + " ");
        }
        System.out.println("");

        Pattern p2 = Pattern.compile("gr[ae]y");
        Matcher m2 = p2.matcher("gray");
        while (m2.find()) {
            System.out.print(m2.start() + " " + m2.group() + " ");
        }
        System.out.println("");


        // ^ = false
        Pattern p3 = Pattern.compile("g[^u]");
        Matcher m3 = p3.matcher("Irag is a country");
        //Mathcer m2 = p2.matcher("Iraq")
        while (m3.find()) {
            System.out.print(m3.start() + " " + m3.group() + " ");
        }
        System.out.println("");


        Pattern p4 = Pattern.compile("\\\\Q[ - ]\\\\E");
        Matcher m4 = p4.matcher("[ dsdsd - dsdsds ]");
        while (m4.find()) {
            System.out.print(m4.start() + " " + m4.group() + " ");
        }
        System.out.println("");

        // \d -> [0-9]   \D - [^d]
        // \w -[a-zA-Z0-9] \W-[^w\]
        // \s[ \t]    \S - [^s\]
        //[\s\d] \s\d
        //[\D\S]

        Pattern p5 = Pattern.compile("\\d");
        Matcher m5 = p5.matcher("abc 5 fdfd");
        while (m5.find()) {
            System.out.print(m5.start() + " " + m5.group() + " ");
        }
        System.out.println("");


        Pattern p6 = Pattern.compile("\\d");
        Matcher m6 = p6.matcher("abc 5 fdfd");
        while (m5.find()) {
            System.out.print(m6.start() + " " + m6.group() + " ");
        }
        System.out.println("");



    }
}
