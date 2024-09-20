/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sd1803.model;

/**
 *
 * @author nguyenvv
 */
public class NhanVien {

    private String id;

    private String hoTen;

    private String diaChi;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public NhanVien(String id, String hoTen, String diaChi) {
        this.id = id;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }

    public NhanVien() {
    }

}
