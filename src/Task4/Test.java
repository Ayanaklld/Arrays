package Task4;

// Вывести первые 3 элемента массива (Вывести первые 3 элемента массива используя цикл for).

public class Test {
    public static void main(String[] args) {
        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};

        int count = 3;
        for (int i = 0; i < count; i++){
            System.out.println(nums[i]);
        }
    }
}
