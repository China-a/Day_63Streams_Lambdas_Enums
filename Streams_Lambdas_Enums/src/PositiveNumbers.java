import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersInputedByUser = new ArrayList<>();

        System.out.println("Input numbers, type 'end' to stop");
        while(true) {
            String userInput = scanner.nextLine();
            if(userInput.equalsIgnoreCase("end")) {
                break;
            }
            numbersInputedByUser.add(Integer.valueOf(userInput));
        }

    List<Integer> positive = positive(numbersInputedByUser);
        System.out.println(positive);
    }
    public static List<Integer> positive(List<Integer> numbers) {
        ArrayList<Integer> positive = numbers.stream()
                .filter(num -> num > 0)
                .collect(Collectors.toCollection(ArrayList::new));
        return positive;
    }
}

