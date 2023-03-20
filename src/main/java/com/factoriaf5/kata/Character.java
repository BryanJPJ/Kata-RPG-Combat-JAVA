package com.factoriaf5.kata;

public class Character {

    private int health = 1000;
    private int level = 1;
    private boolean alive = true;
    public int currentHealth = damage(health);

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public int damage(int damagePoint) {
        return health - damagePoint;
    }

    public boolean receivedDamage(int currentHealth) {
        if (currentHealth == 0) {
            alive = false;
        }
        return alive;
    }

    public int healCharacter(int currentHealth) {
        if (currentHealth <= 1000 && currentHealth != 0) {
            currentHealth = currentHealth + 100;
        } else if (currentHealth == 0) {
            return currentHealth = 0;
        }
        return currentHealth;
    }
    

}
