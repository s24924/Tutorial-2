import java.util.Arrays;

public class Main {
    public static int[] filterEvenIndexOddValue(int[] numbers) {

        if (numbers == null) {
            return new int[0];
        }
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0 && numbers[i] % 2 != 0) {
                count++;
            }
        }

        int[] resultArray = new int[count];
        int resultIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0 && numbers[i] % 2 != 0) {
                resultArray[resultIndex] = numbers[i];
                resultIndex++;
            }
        }
        return resultArray;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 5, 3};
        System.out.println(Arrays.toString(filterEvenIndexOddValue(arr)));
    }
}
