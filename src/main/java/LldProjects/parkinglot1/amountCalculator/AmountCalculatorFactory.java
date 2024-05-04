package LldProjects.parkinglot1.amountCalculator;

import LldProjects.parkinglot1.Type;

public class AmountCalculatorFactory {

    public static Calculator getCalculator(Type type){

        if(Type.BUS.equals(type)){
            return new BusTktCalculator();
        } else if(Type.CAR.equals(type)){
            return new CarTktCalculator();
        } else if(Type.TRUCK.equals(type)){
            return new TruckTktCalculator();
        } else if(Type.BIKE.equals(type)){
            return new BikeTktCalculator();
        }
        throw new RuntimeException();
    }

}
