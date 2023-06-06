import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Number of Array Size:");
        int arr_size = input.nextInt();
        int arr[] = new int[arr_size];

        System.out.println("Enter the Number of Array Values:");
        for (int i = 0; i < arr_size; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Number of TestCases:");
        int testcase = input.nextInt();
        System.out.println("Enter the Number:");
        int arr1[] = new int[testcase];
        for (int k = 1; k <= testcase; k++) {
            arr1[testcase] = input.nextInt();
        }
        int flag = 3;
        for (int i = 0; i < testcase; i++) {
            for (int j = 0; j < arr_size; j++) {
                if (arr1[i] == arr[j]) {
                    flag = 1;
                    break;
                } else {
                    flag = 0;
                }
            }
            if (flag == 1) {
                System.out.println("YES");
            }
            if (flag == 0) {
                System.out.println("NO");
            }
        }
    }

}
