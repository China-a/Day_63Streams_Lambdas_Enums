import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {
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

        double averageOfNumbers = numbersInputedByUser.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();

        System.out.println("Average of the numbers:" + averageOfNumbers);


    }
}

