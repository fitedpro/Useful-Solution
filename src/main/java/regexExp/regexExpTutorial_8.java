package regexExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Opritional item - ? 0 - 1 repeat
public class regexExpTutorial_8 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("color?r");
        Matcher m = p.matcher("color colour");
        while (m.find()) {
            System.out.print(m.start() + " " + m.group() + " ");
        }
        System.out.println("");

        Pattern p2 = Pattern.compile("Nov(ember)?");
        Matcher m2 = p2.matcher("November Nov");
        while (m.find()) {
            System.out.print(m2.start() + " " + m2.group() + " ");
        }
        System.out.println("");

        Pattern p3 = Pattern.compile("Feb(ruary)? 23(rd)?");
        Matcher m3 = p3.matcher("February 23rd, February 23, Feb 23br, Feb");
        while (m3.find()) {
            System.out.print(m3.start() + " " + m3.group() + " ");
        }
        System.out.println("");

    }
}
