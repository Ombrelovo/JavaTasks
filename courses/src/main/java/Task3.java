
import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    private static final String MESSAGE = "Пожалуйста, введите строку";
    private static final String COUNT = "Количество слов в строке: ";
    private static final String WORDLIST = "Все слова в предложении: ";

    protected static String[] allWords(String offer){
        String newOffer = offer.replaceAll("\\p{Punct}", " ");
        return newOffer.split("[ ]+");
    }
    protected static int wordCount(String offer){
        return allWords(offer).length;
    }
    protected static String[] sorting(String offer){
        String[] words = allWords(offer);
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
        return words;
    }
    protected static void print(String [] arr){
        Arrays.stream(arr).map(word -> word.substring(0, 1).toUpperCase() + word.substring(1)).forEach(System.out::println);
    }

    public static void main(String [] args){
        System.out.println(MESSAGE);
        Scanner input = new Scanner(System.in);
        String offer = input.nextLine();
        input.close();
        System.out.println(COUNT + wordCount(offer));
        System.out.println(WORDLIST);
        print(sorting(offer));
    }
}
