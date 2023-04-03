package domain_models;

import jakarta.persistence.*;

@Entity
@IdClass(GioHangChiTietPK.class)
public class GioHangChiTiet {
    private Object idGioHang;
    private Object idChiTietSp;
    private Integer soLuong;
    private Integer donGia;
    private Integer donGiaKhiGiam;
    private GioHang gioHangByIdGioHang;
    private ChiTietSp chiTietSpByIdChiTietSp;

    @Id
    @Column(name = "IdGioHang")
    public Object getIdGioHang() {
        return idGioHang;
    }

    public void setIdGioHang(Object idGioHang) {
        this.idGioHang = idGioHang;
    }

    @Id
    @Column(name = "IdChiTietSP")
    public Object getIdChiTietSp() {
        return idChiTietSp;
    }

    public void setIdChiTietSp(Object idChiTietSp) {
        this.idChiTietSp = idChiTietSp;
    }

    @Basic
    @Column(name = "SoLuong")
    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    @Basic
    @Column(name = "DonGia")
    public Integer getDonGia() {
        return donGia;
    }

    public void setDonGia(Integer donGia) {
        this.donGia = donGia;
    }

    @Basic
    @Column(name = "DonGiaKhiGiam")
    public Integer getDonGiaKhiGiam() {
        return donGiaKhiGiam;
    }

    public void setDonGiaKhiGiam(Integer donGiaKhiGiam) {
        this.donGiaKhiGiam = donGiaKhiGiam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GioHangChiTiet that = (GioHangChiTiet) o;

        if (idGioHang != null ? !idGioHang.equals(that.idGioHang) : that.idGioHang != null) return false;
        if (idChiTietSp != null ? !idChiTietSp.equals(that.idChiTietSp) : that.idChiTietSp != null) return false;
        if (soLuong != null ? !soLuong.equals(that.soLuong) : that.soLuong != null) return false;
        if (donGia != null ? !donGia.equals(that.donGia) : that.donGia != null) return false;
        if (donGiaKhiGiam != null ? !donGiaKhiGiam.equals(that.donGiaKhiGiam) : that.donGiaKhiGiam != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idGioHang != null ? idGioHang.hashCode() : 0;
        result = 31 * result + (idChiTietSp != null ? idChiTietSp.hashCode() : 0);
        result = 31 * result + (soLuong != null ? soLuong.hashCode() : 0);
        result = 31 * result + (donGia != null ? donGia.hashCode() : 0);
        result = 31 * result + (donGiaKhiGiam != null ? donGiaKhiGiam.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "IdGioHang", referencedColumnName = "Id", nullable = false)
    public GioHang getGioHangByIdGioHang() {
        return gioHangByIdGioHang;
    }

    public void setGioHangByIdGioHang(GioHang gioHangByIdGioHang) {
        this.gioHangByIdGioHang = gioHangByIdGioHang;
    }

    @ManyToOne
    @JoinColumn(name = "IdChiTietSP", referencedColumnName = "Id", nullable = false)
    public ChiTietSp getChiTietSpByIdChiTietSp() {
        return chiTietSpByIdChiTietSp;
    }

    public void setChiTietSpByIdChiTietSp(ChiTietSp chiTietSpByIdChiTietSp) {
        this.chiTietSpByIdChiTietSp = chiTietSpByIdChiTietSp;
    }
}
