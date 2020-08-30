package Arrays;

import java.util.*;

public class EliminateDuplicates {
    public static void eliminateDuplicates() {
        String tableWithOutDuplicates = "The table without duplicates values: ";
        List<Integer> table = new ArrayList<>();

        //method to add numbers to list from user, it continues when user press y or Y
        enterNumber(table);
        System.out.print("\n" + tableWithOutDuplicates);
        List<Integer> finalTable = new ArrayList<>(removeDuplicates(table));

        for (int i = 0; i <= finalTable.size() - 1; i++)
            System.out.print(finalTable.get(i) + " ");
    }

    private static List<Integer> enterNumber(List<Integer> table) {

        char continueAnswer = ' ';
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter a number: ");
            table.add(input.nextInt());
            System.out.print("Do you want to add more, press y or Y to continue: ");
            continueAnswer = input.next().charAt(0);

        } while ((continueAnswer == 'y') || (continueAnswer == 'Y'));
        return table;
    }


    private static Set removeDuplicates(List<Integer> table) {
        Collections.sort(table);

        Set<Integer> tableWithoutDuplicates = new HashSet<>();
        for (int number : table)
            tableWithoutDuplicates.add(number);
        return tableWithoutDuplicates;
    }

}
