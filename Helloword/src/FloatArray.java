public class FloatArray {
    public static void main(String[] args) {
        float[] numbers = {1.2f, 3.4f, 5.6f, 7.8f, 9.0f};

        float max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("The greatest number in the array is: " + max);
    }
}
