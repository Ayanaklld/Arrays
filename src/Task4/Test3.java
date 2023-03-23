package Task4;

//Вывести вторую половину массива (Вывести вторую половину элементов массива
//при помощи цикла for). Реализация задачи должна работать при любом чётном
//количестве элементов.

public class Test3 {
    public static void main(String[] args) {
        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};

        for (int i = nums.length/2; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}
