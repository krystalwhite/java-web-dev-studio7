package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {
    private double spinsPerMinute;
    private double storageCapacity;
    private double availableStorageRemaining;
    private String formatStoredOnDisc;

    public DVD(String name, double diameter, String color, boolean isEdible, boolean isNormallyThrown){
        super(name, diameter, color, isEdible, isNormallyThrown);
    }

    public DVD(String name, double diameter, String color, boolean isEdible, boolean isNormallyThrown, double spinsPerMinute, double storageCapacity, double availableStorageRemaining, String formatStoredOnDisc) {
        super(name, diameter, color, isEdible, isNormallyThrown);
        this.spinsPerMinute = spinsPerMinute;
        this.storageCapacity = storageCapacity;
        this.availableStorageRemaining = availableStorageRemaining;
        this.formatStoredOnDisc = formatStoredOnDisc;
    }

    @Override
    public void spinDisc() {
        System.out.println("The user entered the " + getName() + " DVD into the player and it spins at " + this.spinsPerMinute + " rotations per minute." );
    }

    @Override
    public void readData() {
        System.out.println("The " + getName() + " DVD outputs " + this.formatStoredOnDisc + ".");
    }

    @Override
    public void storeData(double dataAmount) {
        if (this.availableStorageRemaining == this.storageCapacity) {
            this.availableStorageRemaining = this.storageCapacity - dataAmount;
        } else {
            this.availableStorageRemaining -= dataAmount;
        }

        System.out.println("The DVD stored " + dataAmount + " MB of data and has " + this.availableStorageRemaining + " MB of storage remaining.");
    }

    public double getSpinsPerMinute() {
        return spinsPerMinute;
    }

    public void setSpinsPerMinute(double spinsPerMinute) {
        this.spinsPerMinute = spinsPerMinute;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public double getAvailableStorageRemaining() {
        return availableStorageRemaining;
    }

    public void setAvailableStorageRemaining(double availableStorageRemaining) {
        this.availableStorageRemaining = availableStorageRemaining;
    }

    public String getFormatStoredOnDisc() {
        return formatStoredOnDisc;
    }

    public void setFormatStoredOnDisc(String formatStoredOnDisc) {
        this.formatStoredOnDisc = formatStoredOnDisc;
    }


}
