public class MultipleOfFirst {
    public static void main(String[] args) {
        int[] arr = {3, 6, 9, 2, 12, 7, 15};

        if (arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int first = arr[0];
        System.out.println("Multiples of " + first + " in the array:");

        for (int num : arr) {
            if (num % first == 0) {
                System.out.println(num);
            }
        }
    }
}

