package com.company.game;

public class Goblin extends Enemy{

    public Goblin(){
        this.damage = 10;
        this.health = 80;
    }
    @Override
    public void Attack() {
        System.out.println("Goblin attacks with "+ damage + " damage");
    }
}
