package LldProjects.elevator1.states;

import LldProjects.elevator1.Elevator;

public class DoorOpenState implements State{

    private final Elevator elevator;

    public DoorOpenState(Elevator elevator) {
        this.elevator = elevator;
    }

    @Override
    public void openDoor() {
        throw new IllegalStateException();
    }

    @Override
    public void closeDoor() {
        this.elevator.changeState(StateName.FLOOR);
    }

    @Override
    public void goToFloor(int floorNum) {
        throw new IllegalStateException();
    }

    @Override
    public StateName getStateName() {
        return StateName.OPEN_DOOR;
    }

}
