package delete.methodsWithMultiplicity;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class DeleteMultiplicity {

    public Set<String> removeEvenLength(Set<String> set) {

        Set<String> removeEvenLength = new LinkedHashSet<>();
        Iterator<String> stringIterator = set.iterator();
        while (stringIterator.hasNext()) {
            String nextString = stringIterator.next();
            if ((nextString.toCharArray().length % 2) != 0) {
                removeEvenLength.add(nextString);
            } else {
                //System.out.println("Удален " + nextString);
            }
        }
        System.out.println(removeEvenLength);
        return removeEvenLength;
    }
}
