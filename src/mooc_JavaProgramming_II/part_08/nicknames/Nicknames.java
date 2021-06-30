package mooc_JavaProgramming_II.part_08.nicknames;

import java.util.HashMap;

/*
        В main-метод создайте новый HashMap<String,String> объект. Сохраните имена и псевдонимы
        следующих людей в этой хэш-карте, чтобы имя было ключом, а псевдоним - значением.
        Используйте только строчные буквы.

    matthew's nickname is matt
    michael's nickname is mix
    arthur's nickname is artie

    Затем возьмите ник Мэтью из хэш-карты и распечатайте его.
 */
public class Nicknames {
    public static void main(String[] args) {
        HashMap<String, String> nicknames = new HashMap<>();
        nicknames.put("matthew", "matt");
        nicknames.put("michael", "mix");
        nicknames.put("arthur", "artie");

        System.out.println(nicknames.get("matthew"));
    }
}
