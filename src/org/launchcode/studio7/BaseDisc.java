package org.launchcode.studio7;

public abstract class BaseDisc {
    private String name;
    private double diameter;
    private String color;
    private boolean isEdible;
    private boolean isNormallyThrown;

    public BaseDisc(String name, double diameter, String color, boolean isEdible, boolean isNormallyThrown) {
        this.name = name;
        this.diameter = diameter;
        this.color = color;
        this.isEdible = isEdible;
        this.isNormallyThrown = isNormallyThrown;
    }

    @Override
    public String toString() {
        String output = "The " + this.name + " disc is " + this.color + " with a diameter of " + this.diameter + ".";
        return output;
    }
}
