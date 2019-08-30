package regexExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//StartEndStringAncors //Ancors - якоря
public class regexExpTutorial_6 {
    public static void main(String[] args) {
//      ^ - Start line $ - End line
        Pattern p = Pattern.compile("^a");
//        Pattern p = Pattern.compile("^b");
//        Pattern p = Pattern.compile("c$");
//        Pattern p = Pattern.compile("b$");

        Matcher m = p.matcher("abc");
        while (m.find()) {
            System.out.println(m.start() + " " + m.group() + " ");
        }
        System.out.println("");



        //Pattern p2 = Pattern.compile("\\d+"); - incorrect
        Pattern p2 = Pattern.compile("^\\d+$");
        Matcher m2 = p2.matcher("234");
        if( m2.find()) {
            System.out.println("it's a number");
        }
        System.out.println("");
//        //A - start line //Z - end line
        Pattern p3 = Pattern.compile("ne$", Pattern.MULTILINE); // ignore /n
//        Pattern p3 = Pattern.compile("ne\\Z", Pattern.MULTILINE); //consider /n
//         Pattern p3 = Pattern.compile("\\ne\\z", Pattern.MULTILINE);
        Matcher m3 = p3.matcher("first line\n second line");
        while (m3.find()) {
            System.out.println(m3.start() + " " + m3.group() + " ");
        }
        System.out.println("");

    }
}
