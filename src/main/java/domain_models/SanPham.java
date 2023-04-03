package domain_models;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class SanPham {
    private Object id;
    private String ma;
    private String ten;
    private Collection<ChiTietSp> chiTietSpsById;
    private Collection<ChiTietSp> chiTietSpsById_0;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SanPham sanPham = (SanPham) o;

        if (id != null ? !id.equals(sanPham.id) : sanPham.id != null) return false;
        if (ma != null ? !ma.equals(sanPham.ma) : sanPham.ma != null) return false;
        if (ten != null ? !ten.equals(sanPham.ten) : sanPham.ten != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (ma != null ? ma.hashCode() : 0);
        result = 31 * result + (ten != null ? ten.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "sanPhamByIdSp")
    public Collection<ChiTietSp> getChiTietSpsById() {
        return chiTietSpsById;
    }

    public void setChiTietSpsById(Collection<ChiTietSp> chiTietSpsById) {
        this.chiTietSpsById = chiTietSpsById;
    }

    @OneToMany(mappedBy = "sanPhamByIdSp_0")
    public Collection<ChiTietSp> getChiTietSpsById_0() {
        return chiTietSpsById_0;
    }

    public void setChiTietSpsById_0(Collection<ChiTietSp> chiTietSpsById_0) {
        this.chiTietSpsById_0 = chiTietSpsById_0;
    }
}
