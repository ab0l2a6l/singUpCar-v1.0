package model.exception;

public class Exceptions {
    public static void validateWandAddCar(String wantAddCar) throws Exception {
        if (!wantAddCar.equals("Y") && !wantAddCar.equals("N"))
            throw new Exception("must be \"Y\" or \"N\"");

    }
}
