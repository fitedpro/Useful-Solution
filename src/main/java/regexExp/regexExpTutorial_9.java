package regexExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexExpTutorial_9 {
    public static void main(String[] args) {
        //StarPlusReception
        //*  - 0 => ∞ + - 1 => ∞ \\b - break word
        Pattern p = Pattern.compile("<[A-za-z][A-Za-z0-9]*");
        Matcher m = p.matcher("<h1>");
        //Matcher m = p.matcher("<a>");
        while (m.find()) {
            System.out.print(m.start() + " " + m.group() + " ");
        }
        System.out.println("");


        Pattern p2 = Pattern.compile("\\b[1-9][0-9]{3}\\b"); // {0,} - *
        //Pattern p2 = Pattern.compile("\\b[1-9][0-9]{2,4}\\b"); // {1,} - +
        //Matcher m2 = p2.matcher("100 99999")
        Matcher m2 = p2.matcher("1000 7777 9999");

        while (m2.find()) {
            System.out.print(m2.start() + " " + m2.group() + " ");
        }
        System.out.println("");

        Pattern p3 = Pattern.compile("<.+>"); //greedy ? - lazy reluctant
        //Pattern p3 = Pattern.compile("<.+?>");
        //Pattern p3 = Pattern.compile("<[^>]+>);
        Matcher m3 = p3.matcher("This is a <EM>first</EM> test");
        while (m3.find()) {
            System.out.print(m3.start() + " " + m3.group() + " ");
        }
        System.out.println("");

    }
}
