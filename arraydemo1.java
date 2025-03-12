public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] array = new int[args.length];
        
        // Populate array with input arguments
        for (int i = 0; i < args.length; i++) {
            array[i] = Integer.parseInt(args[i]);
        }

        // Print the array values
        System.out.println("Array elements:");
        for (int num : array) {
            System.out.println(num);
        }
    }
}
















