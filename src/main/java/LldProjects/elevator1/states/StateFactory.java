package LldProjects.elevator1.states;

import LldProjects.elevator1.Elevator;

public class StateFactory {
    private StateFactory(){
    }

    public static State getState(Elevator elevator, StateName stateName){
        if(StateName.OPEN_DOOR.equals(stateName)){
            return new DoorOpenState(elevator);
        } else if(StateName.FLOOR.equals(stateName)){
            return new FloorState(elevator);
        } else {
            return new TransitionState(elevator);
        }
    }

}
