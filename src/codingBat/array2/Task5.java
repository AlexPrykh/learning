package codingBat.array2;

/*
    5. Возвращает сумму чисел в массиве, за исключением игнорирования частей чисел,
       начинающихся с 6 и продолжающихся до следующих 7
       (каждые 6 будут сопровождаться по крайней мере одной 7). Если нет чисел, верните 0.
 */
public class Task5 {
    public int sum67(int[] nums) {
        int sum = 0;
        boolean stop = false;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 6) {
                stop = true;
            }

            if (!stop) {
                sum += nums[i];
            }

            if (nums[i] == 7 && stop) {
                stop = false;
            }
        }
        return sum;
    }
}
