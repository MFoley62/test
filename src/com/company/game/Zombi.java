package com.company.game;

public class Zombi extends Enemy{

    public Zombi(){
        this.damage = 5;
        this.health = 100;
    }
    @Override
    public void Attack() {
        System.out.println("Zombie attacks with " + damage + " damage");
    }
}
