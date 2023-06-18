package org.oop.fourthTask;
public class Main {
    public static void main(String args[]) {

        Guitarist ritchie = new Guitarist("Ричард");
        Keyboardist john = new Keyboardist("Джон");
        Musician david = new Musician("Давид");

        Musician[] musicians = {ritchie, john, david};

        for (Musician m : musicians){
            m.play();
        }
    }
}
