package codingBat.string1;

/*
    3. Интернет построен с использованием строк HTML, таких как «<i> Yay </i>»,
       которые выделяют Yay курсивом. В этом примере тег «i» образует <i> и </i>,
       которые окружают слово «Yay». Учитывая строки тегов и слов,
       создайте строку HTML с тегами вокруг слова, например, «<i> Yay </i>».
 */
public class Task3 {
    public String makeTags(String tag, String word) {
        return ("<" + tag + ">" + word + "</" + tag + ">");
    }
}
