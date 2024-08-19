/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bt1;

import java.util.Scanner;
import javax.imageio.ImageIO;

/**
 *
 * @author ADMIN
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        hinhtron htron;

        System.out.println("===hinh tron===");
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ban kinh: ");
        double r1 = sc.nextDouble();
        htron = new hinhtron(r1);
        System.out.println(htron);

        hinhtron htru;

        System.out.println(" ===hinh tru===");
        System.out.print("nhap ban kinh: ");
        double r2 = sc.nextDouble();
        System.out.print("nhap chieu cao: ");
        double cao = sc.nextDouble();
        htru = new hinhtru(r2, cao);
        System.out.println(htru);

    }

}
