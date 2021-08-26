package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc{
    private double spinsPerMinute;
    private double storageCapacity;
    private double availableStorageRemaining;
    private String formatStoredOnDisc;
    private String name;
    private double radius;
    private String color;
    private boolean isEdible;
    private boolean isNormallyThrown;


    public CD(String name, double radius, String color, boolean isEdible, boolean isNormallyThrown, double spinsPerMinute, double storageCapacity, double availableStorageRemaining, String formatStoredOnDisc) {
        super(name, radius, color, isEdible, isNormallyThrown);
        this.name = name;
        this.radius = radius;
        this.color = color;
        this.isEdible = isEdible;
        this.isNormallyThrown = isNormallyThrown;
        this.spinsPerMinute = spinsPerMinute;
        this.storageCapacity = storageCapacity;
        this.availableStorageRemaining = availableStorageRemaining;
        this.formatStoredOnDisc = formatStoredOnDisc;
    }

    @Override
    public void spinDisc() {
        System.out.println("The user entered the " + this.name + " CD into the player and it spins at " + this.spinsPerMinute + " rotations per minute." );
    }

    @Override
    public void readData() {
        System.out.println("The " + this.name + " CD outputs " + this.formatStoredOnDisc + ".");
    }

    @Override
    public void storeData(double dataAmount) {
        if (this.availableStorageRemaining == this.storageCapacity) {
            this.availableStorageRemaining = this.storageCapacity - dataAmount;
        } else {
            this.availableStorageRemaining -= dataAmount;
        }

        System.out.println("The CD stored " + dataAmount + " MB of data and has " + this.availableStorageRemaining + " MB of storage remaining.");
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isEdible() {
        return isEdible;
    }

    public void setEdible(boolean edible) {
        isEdible = edible;
    }

    public boolean isNormallyThrown() {
        return isNormallyThrown;
    }

    public void setNormallyThrown(boolean normallyThrown) {
        isNormallyThrown = normallyThrown;
    }
}
