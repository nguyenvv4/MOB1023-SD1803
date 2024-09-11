/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd1803.service;

import java.util.ArrayList;
import java.util.Scanner;
import sd1803.model.NhanVien;

/**
 *
 * @author nguyenvv
 */
public class QuanLyNhanVien {

    ArrayList<NhanVien> dsNhanVien = new ArrayList<>();

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id: ");
        String id = sc.nextLine();
        System.out.println("Nhap ten: ");
        String name = sc.nextLine();
        NhanVien nhanVien = new NhanVien(id, name);
        dsNhanVien.add(nhanVien);
    }

    public void inThongTin() {
        for (int i = 0; i < dsNhanVien.size(); i++) {
            System.out.println(dsNhanVien.get(i).getId() +" -- "+dsNhanVien.get(i).getName());
        }
    }

}
