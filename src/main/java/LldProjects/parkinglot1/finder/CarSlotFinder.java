package LldProjects.parkinglot1.finder;

import LldProjects.parkinglot1.DBAccessor;
import LldProjects.parkinglot1.Slot;
import LldProjects.parkinglot1.Type;

import java.util.List;

public class CarSlotFinder implements SlotFinder{
    @Override
    public Slot findSlot(FindStrategy strategy) {
        List<Slot> slot = DBAccessor.findEmptySlots(Type.CAR);

        if(FindStrategy.NEAREST.equals(strategy)){

        } else if(FindStrategy.RANDOM.equals(strategy)) {

        } else {
            throw new RuntimeException();
        }

        // just for brevity
        return slot.get(0);
    }

}

