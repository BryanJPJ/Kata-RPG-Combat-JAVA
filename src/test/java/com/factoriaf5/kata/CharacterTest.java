package com.factoriaf5.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CharacterTest {
    
    @Test
    public void damageTest () {
        Character d  = new Character ();
        int damagePoint = 1000;
        int result = d.damage(damagePoint);
        assertEquals(0, result);
    }
    @Test
    public void receivedDamageTest() {
        Character e = new Character();
        int currentHealth = 0 ;
        boolean result = e.receivedDamage(currentHealth);
        assertEquals(false, result);
    }
    @Test
    public void healCharacterTest(){
        Character f = new Character();
        int currentHealth = 50;
        int result = f.healCharacter(currentHealth);
        assertEquals(150, result);
    }
    @Test
    public void healCharacterDeathTest(){
        Character f = new Character();
        int currentHealth = 0;
        int result = f.healCharacter(currentHealth);
        assertEquals(0, result);
    }


}
