package task3_1.data;

import task3_1.model.entity.Constructor;
import task3_1.model.entity.StuffedToy;
import task3_1.model.entity.Toy;

public class DataSource {
    private static Toy[] toys = {
            new StuffedToy("Bear", 300, 0, 500),
            new StuffedToy("Rabbit", 250, 1, 100),
            new StuffedToy("Dog", 200, 0, 200),
            new Constructor("Castle", 700, 5, 500),
            new Constructor("Railway", 800, 6, 40),
    };

    public static Toy[] getToys() {
        return toys;
    }
}
