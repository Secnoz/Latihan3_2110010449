/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri;

public class Lingkaran {
    private double radius;

    public Lingkaran(double radius) {
        this.radius = radius;
    }

    public double luas1() {
        return Math.PI * radius * radius;
    }

    public double keliling1() {
        return 2 * Math.PI * radius;
    }
}
