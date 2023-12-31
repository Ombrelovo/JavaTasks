import java.util.Scanner;

public class Task2 {
    private static final String ERROR = "Данные введены неверно";
    private static final String MESSAGE = "Пожалуйста, введите два целых числа";
    private static final String GCD = "НОД = ";
    private static final String LCM = ", НОК = ";

    protected static int findingGCD(int num1, int num2){
        return num2 == 0 ? num1 : findingGCD(num2,num1 % num2);
    }
    protected static int findingLCM(int num1, int num2){
        return num1 / findingGCD(num1,num2) * num2;
    }
    protected static boolean isItZero(int num1, int num2){
        return num1 == 0 || num2 == 0;
    }
    protected static boolean isItNegative(int num1, int num2){
        return num1 < 0 || num2 < 0;
    }
    private static void finishCode(int num1, int num2){
        if (isItZero(num1,num2) || isItNegative(num1,num2)){
            System.out.println(ERROR);
            System.exit(0);
        } else {
            System.out.println( GCD + findingGCD(num1,num2) + LCM + findingLCM(num1,num2));
        }
    }

    public static void main (String [] args){
        try{
            System.out.println(MESSAGE);
            Scanner input = new Scanner(System.in);
            int newInt1 = input.nextInt(), newInt2 = input.nextInt();
            input.close();
            finishCode(newInt1,newInt2);
        } catch (Exception  e){
            System.out.println(ERROR);
        }
    }
}
