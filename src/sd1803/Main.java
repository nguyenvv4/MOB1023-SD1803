/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sd1803;

import java.util.ArrayList;
import java.util.Scanner;
import sd1803.model.NhanVien;
import sd1803.service.QuanLyNhanVien;

/**
 *
 * @author nguyenvv
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Nhap va in thong tin nhan vien
        // Nhan vien: id, hoten, dia chi
        // 1 hien thi 1 danh sach nhan vien
        // 2 nhap thong tin nhan vien
        // 3 xoa 1 nhan vien
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Hien thi thong tin");
        System.out.println("2. Nhap nhan vien");
        System.out.println("3. Xoa nhan vien theo ma");
        System.out.println("4. Tim kiem theo ten");
        System.out.println("0. Thoat");

        QuanLyNhanVien quanLyNhanVien = new QuanLyNhanVien();
        int chon;
        do {
            System.out.println("Moi ban chon");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1:
                    // hien thi thong tin
                    ArrayList<NhanVien> danhSachNhanVien = quanLyNhanVien.getDanhSach();
                    hienThi(danhSachNhanVien);
                    break;
                case 2:
                    // nhap nhan vienq
                    quanLyNhanVien.nhapThongTin();
                    break;
                case 3:
                    // Tìm kiếm nhân viên có dia cho ở Ha Noi
                    quanLyNhanVien.timKiemTheoDiaChi();
                    break;
                case 4:
                    // tim kiem nhan vien theo ten duoc nhap tu ban phim
                    System.out.println("Nhap ten can tim");
                    String name = sc.nextLine();
                    ArrayList<NhanVien> kqTimKiem = quanLyNhanVien.timKiemTheoTen(name);
                    hienThi(kqTimKiem);
                    break;
                case 5:
                    System.out.println("Nhap id can xoa: ");
                    String id = sc.nextLine();
                    quanLyNhanVien.xoa(id);
                case 0:
                    // thoat chuong trinh
                    break;
                default:
                    System.out.println("Ban da nhap sai");
                    break;
            }
        } while (chon != 0);
    }

    public static void hienThi(ArrayList<NhanVien> danhSachNhanVien) {
        for (NhanVien nv : danhSachNhanVien) {
            System.out.println("Id la: " + nv.getId());
            System.out.println("Ho ten la: " + nv.getHoTen());
            System.out.println("Dia chi la: " + nv.getDiaChi());
            System.out.println("=======");
        }
    }
}
