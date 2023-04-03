package domain_models;

import jakarta.persistence.*;

@Entity
@IdClass(HoaDonChiTietPK.class)
public class HoaDonChiTiet {
    private Object idHoaDon;
    private Object idChiTietSp;
    private Integer soLuong;
    private Integer donGia;
    private HoaDon hoaDonByIdHoaDon;
    private ChiTietSp chiTietSpByIdChiTietSp;

    @Id
    @Column(name = "IdHoaDon")
    public Object getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(Object idHoaDon) {
        this.idHoaDon = idHoaDon;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HoaDonChiTiet that = (HoaDonChiTiet) o;

        if (idHoaDon != null ? !idHoaDon.equals(that.idHoaDon) : that.idHoaDon != null) return false;
        if (idChiTietSp != null ? !idChiTietSp.equals(that.idChiTietSp) : that.idChiTietSp != null) return false;
        if (soLuong != null ? !soLuong.equals(that.soLuong) : that.soLuong != null) return false;
        if (donGia != null ? !donGia.equals(that.donGia) : that.donGia != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idHoaDon != null ? idHoaDon.hashCode() : 0;
        result = 31 * result + (idChiTietSp != null ? idChiTietSp.hashCode() : 0);
        result = 31 * result + (soLuong != null ? soLuong.hashCode() : 0);
        result = 31 * result + (donGia != null ? donGia.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "IdHoaDon", referencedColumnName = "Id", nullable = false)
    public HoaDon getHoaDonByIdHoaDon() {
        return hoaDonByIdHoaDon;
    }

    public void setHoaDonByIdHoaDon(HoaDon hoaDonByIdHoaDon) {
        this.hoaDonByIdHoaDon = hoaDonByIdHoaDon;
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
