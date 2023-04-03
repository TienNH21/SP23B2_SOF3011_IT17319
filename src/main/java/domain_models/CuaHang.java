package domain_models;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class CuaHang {
    private Object id;
    private String ma;
    private String ten;
    private String diaChi;
    private String thanhPho;
    private String quocGia;
    private Collection<NhanVien> nhanViensById;
    private Collection<NhanVien> nhanViensById_0;

    @Id
    @Column(name = "Id")
    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Ma")
    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    @Basic
    @Column(name = "Ten")
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Basic
    @Column(name = "DiaChi")
    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Basic
    @Column(name = "ThanhPho")
    public String getThanhPho() {
        return thanhPho;
    }

    public void setThanhPho(String thanhPho) {
        this.thanhPho = thanhPho;
    }

    @Basic
    @Column(name = "QuocGia")
    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }
}
