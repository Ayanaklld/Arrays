package Task3;

public class Test {
    public static void main(String[] args) {
        String[] islands = new String[4];
        int[] index = new int[4];

        islands[0] = "Бермуды";
        islands[1] = "Фиджи";
        islands[2] = "Азорские острова";
        islands[3] = "Косумель";

        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        int y = 0;
        int ref;

        while (y < 4){
            System.out.print("острова = ");
            ref = index[y];
            System.out.println(islands[ref]);
            y = y + 1;
        }
    }
}
