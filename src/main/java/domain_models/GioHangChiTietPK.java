package domain_models;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

import java.io.Serializable;

public class GioHangChiTietPK implements Serializable {
    private Object idGioHang;
    private Object idChiTietSp;

    @Column(name = "IdGioHang")
    @Id
    public Object getIdGioHang() {
        return idGioHang;
    }

    public void setIdGioHang(Object idGioHang) {
        this.idGioHang = idGioHang;
    }

    @Column(name = "IdChiTietSP")
    @Id
    public Object getIdChiTietSp() {
        return idChiTietSp;
    }

    public void setIdChiTietSp(Object idChiTietSp) {
        this.idChiTietSp = idChiTietSp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GioHangChiTietPK that = (GioHangChiTietPK) o;

        if (idGioHang != null ? !idGioHang.equals(that.idGioHang) : that.idGioHang != null) return false;
        if (idChiTietSp != null ? !idChiTietSp.equals(that.idChiTietSp) : that.idChiTietSp != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idGioHang != null ? idGioHang.hashCode() : 0;
        result = 31 * result + (idChiTietSp != null ? idChiTietSp.hashCode() : 0);
        return result;
    }
}
