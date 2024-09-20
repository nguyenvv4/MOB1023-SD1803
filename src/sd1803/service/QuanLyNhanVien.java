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

    ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();

    public QuanLyNhanVien() {
        danhSachNhanVien.add(new NhanVien("NV1", "Nguyen Van A", "Ha Noi"));
        danhSachNhanVien.add(new NhanVien("NV2", "Nguyen Van A", "Ha Noi"));
        danhSachNhanVien.add(new NhanVien("NV3", "Nguyen Van A", "Ha Noi"));
        danhSachNhanVien.add(new NhanVien("NV4", "Nguyen Van A", "Ha Noi"));
        danhSachNhanVien.add(new NhanVien("NV5", "Nguyen Van A", "Ha Noi"));

    }

    public ArrayList<NhanVien> getDanhSach() {
        return danhSachNhanVien;
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Id :");
        String id = sc.nextLine();
        System.out.println("Nhap ho ten :");
        String hoTen = sc.nextLine();
        System.out.println("Nhap dia chi :");
        String diaChi = sc.nextLine();
        NhanVien nhanVien = new NhanVien(id, hoTen, diaChi);
        danhSachNhanVien.add(nhanVien);

    }

    public void timKiemTheoDiaChi() {
        for (NhanVien nhanVien : danhSachNhanVien) {
            if (nhanVien.getDiaChi().equals("Ha Noi")) {
                System.out.println("Id la: " + nhanVien.getId());
                System.out.println("Ho ten la: " + nhanVien.getHoTen());
                System.out.println("Dia chi la: " + nhanVien.getDiaChi());
            }
        }
    }

    public ArrayList<NhanVien> timKiemTheoTen(String name) {
        ArrayList<NhanVien> ketQua = new ArrayList<>();
        for (NhanVien nhanVien : danhSachNhanVien) {
            if (nhanVien.getHoTen().contains(name)) {
                ketQua.add(nhanVien);
            }
        }
        return ketQua;

    }

    public void xoa(String id) {
        Boolean check = false;
        NhanVien nhanVienTemp = new NhanVien();
        for (NhanVien nhanVien : danhSachNhanVien) {
            if (nhanVien.getId().equals(id)) {
                nhanVienTemp = nhanVien;
                check = true;
            }

        }
        if (check) {
            danhSachNhanVien.remove(nhanVienTemp);
            System.out.println("Xoa thanh cong");

        } else {
            System.out.println("Khong tim thay");
        }
    }

}
