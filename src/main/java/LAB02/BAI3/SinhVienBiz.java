/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB02.BAI3;

/**
 *
 * @author HUYNH ANH
 */
public class SinhVienBiz extends SinhVien{
    private double diemMarketing;
    private double diemSales;

    public SinhVienBiz(double diemMarketing, double diemSales, String hoten, String nghanh) {
        super(hoten, nghanh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }
@Override
  double getDiem(){
      return (2*diemMarketing+diemSales)/2 ;
    }
    
}
 