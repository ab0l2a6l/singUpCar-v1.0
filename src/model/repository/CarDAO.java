package model.repository;

import common.StaticScanner;
import model.entity.Car;
import model.exception.Exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarDAO {
    private Scanner input = StaticScanner.getData();

    private List<Car> cars = new ArrayList<>();
    private Car car = new Car();
    private String wantAddCar;
    private int doYouWantAdd;

    public void save() {
        doYouWantAddCar();
        checkCanUserAdd();
        getDataFromUser();
        addCar();
        printResult();
    }

    public void doYouWantAddCar() {
        System.out.println("do you want to add car?(Y , N)");
        wantAddCar = input.nextLine().toUpperCase();
    }

    public void checkCanUserAdd() {
        try {
            Exceptions.validateWandAddCar(wantAddCar);
            if (wantAddCar.equals("N"))
                doYouWantAdd = 0;
            else if (wantAddCar.equals("Y"))
                doYouWantAdd = 1;
        } catch (Exception e) {
            doYouWantAdd = 0;
            System.out.println(e.getMessage());
        }
    }

    public void getDataFromUser() {
        if (doYouWantAdd == 1) {
            System.out.print("insert car type: ");
            car.setCarType(input.nextLine());
        }
    }

    public void addCar() {
        if (doYouWantAdd == 1)
            cars.add(car);

    }

    public void printResult() {
        if (doYouWantAdd == 1)
            System.out.println("added");
    }
}