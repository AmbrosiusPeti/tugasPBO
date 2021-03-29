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
 * Kelas : FS112B - PBO 
 * NIM : 2022431617
 */

public class rabbits extends Animal {
    
  private String color;
    private String name;

    public rabbits(String name, boolean veg, String food, int legs, String color) {
        super(veg, food, legs);
        this.name = name;
        this.vegetarian = veg;
        this.eats = food;
        this.noOfLegs = legs;
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public String getName() {
        return name;
    }
    
}
