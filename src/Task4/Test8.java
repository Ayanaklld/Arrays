package Task4;

//Найти максимальный и минимальный элементы массива (Необходимо
//определить максимальный и минимальный элементы в массиве и вывести их).

public class Test8 {
    public static void main(String[] args) {
        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};
        int max = nums[0];
        int min = nums[0];

        for (int i = 0; i < nums.length; i++){
            if (nums[i] > max){
                max = nums[i];
            } else if (nums[i] < min){
                min = nums[i];
            }
        }

        System.out.println("Max element: " + max);
        System.out.println("Min element: " + min);
    }
}
