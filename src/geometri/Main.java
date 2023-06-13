/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Lingkaran lingkaran1 = new Lingkaran();
        //lingkaran1.Luas1() = 20.5;
        double radius = 5;
        double luas1 = lingkaran1.Luas1();
        double keliling2 = lingkaran1.keliling2();
        
        System.out.println("Luas Lingkaran : " + luas1);
        System.out.println("Keliling lingkaran :" + keliling2);
        
        
        double panjang = 5.0;
        double lebar = 3.0;

        PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);

        double luas = persegiPanjang.luas();
        double keliling = persegiPanjang.keliling();

        System.out.println("Luas Persegi Panjang: " + luas);
        System.out.println("Keliling Persegi Panjang: " + keliling);
    }
    
}
