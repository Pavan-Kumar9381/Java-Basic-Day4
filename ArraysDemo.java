public class ArraysDemo {
    public static void main(String[] args) {
        // 1. Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};

        // 2. Print array elements using for loop
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }

        // 3. Calculate sum of elements
        int sum = 0;
        for (int num : numbers) {  // enhanced for loop
            sum += num;
        }
        System.out.println("Sum = " + sum);

        // 4. Calculate average
        double average = (double) sum / numbers.length;
        System.out.println("Average = " + average);

        // 5. Find largest element
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Largest element = " + max);

        // 6. Example: String array
        String[] fruits = {"Apple", "Banana", "Mango"};
        System.out.println("\nFruits array:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
