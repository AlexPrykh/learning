package codingBat.array1;

/*
    8. Учитывая массив с длиной int 3, выясните, какой из них больше,
       первый или последний элемент в массиве,
       и установите все остальные элементы на это значение. Вернуть измененный массив.
 */
public class Task8 {
    public int[] maxEnd3(int[] nums) {
        int[] maxValue = new int[3];

        maxValue[0] = nums[0];

        if (nums[2] >= maxValue[0]) {
            maxValue[0] = nums[2];
        }
        maxValue[1] = maxValue[0];
        maxValue[2] = maxValue[0];
        return maxValue;
    }
}
