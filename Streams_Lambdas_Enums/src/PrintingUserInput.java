import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintingUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        System.out.println("Input text");
        while (true) {
            String userInput = scanner.nextLine();
            if(userInput.equals("")){
                break;
            }
            list.add(userInput);
        }

        list.stream()
                .forEach(input -> System.out.println(input));
    }
}
