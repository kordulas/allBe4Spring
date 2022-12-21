package com.company;

public class Car {

    private double fuelLvl;
    private boolean engineOk;
    private boolean fuelFlapOpen;
    private boolean doorsAndTrunkOpen;
    private boolean engineOn;

    public static final int OK = 100;
    public static final int ERROR_CHECK_ENGINE = 200;
    public static final int ERROR_NO_FUEL = 300;
    public static final int WARNING_FUEL_FLAP_OPEN= 400;
    public static final int WARNING_DOORS_OPEN = 500;

    public Car(double fuelLvl, boolean engineOk, boolean fuelFlapOpen, boolean doorsAndTrunkOpen, boolean engineOn) {
        this.fuelLvl = fuelLvl;
        this.engineOk = engineOk;
        this.fuelFlapOpen = fuelFlapOpen;
        this.doorsAndTrunkOpen = doorsAndTrunkOpen;
        this.engineOn = engineOn;
    }

    public double getFuelLvl() {
        return fuelLvl;
    }

    public void setFuelLvl(double fuelLvl) {
        if (fuelLvl <= 0)
            engineOn = false;
        this.fuelLvl = fuelLvl;
    }

    public boolean isEngineOk() {
        return engineOk;
    }

    public void setEngineOk(boolean engineOk) {
        if (!engineOk)
            engineOn = false;
        this.engineOk = engineOk;
    }

    public boolean isFuelFlapOpen() {
        return fuelFlapOpen;
    }

    public void setFuelFlapOpen(boolean fuelFlapOpen) {
        this.fuelFlapOpen = fuelFlapOpen;
    }

    public boolean isDoorsAndTrunkOpen() {
        return doorsAndTrunkOpen;
    }

    public void setDoorsAndTrunkOpen(boolean doorsAndTrunkOpen) {
        this.doorsAndTrunkOpen = doorsAndTrunkOpen;
    }

    public boolean isEngineOn() {
        return engineOn;
    }

    public void setEngineOn(boolean engineOn) {
        int systemCheck = systemCheck();
        if (systemCheck == ERROR_CHECK_ENGINE || systemCheck == ERROR_NO_FUEL)
            this.engineOn = false;
        else
            this.engineOn = engineOn;
    }


    int start() {
        int systemCheck = systemCheck();
        setEngineOn(true);
        return systemCheck;
    }
    private int systemCheck() {
        if (!engineOk)
            return ERROR_CHECK_ENGINE;
        if (fuelLvl == 0)
            return ERROR_NO_FUEL;
        if (fuelFlapOpen)
            return WARNING_FUEL_FLAP_OPEN;
        if (doorsAndTrunkOpen)
            return WARNING_DOORS_OPEN;
        return OK;
    }
    String status() {
        if (systemCheck() == OK)
            return "Wszystkie systemy sprawne, możesz wyruszyć w bezpieczną podróż";
        String status = "Status samochodu: \n";
        if (!engineOk)
            status += " > Silnik uszkodzony\n";
        if (fuelLvl == 0)
            status += " > Brak paliwa\n";
        if (fuelFlapOpen)
            status += " > Zamknij wlew paliwa\n";
        if (doorsAndTrunkOpen)
            status += " > Drzwi lub bagażnik są otwarte\n";
        if (engineOn)
            status += " > Silnik włączony";
        else
            status += " > Silnik wyłączony";
        return status;
    }
}
