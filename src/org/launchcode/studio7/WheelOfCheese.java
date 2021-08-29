package org.launchcode.studio7;

public class WheelOfCheese extends BaseDisc {

    public WheelOfCheese(String name, double diameter, String color, boolean isEdible, boolean isNormallyThrown) {
        super(name, diameter, color, isEdible, isNormallyThrown);
    }

    public void melts() {
        System.out.println("Tastes so gouda!");
    }
}
