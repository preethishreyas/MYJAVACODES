import java.util.*;

public class ArrayOfSorting {
    public static int Sorted(int p) {
        int temp=0;
        int[] array =new int[20];
        for(int i=0;i<array.length;i++) {
            for(int j=i;j<array.length;j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    return Sorted;
                }

            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p =sc.nextInt();
        System.out.println(p);
    }
}