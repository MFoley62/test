package com.company.game;

public  abstract class Enemy {

    int health;
    int damage;

    public abstract void Attack();

    public void TakeDamage(int damage){
        health = health - damage;
        System.out.println("Enemy damage : " + damage);
        System.out.println("Enemy health : " + health);
        if(health <= 0)
        {
            System.out.println("Enemy has ben killed.");
        }
    }
}
