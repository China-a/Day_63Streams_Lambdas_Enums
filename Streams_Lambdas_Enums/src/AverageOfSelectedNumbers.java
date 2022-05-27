import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> numbersInputedByUser = new ArrayList<>();

        System.out.println("Input numbers, type 'end' to stop");
        while(true) {
            String userInput = scanner.nextLine();
            if(userInput.equalsIgnoreCase("end")) {
                break;
            }
            numbersInputedByUser.add(userInput);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (N for negative/ P for positive");
        String userInput2 = scanner.nextLine();

        if(userInput2.equalsIgnoreCase("p")) {
            double averageOfPositiveNumbers = numbersInputedByUser.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(num -> num > 0).average()
                    .getAsDouble();
            System.out.println("Average of the numbers:" + averageOfPositiveNumbers);
        }

        if(userInput2.equalsIgnoreCase("n")) {
            double averageOfNegativeNumbers = numbersInputedByUser.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(num -> num < 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the numbers:" + averageOfNegativeNumbers);
        }

    }
}
