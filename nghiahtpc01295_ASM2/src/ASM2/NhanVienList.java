/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM2;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class NhanVienList {
    ArrayList<NhanVien> dsnv = new ArrayList<NhanVien>();
    public void them (NhanVien nv){
        dsnv.add(nv);
    }
    
}
