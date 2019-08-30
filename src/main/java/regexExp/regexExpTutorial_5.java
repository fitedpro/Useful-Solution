package regexExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexExpTutorial_5 {
    public static void main(String[] args) {
        //Word Boundaries - Граница слова
        //\b \bbird\b \B \w \W
        //\b\w+\b
        Pattern p = Pattern.compile("\\bis\\b");
        Matcher m = p.matcher("This island is beautiful");
        while (m.find()) {
            System.out.println(m.start() + " " + m.group() + " ");
        }
    }
}
