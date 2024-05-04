package LldProjects.parkinglot1;

import LldProjects.parkinglot1.finder.FindStrategy;

public class Driver {
    public static void main(String[] args){

        Vehicle v = new Vehicle(Type.CAR, 1);

        Slot slot = ParkingManager.findEmptySlot(v.getType(), FindStrategy.NEAREST);
        Tkt tkt = ParkingManager.bookSlot(slot, v);

        ParkingManager.emptySlot(slot, v);
        // tkt intime will be updated here.

        ParkingManager.calculateAmount(tkt);
//        ParkingManager.payTktAmount(tkt);
    }
}
