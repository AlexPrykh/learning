package mooc_JavaProgramming_II.part_08.iOweYou;

public class Main {
    public static void main(String[] args) {
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));
        System.out.println();

        /*
        Будьте осторожны в ситуациях, когда человек никому ничего не должен.
        Долгая расписка не заботится о старых долгах. Когда вы устанавливаете новую сумму,
        причитающуюся человеку, когда есть деньги, уже причитающиеся тому же лицу, старый долг
        забывается.
        */

        IOU mattsIOU2 = new IOU();
        mattsIOU2.setSum("Arthur", 51.5);
        mattsIOU2.setSum("Arthur", 10.5);

        System.out.println(mattsIOU2.howMuchDoIOweTo("Arthur"));
    }
}
