/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ASM2;
import java.io.Serializable;
public class NhanVien implements Serializable{
    public String maNV;
    public String HoTen;
    public double tuoi;
    public String email;
    public double luong;

   
    public NhanVien(String maNV, String HoTen, double tuoi, String email, double luong) {
        this.maNV = maNV;
        this.HoTen = HoTen;
        this.tuoi = tuoi;
        this.email = email;
        this.luong = luong;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public double getTuoi() {
        return tuoi;
    }

    public void setTuoi(double tuoi) {
        this.tuoi = tuoi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }



    public NhanVien() {
    
    }
    
}
