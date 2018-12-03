package testHelpers;

import java.util.ArrayList;
import java.util.List;

public class ValuesKeeper {

    private static List<String> listOfSavedValues = new ArrayList<>();

    public static List<String> getListOfSavedValues() {
        return listOfSavedValues;
    }

    public static void saveValueToList(String valueToSave) {
        listOfSavedValues.add(valueToSave);
    }
}