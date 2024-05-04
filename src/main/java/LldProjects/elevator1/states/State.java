package LldProjects.elevator1.states;


public interface State {
    void openDoor();
    void closeDoor();
    void goToFloor(int floorNum);
    StateName getStateName();

}
