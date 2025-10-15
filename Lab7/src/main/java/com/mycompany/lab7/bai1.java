

package com.mycompany.lab7;

import java.util.Scanner;
class ChuNhat {
    double rong;
    double dai;

    
    public ChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    
    public double getChuVi() {
        return 2 * (dai + rong);
    }
    
    
    public double getDienTich() {
        return dai * rong;
    }

    
    public void xuat() {
        System.out.println("=== HINH CHU NHAT ===");
        System.out.println("Chieu dai: " + dai);
        System.out.println("Chieu rong: " + rong);
        System.out.println("Dien tich: " + getDienTich());
        System.out.println("Chu vi: " + getChuVi());
    }
}
class Vuong extends ChuNhat {
    double canh;

    
    public Vuong(double canh) {
        super(canh, canh); // gọi hàm tạo ChuNhat với dai = rong = canh
        this.canh = canh;
    }

    
    @Override
    public void xuat() {
        System.out.println("=== HINH VUONG ===");
        System.out.println("Canh: " + canh);
        System.out.println("Dien tich: " + getDienTich());
        System.out.println("Chu vi: " + getChuVi());
    }
}


public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Nhap hinh chu nhat 1:");
        System.out.print("Nhap chieu dai: ");
        double dai1 = sc.nextDouble();
        System.out.print("Nhap chieu rong: ");
        double rong1 = sc.nextDouble();
        ChuNhat cn1 = new ChuNhat(dai1, rong1);

        
        System.out.println("\nNhap hinh chu nhat 2:");
        System.out.print("Nhap chieu dai: ");
        double dai2 = sc.nextDouble();
        System.out.print("Nhap chieu rong: ");
        double rong2 = sc.nextDouble();
        ChuNhat cn2 = new ChuNhat(dai2, rong2);

        
        System.out.println("\nNhap hinh vuong:");
        System.out.print("Nhap canh: ");
        double canh = sc.nextDouble();
        ChuNhat vuong = new Vuong(canh); 

        
        System.out.println("\n--- KET QUA ---");
        cn1.xuat();
        System.out.println();
        cn2.xuat();
        System.out.println();
        vuong.xuat();

        sc.close();
    }
}
