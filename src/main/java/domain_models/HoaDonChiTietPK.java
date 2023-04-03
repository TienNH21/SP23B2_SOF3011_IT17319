package domain_models;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

import java.io.Serializable;

public class HoaDonChiTietPK implements Serializable {
    private Object idHoaDon;
    private Object idChiTietSp;

    @Column(name = "IdHoaDon")
    @Id
    public Object getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(Object idHoaDon) {
        this.idHoaDon = idHoaDon;
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

        HoaDonChiTietPK that = (HoaDonChiTietPK) o;

        if (idHoaDon != null ? !idHoaDon.equals(that.idHoaDon) : that.idHoaDon != null) return false;
        if (idChiTietSp != null ? !idChiTietSp.equals(that.idChiTietSp) : that.idChiTietSp != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idHoaDon != null ? idHoaDon.hashCode() : 0;
        result = 31 * result + (idChiTietSp != null ? idChiTietSp.hashCode() : 0);
        return result;
    }
}
