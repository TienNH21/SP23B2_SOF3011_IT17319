package domain_models;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class ChiTietSp {
    private Object id;
    private Object idSp;
    private Object idNsx;
    private Object idMauSac;
    private Object idDongSp;
    private Integer namBh;
    private String moTa;
    private Integer soLuongTon;
    private Integer giaNhap;
    private Integer giaBan;
    private SanPham sanPhamByIdSp;
    private SanPham sanPhamByIdSp_0;
    private Nsx nsxByIdNsx;
    private Nsx nsxByIdNsx_0;
    private MauSac mauSacByIdMauSac;
    private MauSac mauSacByIdMauSac_0;
    private DongSp dongSpByIdDongSp;
    private DongSp dongSpByIdDongSp_0;
    private Collection<GioHangChiTiet> gioHangChiTietsById;
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
    @Column(name = "IdSP")
    public Object getIdSp() {
        return idSp;
    }

    public void setIdSp(Object idSp) {
        this.idSp = idSp;
    }

    @Basic
    @Column(name = "IdNsx")
    public Object getIdNsx() {
        return idNsx;
    }

    public void setIdNsx(Object idNsx) {
        this.idNsx = idNsx;
    }

    @Basic
    @Column(name = "IdMauSac")
    public Object getIdMauSac() {
        return idMauSac;
    }

    public void setIdMauSac(Object idMauSac) {
        this.idMauSac = idMauSac;
    }

    @Basic
    @Column(name = "IdDongSP")
    public Object getIdDongSp() {
        return idDongSp;
    }

    public void setIdDongSp(Object idDongSp) {
        this.idDongSp = idDongSp;
    }

    @Basic
    @Column(name = "NamBH")
    public Integer getNamBh() {
        return namBh;
    }

    public void setNamBh(Integer namBh) {
        this.namBh = namBh;
    }

    @Basic
    @Column(name = "MoTa")
    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Basic
    @Column(name = "SoLuongTon")
    public Integer getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(Integer soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    @Basic
    @Column(name = "GiaNhap")
    public Integer getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(Integer giaNhap) {
        this.giaNhap = giaNhap;
    }

    @Basic
    @Column(name = "GiaBan")
    public Integer getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(Integer giaBan) {
        this.giaBan = giaBan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChiTietSp chiTietSp = (ChiTietSp) o;

        if (id != null ? !id.equals(chiTietSp.id) : chiTietSp.id != null) return false;
        if (idSp != null ? !idSp.equals(chiTietSp.idSp) : chiTietSp.idSp != null) return false;
        if (idNsx != null ? !idNsx.equals(chiTietSp.idNsx) : chiTietSp.idNsx != null) return false;
        if (idMauSac != null ? !idMauSac.equals(chiTietSp.idMauSac) : chiTietSp.idMauSac != null) return false;
        if (idDongSp != null ? !idDongSp.equals(chiTietSp.idDongSp) : chiTietSp.idDongSp != null) return false;
        if (namBh != null ? !namBh.equals(chiTietSp.namBh) : chiTietSp.namBh != null) return false;
        if (moTa != null ? !moTa.equals(chiTietSp.moTa) : chiTietSp.moTa != null) return false;
        if (soLuongTon != null ? !soLuongTon.equals(chiTietSp.soLuongTon) : chiTietSp.soLuongTon != null) return false;
        if (giaNhap != null ? !giaNhap.equals(chiTietSp.giaNhap) : chiTietSp.giaNhap != null) return false;
        if (giaBan != null ? !giaBan.equals(chiTietSp.giaBan) : chiTietSp.giaBan != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (idSp != null ? idSp.hashCode() : 0);
        result = 31 * result + (idNsx != null ? idNsx.hashCode() : 0);
        result = 31 * result + (idMauSac != null ? idMauSac.hashCode() : 0);
        result = 31 * result + (idDongSp != null ? idDongSp.hashCode() : 0);
        result = 31 * result + (namBh != null ? namBh.hashCode() : 0);
        result = 31 * result + (moTa != null ? moTa.hashCode() : 0);
        result = 31 * result + (soLuongTon != null ? soLuongTon.hashCode() : 0);
        result = 31 * result + (giaNhap != null ? giaNhap.hashCode() : 0);
        result = 31 * result + (giaBan != null ? giaBan.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "IdSP", referencedColumnName = "Id")
    public SanPham getSanPhamByIdSp() {
        return sanPhamByIdSp;
    }

    public void setSanPhamByIdSp(SanPham sanPhamByIdSp) {
        this.sanPhamByIdSp = sanPhamByIdSp;
    }

    @ManyToOne
    @JoinColumn(name = "IdSP", referencedColumnName = "Id")
    public SanPham getSanPhamByIdSp_0() {
        return sanPhamByIdSp_0;
    }

    public void setSanPhamByIdSp_0(SanPham sanPhamByIdSp_0) {
        this.sanPhamByIdSp_0 = sanPhamByIdSp_0;
    }

    @ManyToOne
    @JoinColumn(name = "IdNsx", referencedColumnName = "Id")
    public Nsx getNsxByIdNsx() {
        return nsxByIdNsx;
    }

    public void setNsxByIdNsx(Nsx nsxByIdNsx) {
        this.nsxByIdNsx = nsxByIdNsx;
    }

    @ManyToOne
    @JoinColumn(name = "IdNsx", referencedColumnName = "Id")
    public Nsx getNsxByIdNsx_0() {
        return nsxByIdNsx_0;
    }

    public void setNsxByIdNsx_0(Nsx nsxByIdNsx_0) {
        this.nsxByIdNsx_0 = nsxByIdNsx_0;
    }

    @ManyToOne
    @JoinColumn(name = "IdMauSac", referencedColumnName = "Id")
    public MauSac getMauSacByIdMauSac() {
        return mauSacByIdMauSac;
    }

    public void setMauSacByIdMauSac(MauSac mauSacByIdMauSac) {
        this.mauSacByIdMauSac = mauSacByIdMauSac;
    }

    @ManyToOne
    @JoinColumn(name = "IdMauSac", referencedColumnName = "Id")
    public MauSac getMauSacByIdMauSac_0() {
        return mauSacByIdMauSac_0;
    }

    public void setMauSacByIdMauSac_0(MauSac mauSacByIdMauSac_0) {
        this.mauSacByIdMauSac_0 = mauSacByIdMauSac_0;
    }

    @ManyToOne
    @JoinColumn(name = "IdDongSP", referencedColumnName = "Id")
    public DongSp getDongSpByIdDongSp() {
        return dongSpByIdDongSp;
    }

    public void setDongSpByIdDongSp(DongSp dongSpByIdDongSp) {
        this.dongSpByIdDongSp = dongSpByIdDongSp;
    }

    @ManyToOne
    @JoinColumn(name = "IdDongSP", referencedColumnName = "Id")
    public DongSp getDongSpByIdDongSp_0() {
        return dongSpByIdDongSp_0;
    }

    public void setDongSpByIdDongSp_0(DongSp dongSpByIdDongSp_0) {
        this.dongSpByIdDongSp_0 = dongSpByIdDongSp_0;
    }

    @OneToMany(mappedBy = "chiTietSpByIdChiTietSp")
    public Collection<GioHangChiTiet> getGioHangChiTietsById() {
        return gioHangChiTietsById;
    }

    public void setGioHangChiTietsById(Collection<GioHangChiTiet> gioHangChiTietsById) {
        this.gioHangChiTietsById = gioHangChiTietsById;
    }

    @OneToMany(mappedBy = "chiTietSpByIdChiTietSp")
    public Collection<HoaDonChiTiet> getHoaDonChiTietsById() {
        return hoaDonChiTietsById;
    }

    public void setHoaDonChiTietsById(Collection<HoaDonChiTiet> hoaDonChiTietsById) {
        this.hoaDonChiTietsById = hoaDonChiTietsById;
    }
}
