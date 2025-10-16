

package com.mycompany.lab7;

class SinhVienIT extends SinhVienPoly {
    
    double java;
    double html;
    double css;

    
    public SinhVienIT(String hoTen, double java, double html, double css) {
        super(hoTen, "IT");
        this.java = java;
        this.html = html;
        this.css = css;
    }

    
    @Override
    public double getDiem() {
        return (2 * java + html + css) / 4;
    }
}
class SinhVienBiz extends SinhVienPoly {
    double diemMarketing, diemSales;

    public SinhVienBiz(String hoTen, double diemMarketing, double diemSales) {
        super(hoTen, "Biz");
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    @Override
    public double getDiem() {
        return (2 * diemMarketing + diemSales) / 3;
    }
}
