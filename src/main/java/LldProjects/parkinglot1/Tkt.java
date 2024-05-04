package LldProjects.parkinglot1;

public class Tkt {
    private final int num;
    private final Integer vehicleNum;
    private final Type vehicleType;
    private Integer inTime;
    private boolean paid;
    private Integer amount;

    public Tkt(int num, Integer vehicleNum, Type vehicleType) {
        this.num = num;
        this.vehicleNum = vehicleNum;
        this.vehicleType = vehicleType;
    }

    public int getNum() {
        return num;
    }

    public Integer getInTime() {
        return inTime;
    }

    public void setInTime(Integer inTime) {
        this.inTime = inTime;
    }

    public Integer getVehicleNum() {
        return vehicleNum;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Type getVehicleType() {
        return vehicleType;
    }

}
