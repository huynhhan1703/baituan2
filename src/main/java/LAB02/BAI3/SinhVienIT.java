/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB02.BAI3;

/**
 *
 * @author HUYNH ANH
 */
public class SinhVienIT extends SinhVien{
    private double diemJava;
    private double diemCss;
    private double diemHtml;

    public SinhVienIT(double diemJava, double diemCss, double diemHtml, String hoten, String nghanh) {
        super(hoten, nghanh);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

    
@Override
  double getDiem(){
      return (2*diemJava+diemCss+diemHtml)/4  ;
    }
    
}
