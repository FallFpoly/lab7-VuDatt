
package com.mycompany.lab7;

import java.util.Scanner;


// Lớp trừu tượng SinhVienPoly
abstract class SinhVienPoly {
    String hoTen;
    String nganh;

    
    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    // Phương thức trừu tượng
    public abstract double getDiem();

    
    public String getHocLuc() {
        double diem = getDiem();
        if (diem < 5) {
            return "Yeu";
        } else if (diem < 6.5) {
            return "Trung Binh";
        } else if (diem < 7.5) {
            return "Kha";
        } else if (diem < 9) {
            return "Gioi";
        } else {
            return "Xuat Xac";
        }
    }
   
    
    public void xuat() {
        System.out.println("Ho Ten: " + hoTen);
        System.out.println("Nghanh: " + nganh);
        System.out.println("Diem: " + getDiem());
        System.out.println("Hoc Luc: " + getHocLuc());
    }
}

