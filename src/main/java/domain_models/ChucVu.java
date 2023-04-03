package domain_models;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

@Entity
public class ChucVu {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "Ma")
    private String ma;

    @Column(name = "Ten")
    private String ten;

    /*
     * (N+1) query problem: https://stackoverflow.com/a/39696775
     * ManyToMany: https://stackjava.com/hibernate/code-vi-du-hibernate-manytomany-quan-he-nhieu-nhieu.html
     * Eager/Lazy Loading:  https://stackjava.com/hibernate/hibernate-fetchtype-la-gi-phan-biet-fetchtype-lazy-voi-eager.html
     */
    @OneToMany(mappedBy = "cv", fetch = FetchType.EAGER)
    private List<NhanVien> listNhanVien;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public List<NhanVien> getListNhanVien() {
        return listNhanVien;
    }

    public void setListNhanVien(List<NhanVien> listNhanVien) {
        this.listNhanVien = listNhanVien;
    }

    public ChucVu() {
    }
}
