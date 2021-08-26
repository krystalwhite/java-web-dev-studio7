package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        CD radiohead = new CD("Radiohead In Rainbows", 4.75, "silver", false, false, 500, 650, 20, "music");
        DVD blankDVD = new DVD("Sony Panasonic Philips Toshiba", 4.75, "silver", false, false, 630, 4700, 4700, "images");

        radiohead.storeData(15);
        radiohead.spinDisc();;
        radiohead.readData();
        radiohead.toString(); //is not printing the toString method???

        blankDVD.storeData(100);
        blankDVD.spinDisc();
        blankDVD.readData();
        blankDVD.toString(); //is not printing the toString method???
    }
}
