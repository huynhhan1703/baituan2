/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB02.BAI1;

/**
 *
 * @author HUYNH ANH
 */
public class ChuNhat {

    public double rong;
    public double dai;

    public ChuNhat(double rong, double dai) {
        this.rong = rong;
        this.dai = dai;
    }
 
    public double getChuVi() {
        return (dai + rong) * 2;
    }

    public double getDienTich() {
        return dai * rong;
    }

    public void xuat() {
        System.out.println("dai" + dai + "rong" + rong + "chu vi+" + getChuVi() + "dien tich" + getDienTich() );
    }
}
