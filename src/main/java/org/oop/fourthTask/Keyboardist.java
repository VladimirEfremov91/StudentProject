package org.oop.fourthTask;

class Keyboardist extends Musician {
    public Keyboardist(String name) {
        super(name);
    }

    @Override
    public void play(){
        System.out.println(this.name + " играет на фортепиано.");
    }
}
