package codingBat.string2;

/*
    8. Мы скажем, что String является xy-сбалансированным,
       если для всех символов 'x' в строке существует
       символ 'y' где-то позже в строке. Итак, «xxy» сбалансировано, а «xyx» - нет.
       Один «y» может уравновесить несколько «x».
       Вернуть истину, если данная строка сбалансирована по оси xy.
 */
public class Task8 {
    public boolean xyBalance(String str) {
        return (str.indexOf('x') == -1) ||
                str.lastIndexOf('x') < str.lastIndexOf('y');
    }
}
