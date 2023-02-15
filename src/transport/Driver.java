package transport;

public abstract class Driver {
    private final String fIO;
    private String driverLicenseOnOff;
    private int experience;

    public Driver(String fIO, String driverLicenseOnOff, int experience) {
        this.fIO = fIO;
        this.driverLicenseOnOff = driverLicenseOnOff;
        this.experience = experience;
    }

    public String getFIO() {
        return fIO;
    }

    public String getDriverLicenseOnOff() {
        return driverLicenseOnOff;
    }
    public void setDriverLicenseOnOff(String driverLicenseOnOff) {
        this.driverLicenseOnOff = driverLicenseOnOff;
    }

    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }


    abstract void gou();
    abstract void stop();
    abstract void refuel();


    @Override
    public String toString() {
        return  "ФИО водителя = " + fIO  + ";" +
                " наличие вод. удостоверения = " + driverLicenseOnOff + ";" +
                " стаж вождения = " + experience + " лет" + "\n";
    }
}
