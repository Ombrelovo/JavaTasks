import java.util.Scanner;

public class Task1 {

    private static final String ERROR = "Данные введены неверно";
    private static final String NOT_PRIMARY_OR_COMPOSITE = " - не является ни простыми, ни составными ";
    private static final String PRIMARY = " - простое число ";
    private static final String COMPOSITE = " - составное число ";
    private static final String EVEN = " - чётное число";
    private static final String NOT_EVEN = " - нечётное число";

    protected static boolean isPrime(int number){
        boolean isIntPrimeNumber = true;
        for (int i = 2; i < number; i++) {
            if ( number % i == 0){
                isIntPrimeNumber = false;
                break;
            }
        }
        return  isIntPrimeNumber;
    }
    protected static boolean isEven(int number){
        return number % 2 == 0;
    }
    protected static boolean isZero(int number){
        return Math.abs(number) == 0;
    }
    protected static boolean isOne(int number){
        return Math.abs(number) == 1;
    }
    protected static String output(int number){
        String info = null;
        if (isZero(number)){
            info = number + NOT_PRIMARY_OR_COMPOSITE +number + EVEN;
        }

        if (isOne(number)){
            info = number + NOT_PRIMARY_OR_COMPOSITE +number + NOT_EVEN;
        }
        if(!isZero(number) && !isOne(number)) {
            if (isPrime(number)) {
                info = number + PRIMARY;
            } else {
                info = number + COMPOSITE;
            }
            if (isEven(number)) {
                info += number + EVEN;
            } else {
                info += number + NOT_EVEN;
            }
        }
        return info;
    }
    public static void main(String[] args){
        try {
            Scanner input = new Scanner(System.in);
            int newInt = input.nextInt();
            input.close();
            System.out.println(output(newInt));
        } catch (Exception  e){
            System.out.println(ERROR);
        }
    }
}