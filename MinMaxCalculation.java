public class MinMaxCalculation {
    public static void main(String[] args) {
        int[] numbers = {23, 56, 78, 12, 4, 89, 45};
        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
