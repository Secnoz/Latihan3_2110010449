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
        double radius = 5.0;

        Lingkaran lingkaran = new Lingkaran(radius);

        double luas1 = lingkaran.luas1();
        double keliling1 = lingkaran.keliling1();

        System.out.println("Luas Lingkaran: " + luas1);
        System.out.println("Keliling Lingkaran: " + keliling1);
        
        
        double panjang = 5.0;
        double lebar = 3.0;

        PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);

        double luas = persegiPanjang.luas();
        double keliling = persegiPanjang.keliling();

        System.out.println("Luas Persegi Panjang: " + luas);
        System.out.println("Keliling Persegi Panjang: " + keliling);
    }
    
}
