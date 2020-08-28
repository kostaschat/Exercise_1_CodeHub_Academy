package Arrays;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class EliminateDublicates {
    public static void eliminateDublicates() {
        String tableWithDuplicates = "The table have this values: ";
        String tableWithOutDuplicates = "The table without duplicates values: ";

        int [] table = {1,10,2,3,7,4,3,2,1,22,3,22,15,14,15,14};

        System.out.print(tableWithDuplicates);
        for(int i=0; i< table.length; i++)
            System.out.print(table[i]+" ");

        System.out.print("\n" +tableWithOutDuplicates);
        System.out.print(removeDuplicates(table));


    }


    private static Set removeDuplicates(int[] table) {
        Arrays.sort(table);

        Set<Integer> tableWithoutDuplicates = new HashSet<>();
        for (int number : table)
            tableWithoutDuplicates.add(number);
        return tableWithoutDuplicates;
    }

}
