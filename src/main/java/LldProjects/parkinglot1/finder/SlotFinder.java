package LldProjects.parkinglot1.finder;

import LldProjects.parkinglot1.Slot;
import LldProjects.parkinglot1.Type;

public interface SlotFinder {
    Slot findSlot(FindStrategy strategy);
}
