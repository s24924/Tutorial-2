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
    public static int findMajorityElement(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return -1;
        }

        int candidate = -1;
        int count = 0;
        for (int num : numbers) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        count = 0;
        for (int num : numbers) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > numbers.length / 2) {
            return candidate;
        } else {
            return -1;
        }
    }
    public static int[] shift(int[] numbers, int k) {
        if (numbers == null || numbers.length == 0) {
            return numbers;
        }

        int length = numbers.length;
        int[] resultArray = new int[length];

        int effectiveShift = k % length;

        for (int i = 0; i < length; i++) {
            int newIndex = (i + effectiveShift) % length;
            resultArray[newIndex] = numbers[i];
        }

        return resultArray;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 5, 3};
        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(filterEvenIndexOddValue(arr)));
        System.out.println(findMajorityElement(arr));
        System.out.println(findMajorityElement(arr2));
        System.out.println(Arrays.toString(shift(arr, 3)));
    }
}
