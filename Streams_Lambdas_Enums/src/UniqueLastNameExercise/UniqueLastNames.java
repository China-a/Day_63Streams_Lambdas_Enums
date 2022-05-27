package UniqueLastNameExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UniqueLastNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> list = new ArrayList<>();

        while (true) {
            System.out.println("Continue personal information input? 'quit' ends: ");
            String userInput = scanner.nextLine();

            if(userInput.equalsIgnoreCase("quit")){
                break;
            }

            System.out.print("Input first name: ");
            String firstName = scanner.nextLine();
            System.out.print("Input last name: ");
            String lastName = scanner.nextLine();
            System.out.print("Input the year of birth: ");
            Integer birthYear = Integer.valueOf(scanner.nextLine());


            list.add( new Person(firstName, lastName, birthYear));

        }

        System.out.println("Unique last names in alphabetical order: ");
        list.stream()
                .map(person -> person.getLastName())
                .distinct()
                .sorted()
                .forEach(input -> System.out.println(input));
    }
}
