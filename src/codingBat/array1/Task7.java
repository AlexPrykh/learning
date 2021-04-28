package codingBat.array1;

/*
    7. Для массива длиной 3 целых числа, вернуть новый массив с элементами в обратном порядке,
       так что {1, 2, 3} становится {3, 2, 1}.
 */
public class Task7 {
    public int[] reverse3(int[] nums) {
        return new int[]{nums[2], nums[1], nums[0]};
    }
}
