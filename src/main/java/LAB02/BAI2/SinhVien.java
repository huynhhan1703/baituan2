/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB02.BAI2;

/**
 *
 * @author HUYNH ANH
 */
public abstract class SinhVien {

    private String hoten;
    private String nghanh;

    public SinhVien(String hoten, String nghanh) {
        this.hoten = hoten;
        this.nghanh = nghanh;
    }

    public String getHoten() {
        return hoten;
    }

    public String getNghanh() {
        return nghanh;
    }

    abstract double getDiem();

    public  String getHocLuc() {
        String kq = "";
        double dtb = getDiem();
        if (dtb < 5) {
            kq = "yeu";
        } else if (dtb < 6.5) {
            kq = "trung binh";

        } else if (dtb < 7.5) {
            kq = "kha";

        } else if (dtb < 9) {
            kq = "gioi";

        } else {
            kq = "xuat sac";
        }
        return kq;
    }

    public void xuat() {
        System.out.println("ho ten :" + getHoten() + "nghanh" + getNghanh() + "diem" + getDiem() + "hoc luc" + getHocLuc());
    }
}
