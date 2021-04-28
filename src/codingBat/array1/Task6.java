package codingBat.array1;

/*
    6. Для массива длиной 3 целых числа вернуть массив с элементами,
       «повернутыми влево», так что {1, 2, 3} дает {2, 3, 1}.
 */
public class Task6 {
    public int[] rotateLeft3(int[] nums) {
        return new int[]{nums[1], nums[2], nums[0]};
    }
}
