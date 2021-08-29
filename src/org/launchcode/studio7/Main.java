package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        CD radiohead = new CD("Radiohead In Rainbows", 4.75, "rainbow", false, false, 500, 650, 20, "music");
        DVD blankDVD = new DVD("Sony Panasonic Philips Toshiba", 4.75, "silver", false, false, 630, 4700, 4700, "images");
        Frisbee classicFrisbee = new Frisbee("Wham-O Pro", 10, "white", false, true);
        WheelOfCheese gouda = new WheelOfCheese("Gouda", 2, "yellow", true, false);

        radiohead.storeData(15);
        radiohead.spinDisc();;
        radiohead.readData();
        System.out.println(radiohead.toString());

        blankDVD.storeData(100);
        blankDVD.spinDisc();
        blankDVD.readData();
        System.out.println(blankDVD.toString());

        classicFrisbee.spinDisc();
        System.out.println(classicFrisbee.toString());

        gouda.melts();
        System.out.println(gouda.toString());
    }
}
