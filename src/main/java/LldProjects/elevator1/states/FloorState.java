package LldProjects.elevator1.states;

import LldProjects.elevator1.Elevator;

public class FloorState implements State{

    private final Elevator elevator;

    public FloorState(Elevator elevator) {
        this.elevator = elevator;
    }

    @Override
    public void openDoor() {
        this.elevator.changeState(StateName.OPEN_DOOR);
    }

    @Override
    public void closeDoor() {
        throw new IllegalStateException();
    }

    @Override
    public void goToFloor(int floorNum) {
        // go to the floor
        this.elevator.changeState(StateName.TRANSIT);
        // after reaching the floor change the state again.
        this.elevator.setCurrentFloor(floorNum);
        this.elevator.changeState(StateName.FLOOR);
    }

    @Override
    public StateName getStateName() {
        return null;
    }
}
