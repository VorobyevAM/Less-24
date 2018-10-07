package delete;

import delete.methodsWithMultiplicity.DeleteMultiplicity;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        DeleteMultiplicity deleteMultiplicity = new DeleteMultiplicity();

        Set<String> stringSet = new LinkedHashSet<>();
        stringSet.add("Жили");
        stringSet.add("были");
        stringSet.add("у");
        stringSet.add("бабуси");
        stringSet.add("два");
        stringSet.add("веселых");
        stringSet.add("гуся");
        stringSet.add("Один");
        stringSet.add("серый");
        stringSet.add("другой");
        stringSet.add("белый");

        System.out.println("Начальное множество строк\n" + stringSet);

        System.out.println("Итоговое:");
        deleteMultiplicity.removeEvenLength(stringSet);
    }

}
