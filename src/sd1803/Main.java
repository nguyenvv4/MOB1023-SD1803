/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sd1803;

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
        Scanner sc = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("Nhap thong tin danh sach nhan vien");
        System.out.println("1. Nhap thong tin danh sach");
        System.out.println("2. In thong tin");
        int chon;
        QuanLyNhanVien quanLyNhanVien = new QuanLyNhanVien();
        do {
            System.out.println("Moi ban chon ");
             chon = sc.nextInt();

            switch (chon) {
                case 1:
                    quanLyNhanVien.nhapThongTin();
                    break;
                case 2:
                    quanLyNhanVien.inThongTin();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Ban da chon sai");
            }

        } while (chon != 0);

    }
}
