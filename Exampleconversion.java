
import java.util.Scanner;

public class Exampleconversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a snake case string: ");
        String snakeCaseString = scanner.nextLine();
        String camelCaseString = convertSnakeToCamel(snakeCaseString);
        System.out.println("Camel case string: " + camelCaseString);
    }

    public static String convertSnakeToCamel(String snakeCaseString) {
        StringBuilder camelCaseBuilder = new StringBuilder();
        String[] words = snakeCaseString.split("_");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (i == 0) {
                camelCaseBuilder.append(word);
            } else {
                String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1);
                camelCaseBuilder.append(capitalizedWord);
            }
        }

        return camelCaseBuilder.toString();
    }
}
