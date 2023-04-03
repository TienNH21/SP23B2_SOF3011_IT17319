package domain_models;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Collection;

@Entity
public class HoaDon {
    private Object id;
    private Object idKh;
    private Object idNv;
    private String ma;
    private Date ngayTao;
    private Date ngayThanhToan;
    private Date ngayShip;
    private Date ngayNhan;
    private Integer tinhTrang;
    private String tenNguoiNhan;
    private String diaChi;
    private String sdt;
    private KhachHang khachHangByIdKh;
    private KhachHang khachHangByIdKh_0;
    private NhanVien nhanVienByIdNv;
    private NhanVien nhanVienByIdNv_0;
    private Collection<HoaDonChiTiet> hoaDonChiTietsById;

    @Id
    @Column(name = "Id")
    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    @Basic
    @Column(name = "IdKH")
    public Object getIdKh() {
        return idKh;
    }

    public void setIdKh(Object idKh) {
        this.idKh = idKh;
    }

    @Basic
    @Column(name = "IdNV")
    public Object getIdNv() {
        return idNv;
    }

    public void setIdNv(Object idNv) {
        this.idNv = idNv;
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
    @Column(name = "NgayTao")
    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    @Basic
    @Column(name = "NgayThanhToan")
    public Date getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(Date ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    @Basic
    @Column(name = "NgayShip")
    public Date getNgayShip() {
        return ngayShip;
    }

    public void setNgayShip(Date ngayShip) {
        this.ngayShip = ngayShip;
    }

    @Basic
    @Column(name = "NgayNhan")
    public Date getNgayNhan() {
        return ngayNhan;
    }

    public void setNgayNhan(Date ngayNhan) {
        this.ngayNhan = ngayNhan;
    }

    @Basic
    @Column(name = "TinhTrang")
    public Integer getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(Integer tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    @Basic
    @Column(name = "TenNguoiNhan")
    public String getTenNguoiNhan() {
        return tenNguoiNhan;
    }

    public void setTenNguoiNhan(String tenNguoiNhan) {
        this.tenNguoiNhan = tenNguoiNhan;
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
    @Column(name = "Sdt")
    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HoaDon hoaDon = (HoaDon) o;

        if (id != null ? !id.equals(hoaDon.id) : hoaDon.id != null) return false;
        if (idKh != null ? !idKh.equals(hoaDon.idKh) : hoaDon.idKh != null) return false;
        if (idNv != null ? !idNv.equals(hoaDon.idNv) : hoaDon.idNv != null) return false;
        if (ma != null ? !ma.equals(hoaDon.ma) : hoaDon.ma != null) return false;
        if (ngayTao != null ? !ngayTao.equals(hoaDon.ngayTao) : hoaDon.ngayTao != null) return false;
        if (ngayThanhToan != null ? !ngayThanhToan.equals(hoaDon.ngayThanhToan) : hoaDon.ngayThanhToan != null)
            return false;
        if (ngayShip != null ? !ngayShip.equals(hoaDon.ngayShip) : hoaDon.ngayShip != null) return false;
        if (ngayNhan != null ? !ngayNhan.equals(hoaDon.ngayNhan) : hoaDon.ngayNhan != null) return false;
        if (tinhTrang != null ? !tinhTrang.equals(hoaDon.tinhTrang) : hoaDon.tinhTrang != null) return false;
        if (tenNguoiNhan != null ? !tenNguoiNhan.equals(hoaDon.tenNguoiNhan) : hoaDon.tenNguoiNhan != null)
            return false;
        if (diaChi != null ? !diaChi.equals(hoaDon.diaChi) : hoaDon.diaChi != null) return false;
        if (sdt != null ? !sdt.equals(hoaDon.sdt) : hoaDon.sdt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (idKh != null ? idKh.hashCode() : 0);
        result = 31 * result + (idNv != null ? idNv.hashCode() : 0);
        result = 31 * result + (ma != null ? ma.hashCode() : 0);
        result = 31 * result + (ngayTao != null ? ngayTao.hashCode() : 0);
        result = 31 * result + (ngayThanhToan != null ? ngayThanhToan.hashCode() : 0);
        result = 31 * result + (ngayShip != null ? ngayShip.hashCode() : 0);
        result = 31 * result + (ngayNhan != null ? ngayNhan.hashCode() : 0);
        result = 31 * result + (tinhTrang != null ? tinhTrang.hashCode() : 0);
        result = 31 * result + (tenNguoiNhan != null ? tenNguoiNhan.hashCode() : 0);
        result = 31 * result + (diaChi != null ? diaChi.hashCode() : 0);
        result = 31 * result + (sdt != null ? sdt.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "IdKH", referencedColumnName = "Id")
    public KhachHang getKhachHangByIdKh() {
        return khachHangByIdKh;
    }

    public void setKhachHangByIdKh(KhachHang khachHangByIdKh) {
        this.khachHangByIdKh = khachHangByIdKh;
    }

    @ManyToOne
    @JoinColumn(name = "IdKH", referencedColumnName = "Id")
    public KhachHang getKhachHangByIdKh_0() {
        return khachHangByIdKh_0;
    }

    public void setKhachHangByIdKh_0(KhachHang khachHangByIdKh_0) {
        this.khachHangByIdKh_0 = khachHangByIdKh_0;
    }

    @ManyToOne
    @JoinColumn(name = "IdNV", referencedColumnName = "Id")
    public NhanVien getNhanVienByIdNv() {
        return nhanVienByIdNv;
    }

    public void setNhanVienByIdNv(NhanVien nhanVienByIdNv) {
        this.nhanVienByIdNv = nhanVienByIdNv;
    }

    @ManyToOne
    @JoinColumn(name = "IdNV", referencedColumnName = "Id")
    public NhanVien getNhanVienByIdNv_0() {
        return nhanVienByIdNv_0;
    }

    public void setNhanVienByIdNv_0(NhanVien nhanVienByIdNv_0) {
        this.nhanVienByIdNv_0 = nhanVienByIdNv_0;
    }

    @OneToMany(mappedBy = "hoaDonByIdHoaDon")
    public Collection<HoaDonChiTiet> getHoaDonChiTietsById() {
        return hoaDonChiTietsById;
    }

    public void setHoaDonChiTietsById(Collection<HoaDonChiTiet> hoaDonChiTietsById) {
        this.hoaDonChiTietsById = hoaDonChiTietsById;
    }
}
