package LldProjects.parkinglot1;

public class Slot {
    public Slot(int number, boolean occupied, Type type) {
        this.number = number;
        this.occupied = occupied;
        this.type = type;
    }
    private final int number;
    private boolean occupied;
    private Integer vehicleNum;
    private final Type type;

    public int getNumber() {
        return number;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public Type getType() {
        return type;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public void setVehicleNum(Integer vehicleNum) {
        this.vehicleNum = vehicleNum;
    }

    public Integer getVehicleNum() {
        return vehicleNum;
    }

}
