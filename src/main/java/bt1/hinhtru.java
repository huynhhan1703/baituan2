/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt1;

/**
 *
 * @author ADMIN
 */
public class hinhtru extends hinhtron {

    private double chieudai;

    public hinhtru() {
        super();
        chieudai = 1;
    }

    public hinhtru(double bankinh, double chieudai) {
        super(bankinh);
        this.chieudai = chieudai;
    }

    public double getChieudai() {
        return chieudai;
    }

    public void setChieudai(double chieudai) {
        this.chieudai = chieudai;
    }

    @Override
    public double tinhDienTich() {
        return 2 * super.tinhDienTich() + tinhChuVi() * chieudai;

    }

    public double tinhTheTich() {
        return super.tinhDienTich()*chieudai;
    }

   @Override
    public String toString() {
        return "hinhtron{" + " --ban kinh: " + super.getBankinh()+" --chieu cao: "+chieudai + " --dien tich: "+tinhDienTich()+" --the tich: "+tinhTheTich()+'}';
    }
    
}
