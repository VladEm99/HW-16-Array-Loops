import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static final int ARRAY_LENGTH = 10;
    public static void main(String[] args) {


        //Task 1
        System.out.println("TASK 1:");

        int[] array = {144, 12, 89, 6078, 51, 1, 60};
        int arrayIntegersSum = 0;

        for (int i = 0; i < array.length; i++) {
            arrayIntegersSum += array[i];
        }
        System.out.println("Array: " + Arrays.toString(array) + "\n" + "Average value of array: "
                + arrayIntegersSum / array.length + "\n");


        //Task 2
        System.out.println("TASK 2:");

        int[] arrayToFindMaxValue = {144, 12, 89, 6078, 51, 1, 60};
        int maxValue = arrayToFindMaxValue[0];

        for (int i = 0; i < arrayToFindMaxValue.length; i++) {
            if (arrayToFindMaxValue[i] > maxValue)
                maxValue = arrayToFindMaxValue[i];
        }
        System.out.println("Array: " + Arrays.toString(arrayToFindMaxValue) + "\n" +
                "Max value of array: " + maxValue + "\n");


        //Task 3
        System.out.println("TASK 3:");

        int[] numbers = {1, 2, 33, 4, 5, 5, 33, 1};
        boolean haveRepeatableValues = false;

        System.out.println("Array: " + Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++){
                if(numbers[i] == numbers[j]) {
                    System.out.println("Repeatable value: " + numbers[j]);
                    haveRepeatableValues = true;
                }
            }
        }
        if(haveRepeatableValues == true){
            System.out.println(" ");
        }
        else{
            System.out.println("There is no repeatable values." + "\n");
        }


        //Task 4
        System.out.println("TASK 4:");

        int[] arrayForSumming = {45, 10, 15, 20};
        int arrayValuesSum = 0;

        for(int i = 0; i < arrayForSumming.length; i++){
            arrayValuesSum += arrayForSumming[i];
        }
        System.out.println("Array: " + Arrays.toString(arrayForSumming) + "\n" +
                "Sum of array integers: " + arrayValuesSum + "\n");


        //Task 5
        System.out.println("TASK 5:");

        for(int i = 10; i != 0; i--){
            System.out.println(i);
        }


        // Task 6A
        System.out.println("\n" + "TASK 6A:");
        String string = "Hello, World!";

        int count = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ') {
                count++;
            }
        }
        System.out.println("String to count chars from: " + string);
        System.out.println("Counted amount of chars: " + count);


        //Task 6B
        System.out.println("\n" + "TASK 6B:");
        String stringToCountSpaces = "All of The Times";
        int countedSpaces = 0;

        for (int i = 0; i < stringToCountSpaces.length(); i++) {
            if (stringToCountSpaces.charAt(i) == ' ') {
                countedSpaces++;
            }
        }
        System.out.println("String to count chars from: " + stringToCountSpaces);
        System.out.println("Counted amount of spaces: " + countedSpaces);


        //Task 7
        System.out.println("\n" + "TASK 7:");

        int[] arrayForSumWithWhile = {5, 10, 100, 1};
        int sumOfArrayWithWhile = 0;
        int i = 0;

        while(i < arrayForSumWithWhile.length) {
            sumOfArrayWithWhile += arrayForSumWithWhile[i];
            i++;
        }
        System.out.println("Array: " + Arrays.toString(arrayForSumWithWhile) + "\n" +
                "Sum of array integers: " + sumOfArrayWithWhile);


        //Task 6 bonus
        System.out.println("\n" + "TASK 6 BONUS:");
        Random random = new Random();
        int[] arrayWithRandomGeneratedValues = new int[ARRAY_LENGTH];

        for(int x = 0; x < arrayWithRandomGeneratedValues.length; x++){
            arrayWithRandomGeneratedValues[x] = random.nextInt(0, 50);
        }
        System.out.println("Random generated array with 10 values:"
                + Arrays.toString(arrayWithRandomGeneratedValues));


        //Task 7 bonus
        System.out.println("\n" + "TASK 7 BONUS:");
        int[] arrayOneToTen = new int[ARRAY_LENGTH];

        for(int y = 0; y < arrayOneToTen.length; y++){
            arrayOneToTen[y] = y + 1;
        }

        //First solution with fixed array length
        int[] arrayWithEvenNumbers = new int[arrayOneToTen.length / 2];//Division by 2 because array with only
        // even numbers will be 2 time shorter, otherwise there will be five zeroes in new array at the end

        int index = 0;

        for(int even : arrayOneToTen){
            if(even % 2 == 0){
                arrayWithEvenNumbers[index] = even;
                index++;
            }
        }


        //Second solution with dynamic array
        ArrayList<Integer> evenNumbersArray = new ArrayList<>();

        for(int q : arrayOneToTen){
            if(q % 2 == 0){
                evenNumbersArray.add(q);
            }
        }

        System.out.println("Array from 1 to 10 made with loop: " + Arrays.toString(arrayOneToTen));
        System.out.println("Array with even numbers from first array made with loop: "
                + Arrays.toString(arrayWithEvenNumbers));
        System.out.println("Array with even numbers from first array made with loop and dynamic array: "
                + evenNumbersArray);
    }
}