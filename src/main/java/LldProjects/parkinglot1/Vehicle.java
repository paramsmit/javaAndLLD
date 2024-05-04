package LldProjects.parkinglot1;

import LldProjects.parkinglot1.Type;

public class Vehicle {
    private final Type type;
    private final int num;
    private Integer slotNum;
    private Integer tktNum;

    public Vehicle(Type type, int num) {
        this.type = type;
        this.num = num;
    }

    public Type getType() {
        return type;
    }
    public int getNum() {
        return num;
    }
    public Integer getSlotNum() {
        return slotNum;
    }
    public void setSlotNum(Integer slotNum) {
        this.slotNum = slotNum;
    }
    public Integer getTktNum() {
        return tktNum;
    }
    public void setTktNum(Integer tktNum) {
        this.tktNum = tktNum;
    }
}
