/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg2022431617.latihan53.rabbit;

/**
 *
 * @author
 * Nama : AMBROSIUS PETI
 * Kelas : S112B - PBO
 * NIM : 2022431617
 */

public class Animal  {
      protected boolean vegetarian;
    protected String eats;
    protected int noOfLegs;
    
    public Animal(boolean vegetarian, String food, int legs) {
        this.vegetarian = vegetarian;
        this.eats = food;
        this.noOfLegs = legs;
    }
    public boolean isVegetarian() {
        return vegetarian;
    }
    public String getEats() {
        return eats;
    }
    public int getNoOfLegs() {
        return noOfLegs;
    }
   
    
    
}
