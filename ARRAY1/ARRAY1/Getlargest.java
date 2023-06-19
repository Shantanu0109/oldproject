public class Getlargest {

    public static int largest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest =Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
            System.out.println("Smallest number is " + smallest);

    return largest;
}
    public static void main(String[] args) {
        int numbers []={2,3,4,5,66,77,8,23};
        System.out.println("LARGEST NUMBER IS " + largest(numbers));
    }
}
