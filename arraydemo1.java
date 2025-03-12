import java.util.*;

public class arraydemo1 {
    public static void main(String[] args) {
        int numbers[] = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0 ; i < numbers.length ; i++) {
            System.out.println("Enter array element " + (i + 1) + ":");
            numbers[i] = sc.nextInt();
        }

        System.out.println("The array elements are : ");
        for(int i = 0 ; i < numbers.length ; i++) {
            System.out.println(numbers[i]);
        }
    }
}
















