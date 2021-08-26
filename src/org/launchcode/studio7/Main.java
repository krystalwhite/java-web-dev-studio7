package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.

        CD radiohead = new CD("Radiohead In Rainbows", 4.75, "silver", false, false, 1.2, 650, 20, "music");

        radiohead.storeData(15);
        radiohead.spinDisc();;
        radiohead.readData();
        radiohead.toString(); //is not printing the toString method???


        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
