package Task4;

//Вывести все элементы кроме первого и последнего.

public class Test4 {
    public static void main(String[] args) {
        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};

        for (int i = 1; i < nums.length - 1; i++){
            System.out.println(nums[i]);
        }
    }
}
