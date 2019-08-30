package regexExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Dot Lesson
public class regexExpTutorial_4 {
    public static void main(String[] args) {
        //. - [^\n] unix - [^r/n] windows

        //mm/dd/yy
        Pattern p = Pattern.compile("\\d\\d.\\d\\d.\\d\\d");
        //Pattern p = Pattern.compile("\\d\\d[- /.]\\d\\d[- /.].\\d\\d");
        Matcher m = p.matcher("02/12/03");
        //Matcher m = p.mathcer("02512703");
        //Mathcer m = p.mathcer("grey");
        while (m.find()) {
            System.out.println(m.start() + " " + m.group() + " ");
        }
        System.out.println("");

        Pattern p2 = Pattern.compile("\".*\"");
        //Pattern p2 = Pattern.compile("\"[^\"\r\n]"\"");
        Matcher m2 = p2.matcher("Put a \"string\" between double quotes");
        //Mathcer m2 = p2.matcher("Houstan, we have a problem with \"string one\"  and  \"string two\" Please respond.");
        while (m2.find()) {
            System.out.println(m2.start() + " " + m2.group() + " ");
        }

    }
}
