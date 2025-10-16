package com.mycompany.lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class bai4 {

    static ArrayList<SinhVienPoly> danhSach = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Menu();
        sc.close();
    }

    public static void Menu() {
        int choice;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhap danh sach sinh vien");
            System.out.println("2. Xuat thong tin danh sach sinh vien");
            System.out.println("3. Xuat danh sach sinh vien co hoc luc Gioi");
            System.out.println("4. Sap xep danh sach sinh vien theo diem");
            System.out.println("5. Ket thuc");
            System.out.print("Chon chuc nang: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    Nhap();
                    break;
                case 2:
                    Xuat();
                    break;
                case 3:
                    SVGioi();
                    break;
                case 4:
                    SapXep();
                    System.out.println("Da sap xep danh sach sinh vien theo diem (giam dan).");
                    break;
                case 5:
                    System.out.println("Ket thuc chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }
        } while (choice != 5);
    }

    
    public static void Nhap() {
        System.out.print("Nhap so luong sinh vien can nhap: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap thong tin sinh vien thu " + (i + 1) + ":");
            System.out.print("Chon nganh (1. IT, 2. Biz): ");
            int chon = sc.nextInt();
            sc.nextLine(); 

            if (chon == 1) {
                System.out.print("Ho ten: ");
                String hoTen = sc.nextLine();
                System.out.print("Diem Java: ");
                double java = sc.nextDouble();
                System.out.print("Diem HTML: ");
                double html = sc.nextDouble();
                System.out.print("Diem CSS: ");
                double css = sc.nextDouble();
                sc.nextLine(); 
                danhSach.add(new SinhVienIT(hoTen, java, html, css));
            } else if (chon == 2) {
                System.out.print("Ho ten: ");
                String hoTen = sc.nextLine();
                System.out.print("Diem Marketing: ");
                double marketing = sc.nextDouble();
                System.out.print("Diem Sales: ");
                double sales = sc.nextDouble();
                sc.nextLine(); 
                danhSach.add(new SinhVienBiz(hoTen, marketing, sales));
            } else {
                System.out.println("Lua chon nganh khong hop le. Bo qua sinh vien thu " + (i + 1));
            }
        }
    }

    
    public static void Xuat() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach sinh vien trong.");
            return;
        }
        System.out.println("\n=== DANH SACH SINH VIEN ===");
        for (SinhVienPoly sv : danhSach) {
            sv.xuat();
            System.out.println("----------------------------");
        }
    }

    
    public static void SVGioi() {
        boolean found = false;
        System.out.println("\n=== DANH SACH SINH VIEN CO HOC LUC GIOI TRO LEN  ===");
        for (SinhVienPoly sv : danhSach) {
            String hocLuc = sv.getHocLuc();
            if ("Gioi".equals(hocLuc) || "Xuat Xac".equals(hocLuc)) {
                sv.xuat();
                System.out.println("----------------------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong co sinh vien nao co hoc luc Gioi.");
        }
    }

    
    public static void SapXep() {
        Collections.sort(danhSach, new Comparator<SinhVienPoly>() {
            @Override
            public int compare(SinhVienPoly sv1, SinhVienPoly sv2) {
                return Double.compare(sv2.getDiem(), sv1.getDiem());
            }
        });
    }
}
