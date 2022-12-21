package com.company;

public class Car {

    private final static String ErrorStart = "100 - Car Start";
    private final static String EngineError = "200 - Engine Error!";
    private final static String FuelTankError = "300 - Empty Fuel Tank!";
    private final static String FlapError = "400 - Fuel Flap Open!";
    private final static String DoorsError = "500 - Doors Are Open!";

    private double fuelLvl;
    private boolean engineOk;
    private boolean fuelFlapClose;
    private boolean doorsClosed;
    private boolean engineRunning;

    public double getFuelLvl() {
        return fuelLvl;
    }

    public void setFuelLvl(double fuelLvl) {
        if( fuelLvl==0)
            setEngineRunning(false);
        this.fuelLvl = fuelLvl;
    }

    public boolean isEngineOk() {
        if(engineOk != true)
            setEngineRunning(false);

        return engineOk;
    }

    public void setEngineOk(boolean engineOk) {
        this.engineOk = engineOk;
    }

    public boolean isFuelFlapClose() {
        return fuelFlapClose;
    }

    public void setFuelFlapClose(boolean fuelFlapClose) {
        this.fuelFlapClose = fuelFlapClose;
    }

    public boolean isDoorsClosed() {
        return doorsClosed;
    }

    public void setDoorsClosed(boolean doorsClosed) {
        this.doorsClosed = doorsClosed;
    }

    public boolean isEngineRunning() {
        if(engineOk != true)
            setEngineRunning(false);
        return engineRunning;
    }

    public void setEngineRunning(boolean engineRunning) {
        this.engineRunning = engineRunning;
    }

    public Car(double fuelLvl, boolean engineOk, boolean fuelFlapClose, boolean doorsClosed, boolean engineRunning) {
        this.fuelLvl = fuelLvl;
        this.engineOk = engineOk;
        this.fuelFlapClose = fuelFlapClose;
        this.doorsClosed = doorsClosed;
        this.engineRunning = engineRunning;
    }

    public String start(){
        if(fuelLvl ==0)
            return FuelTankError;
        else if(!engineOk)
            return EngineError;
        else if(!fuelFlapClose)
            return FlapError;
        else if(!doorsClosed)
            return DoorsError;
        else if(engineRunning){
        setEngineRunning(true);
            return ErrorStart;
        }
        else
            setEngineRunning(true);
            return "Silnik uruchomiony";
    }

    static public String status(Car car){
        if(car.isEngineOk() && car.isDoorsClosed() && !car.isEngineRunning()
        && car.isFuelFlapClose() && car.getFuelLvl()!=0)
            return "Wszystkie systemy sprawne, możesz wyruszyć w bezpieczną podróż";

        return car.start();
    }
}
