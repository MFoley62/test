package com.company.game;

public class Game {
    public static void main(String[] args) {
        Enemy zombi = new Zombi();
        Enemy goblin = new Goblin();
        goblin.Attack();
        zombi.Attack();

        zombi.TakeDamage(5);
        zombi.TakeDamage(15);
        zombi.TakeDamage(10);
    }
}
