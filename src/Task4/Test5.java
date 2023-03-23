package Task4;

//Вывести последние 3 элемента массива (Для массива [7, -3, 9, -11, 18, 99, 2, 11]
//вывод должен быть таким: 99, 2, 11)

public class Test5 {
    public static void main(String[] args) {
        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};

        for (int i = nums.length - 3; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}
