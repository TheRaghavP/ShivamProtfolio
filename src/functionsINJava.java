import java.util.Scanner;

public class functionsINJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = {
                {2, 5, 1},
                {7, 9, 10,12,14},
                {3, 6, 11}
        };
        System.out.print("search = ");
        int n = scanner.nextInt();
        System.out.println(searching(arr, n));
    }

    static boolean searching(int[][] arr, int n) {

        int start = 0;
        int end = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (n == arr[i][j]){
                    return true;
                }
            }
        }

        return false;
    }

}
