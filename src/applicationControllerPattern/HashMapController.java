package applicationControllerPattern;

import java.util.HashMap;

public class HashMapController {

    public static HashMap<String, convertionFormula> index = new HashMap<String, convertionFormula>();

    public void Controller() {

    }

    public static void hashMapMap(String operation, Integer engineSize) {
        index.put("a", new toInches());
        index.put("b", new toCentimeters());

        convertionFormula handler = index.get(operation);
        handler.execute(engineSize);
    }
}
