package LldProjects.parkinglot1;

import LldProjects.parkinglot1.amountCalculator.AmountCalculatorFactory;
import LldProjects.parkinglot1.finder.FindStrategy;
import LldProjects.parkinglot1.finder.SlotFinderFactory;

import java.util.Objects;

public class ParkingManager {

    public static Slot findEmptySlot(Type type, FindStrategy findStrategy){
        return SlotFinderFactory.getSlotFinder(type).findSlot(findStrategy);
    }

    public static boolean emptySlot(Slot slot, Vehicle vehicle){

        slot.setOccupied(false);
        slot.setVehicleNum(null);
        vehicle.setSlotNum(null);

        DBAccessor.updateSlot(slot);
        DBAccessor.updateVehicle(vehicle);
        return true;
    }

    public static Tkt bookSlot(Slot slot, Vehicle vehicle){

        if(Objects.isNull(slot) && slot.isOccupied()){
            throw new RuntimeException();
        }
        if(Objects.isNull(vehicle) && Objects.nonNull(vehicle.getSlotNum())){
            throw new RuntimeException();
        }

        slot.setOccupied(true);
        slot.setVehicleNum(vehicle.getNum());
        vehicle.setSlotNum(slot.getVehicleNum());

        DBAccessor.updateSlot(slot);
        DBAccessor.updateVehicle(vehicle);

        Tkt tkt =  new Tkt(1, vehicle.getNum(), vehicle.getType());
        DBAccessor.updateTkt(tkt);

        return tkt;
    }

    public static Integer calculateAmount(Tkt tkt){
        return AmountCalculatorFactory.getCalculator(tkt.getVehicleType())
                .calculate(tkt);
    }

    public static boolean payTktAmount(Tkt tkt){
        return true;
    }

}

