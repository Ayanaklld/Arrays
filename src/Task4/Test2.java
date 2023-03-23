package Task4;

//2. Вывести первую половину массива (Вывести первую половину элементов массива при помощи цикла for).

public class Test2 {
    public static void main(String[] args) {
        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};

        for (int i = 0; i < nums.length / 2; i++){
            System.out.println(nums[i]);
        }
    }
}
