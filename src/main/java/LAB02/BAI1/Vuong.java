/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB02.BAI1;

/**
 *
 * @author HUYNH ANH
 */
public class Vuong extends ChuNhat{

    public Vuong(double canh) {
        super(canh,canh);
        double rong = canh;
    }


   
    @Override
     public void xuat() {
        System.out.println( "canh"+rong+ "chu vi+" + getChuVi() + "dien tich" + getDienTich() );
    }
}
