package org.launchcode.studio7;

public class Frisbee extends BaseDisc implements AthleticDisc {


    public Frisbee(String name, double diameter, String color, boolean isEdible, boolean isNormallyThrown) {
        super(name, diameter, color, isEdible, isNormallyThrown);
    }

    @Override
    public void spinDisc() {
        System.out.println("Robby the Sea Lion throws the frisbee.");
    }
}
