package LldProjects.elevator1.states;

import LldProjects.elevator1.Elevator;

public class TransitionState implements State{
    private final Elevator elevator;

    public TransitionState(Elevator elevator) {
        this.elevator = elevator;
    }

    @Override
    public void openDoor() {
        throw new IllegalStateException();
    }

    @Override
    public void closeDoor() {
        throw new IllegalStateException();
    }

    @Override
    public void goToFloor(int floorNum) {
        throw new IllegalStateException();
    }

    @Override
    public StateName getStateName() {
        return null;
    }
}
