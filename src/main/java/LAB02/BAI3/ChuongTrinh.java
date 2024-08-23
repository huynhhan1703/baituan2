/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LAB02.BAI3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author HUYNH ANH
 */
public class ChuongTrinh {

    public static ArrayList<SinhVien> ds = new ArrayList<>();

    public static SinhVien sv = null;

    public static void main(String[] args) {
        ArrayList<SinhVien> ds = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println("===chuong trinh===");
            System.out.println("1. Nhap danh sach sinh vien: ");
            System.out.println("2. Xuat thong ti danh sach sinh vien: ");
            System.out.println("3. Xuat danh sach sinh vien co hoc luc gioi: ");
            System.out.println("4. Sap xep danh sac sinh vien theo diem: ");
            System.out.println("0. Thoat.");
            System.out.println("--Moi ban chon--");
            chon = sc.nextInt();
            if (chon != 0) {
                switch (chon) {
                    case 1:
                        nhapDS();
                        break;
                    case 2:
                        xuatDS();
                        break;
                    case 3:
                        xuatSVGioi();
                        break;
                    case 4:
                        sapXep();
                        break;
                    default:
                        System.out.println("Nhap sai nhap lai");
                        break;
                }
            }

        } while (chon != 5);

    }

    private static void nhapDS() {
        System.out.println("Thuc hien nhap:");
        String nghanh;
        int chon = 0;
        Scanner sc = new Scanner(System.in);

        String tieptuc;
        tieptuc = sc.nextLine();

        do {
            System.out.println("Cho biet loai sinh vien (IT:1,Biz:2): ");
            nghanh = sc.nextLine();
            if (nghanh.equalsIgnoreCase("IT")) {
                System.out.println("Cho biet ho ten: ");
                String hoten = sc.nextLine();
                System.out.println("Diem mon java: ");
                double diemJava = sc.nextDouble();
                System.out.println("Diem mon css: ");
                double diemCss = sc.nextDouble();
                System.out.println("Diem mon html: ");
                double diemHtml = sc.nextDouble();
                sv = new SinhVienIT(diemJava, diemCss, diemHtml, hoten, hoten);
                tieptuc = sc.nextLine();

            } else if (nghanh.equalsIgnoreCase("Biz")) {
                System.out.println("Cho biet ho ten: ");
                String hoten = sc.nextLine();
                System.out.println("Diem mon marketing: ");
                double diemMarketing = sc.nextDouble();
                System.out.println("Diem mon sales: ");
                double diemSales = sc.nextDouble();
                sv = new SinhVienBiz(diemMarketing, diemSales, hoten, hoten);
            }
            if (sv != null) {
                ds.add(sv);
            }

        } while (!tieptuc.equalsIgnoreCase(tieptuc));
        System.out.println("tiep khong");

    }

    private static void xuatDS() {

        System.out.println("Thuc hien hien xuat toan bo danh sach sinh vien: ");
        for (SinhVien sv : ds) {
            sv.xuat();
        }
    }

    private static void xuatSVGioi() {
        System.out.println("thuc hien xuat sinh vien hoc luc gioi: ");
        for (SinhVien sv : ds) {
            if (sv.getDiem() >= 7.5 && sv.getDiem() < 9) {
                sv.xuat();
            }
        }
    }

    private static void sapXep() {
        System.out.println("thuc hien sap xep: ");

        Comparator<SinhVien> cmp = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                return Double.compare(sv1.getDiem(), sv2.getDiem());
            }
        };

        Collections.sort(ds, cmp);
        sv.xuat();
    }
}
