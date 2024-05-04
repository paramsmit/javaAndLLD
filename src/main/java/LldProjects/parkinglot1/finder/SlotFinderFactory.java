// it is just about the goal and continuous hard work

package LldProjects.parkinglot1.finder;
import LldProjects.parkinglot1.Type;

public class SlotFinderFactory {
    public static SlotFinder getSlotFinder(Type type){
        if(Type.CAR.equals(type)){
            return new CarSlotFinder();
        } else if(Type.BIKE.equals(type)){
            return null;
        } else if(Type.BUS.equals(type)){
            return null;
        } else if(Type.TRUCK.equals(type)){
            return null;
        } else {
            throw new RuntimeException();
        }
    }
}
