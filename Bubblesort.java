import java.util.*;

public class Bubblesort {
    public static void bubble() {
        int temp;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] array = new int[20];
        for (int i = 0; i < a; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

        }
        // return 0;
        // System.out.println(array[]);

    }

    public static void main(String[] args) {
        /**
         * Scanner sc = new Scanner(System.in);
         * int a = sc.nextInt();
         * int[] b=new int[20];
         * for(int i=0;i<b.length;i++) {
         * b[i]=sc.nextInt();
         * }
         **/
        // System.out.println(bubble());
        Bubblesort bubble = new Bubblesort();
        Bubblesort.bubble();
        System.out.println(array[]);
    }
}
