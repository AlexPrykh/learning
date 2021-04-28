package codingBat.array1;

/*
    9. Учитывая массив целых чисел, верните сумму первых двух элементов в массиве.
       Если длина массива меньше 2,
       просто просуммируйте существующие элементы, возвращая 0, если длина массива равна 0.
 */
public class Task9 {
    public int sum2(int[] nums) {
        if (nums.length >= 2) {
            return (nums[0] + nums[1]);
        } else if (nums.length == 1) {
            return nums[0];
        }
        return 0;
    }
}
