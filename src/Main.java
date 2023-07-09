import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Вводити з клавіатури рядки, доки користувач не введе рядок 'end':
 * 1. Створити перелік рядків.
 * 2. Ввести рядки з клавіатури та додати їх до списку.
 * 3. Вводити з клавіатури рядки, доки користувач не введе рядок "end". "end" не враховувати.
 * 4. Вивести рядки на екран, кожен з нового рядка.
 */


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> someListString = new ArrayList<>();

        StringComparator stringComparator = new StringComparator();

        while (true) {
            String someWord = scanner.next();
            if (stringComparator.compare(someWord, "end") == 0) {
                break;
            } else {
                someListString.add(someWord);
            }

        }

        for (int i = 0; i < someListString.size(); i++) {
            System.out.println(someListString.get(i));
        }


    }


}
