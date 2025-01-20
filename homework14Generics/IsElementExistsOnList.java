package homework14Generics;

import java.util.ArrayList;

public class IsElementExistsOnList {
    public static <T> boolean isElementExistsOnList(ArrayList<T> arrayList, T element) {
        return arrayList.contains(element);
    }
}
