import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Input number");
        while (true) {
            int userInput = Integer.parseInt(scanner.nextLine());
            if(userInput < 0){
                break;
            }
            list.add(userInput);
        }

        list.stream()
                .filter(input -> input > 0 && input <= 5 )
                .forEach(input -> System.out.println(input));
    }
}
