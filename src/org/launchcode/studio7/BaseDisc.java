package org.launchcode.studio7;

public abstract class BaseDisc {
    private String name;
    private double radius;
    private String color;
    private boolean isEdible;
    private boolean isNormallyThrown;

    public BaseDisc(String name, double radius, String color, boolean isEdible, boolean isNormallyThrown) {
        this.name = name;
        this.radius = radius;
        this.color = color;
        this.isEdible = isEdible;
        this.isNormallyThrown = isNormallyThrown;
    }

    @Override
    public String toString() {
        String output = "The " + this.name + " disc is " + this.color + " with a radius of " + this.radius + ".";
        return output;
    }
}
