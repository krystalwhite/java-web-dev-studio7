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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
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
