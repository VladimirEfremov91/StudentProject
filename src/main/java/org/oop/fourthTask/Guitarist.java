package org.oop.fourthTask;

class Guitarist extends Musician {

    public Guitarist(String name) {
        super(name);
    }

    @Override
    public void play(){
        System.out.println(this.name + " играет на гитаре.");
    }
}