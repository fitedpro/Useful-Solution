package regexExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexExpTutorial_introduction{
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\b[A-za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b");
        Matcher m = p.matcher("ma email is mymail@mail.ru");
        while (m.find()) {
            System.out.println(m.start() + " " + m.group() + " ");
        }
        System.out.println("");
    }
}
