package codingBat.string1;

/*
    2. Учитывая две строки, a и b,
       верните результат объединения их в порядке abba,
       например, «Hi» и «Bye» вернут «HiByeByeHi».
 */
public class Task2 {
    public String makeAbba(String a, String b) {
        return (a + b + b + a);
    }
}
