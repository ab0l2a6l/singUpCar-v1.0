package controler;

import model.repository.CarDAO;

public class Main {
    public static void main(String[] args) {
        CarDAO carDAO = new CarDAO();
        for (; ; ) {
            carDAO.save();
        }
    }
}