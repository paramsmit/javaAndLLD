package LldProjects.elevator1;

import LldProjects.elevator1.states.State;
import LldProjects.elevator1.states.StateFactory;
import LldProjects.elevator1.states.StateName;

public class Elevator {

    private int currentFloor;

    private State state;

    public Elevator(int currentFloor) {
        this.currentFloor = currentFloor;
        this.state = StateFactory.getState(this, StateName.FLOOR);
    }

    public void openDoor(){
        this.state.openDoor();
    }

    public void closeDoor(){
        this.state.closeDoor();
    }

    public void goToFloor(int floorNum){
        this.state.goToFloor(floorNum);
    }

    public void changeState(StateName stateName){
        this.state = StateFactory.getState(this, stateName);
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

}
