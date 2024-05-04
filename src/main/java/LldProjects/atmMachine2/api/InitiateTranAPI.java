package LldProjects.atmMachine2.api;


import LldProjects.atmMachine2.ATM;

public class InitiateTranAPI {
    public String initiateTransaction(String machineId) {
        if (machineId == null || machineId.length() == 0)
            throw new IllegalArgumentException("machineId can't be null or empty");
        ATM atm = new ATM(machineId);
        return atm.init(machineId);
    }

}

