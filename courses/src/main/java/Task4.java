
import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    private static final String MESSAGEOFFER = "Пожалуйста, введите строку";
    private static final String MESSAGEWORD = "Пожалуйста, введите искомое слово";


    public static void main(String [] args){
        System.out.println(MESSAGEOFFER);
        Scanner input = new Scanner(System.in);
        String offer = input.nextLine();
        System.out.println(MESSAGEWORD);
        String word = input.nextLine();
        input.close();
        System.out.println(wordsCount(offer,word));
    }

    protected static long wordsCount(String offer, String foundWord){
        return  Arrays.stream(offer.replaceAll("\\p{Punct}", " ")
                .split("[ ]+"))
                .parallel()
                .filter(word -> word.equalsIgnoreCase(foundWord))
                .count();
    }
}
