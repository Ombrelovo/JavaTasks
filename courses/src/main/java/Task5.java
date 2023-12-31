import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Task5 {
    private static final String MESSAGE = "Пожалуйста, введите длину последовательности";
    private static final String OUTPUTMESSAGE = "Все числа-палиндромы: ";

    public static void main(String[] args) {
        System.out.println(MESSAGE);
        Scanner input = new Scanner(System.in);
        int newInt = input.nextInt();
        input.close();
        System.out.println(OUTPUTMESSAGE);
        print(foundNum(newInt));
    }

    protected static int[] foundNum(int num){
        int[] array = new int[num+1];
        IntStream.range(0,num+1)
                .forEach(index -> array[index] = index);
        return Arrays.stream(array)
                .filter(number -> Integer.toString(number).equals(new StringBuilder(Integer.toString(number)).reverse().toString()))
                .toArray();
    }
    protected static void print(int[] array){
        Arrays.stream(array).forEach(System.out::println);
    }
}
