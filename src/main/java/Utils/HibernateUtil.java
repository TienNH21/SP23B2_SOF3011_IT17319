package Utils;

import domain_models.*;
import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.sql.Date;
import java.util.List;
import java.util.Properties;
import java.util.UUID;

public class HibernateUtil {
    private static final SessionFactory FACTORY;

    static {
        Configuration conf = new Configuration();

        Properties properties = new Properties();
        properties.put(Environment.DIALECT, "org.hibernate.dialect.SQLServerDialect");
        properties.put(Environment.DRIVER, "com.microsoft.sqlserver.jdbc.SQLServerDriver");
        properties.put(Environment.URL, "jdbc:sqlserver://localhost:1433;databaseName=FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041");
        properties.put(Environment.USER, "sa");
        properties.put(Environment.PASS, "Aa@123456");
        properties.put(Environment.SHOW_SQL, "true");

        conf.setProperties(properties);
        conf.addAnnotatedClass(KhachHang.class);
        conf.addAnnotatedClass(ChucVu.class);
//        conf.addAnnotatedClass(CuaHang.class);
        conf.addAnnotatedClass(NhanVien.class);
//        conf.addAnnotatedClass(SanPham.class);
//        conf.addAnnotatedClass(ChiTietSp.class);
//        conf.addAnnotatedClass(DongSp.class);
//        conf.addAnnotatedClass(GioHang.class);
//        conf.addAnnotatedClass(GioHangChiTiet.class);
//        conf.addAnnotatedClass(HoaDon.class);
//        conf.addAnnotatedClass(HoaDonChiTiet.class);
//        conf.addAnnotatedClass(MauSac.class);
//        conf.addAnnotatedClass(Nsx.class);
        ServiceRegistry registry = new StandardServiceRegistryBuilder()
                .applySettings(conf.getProperties()).build();
        FACTORY = conf.buildSessionFactory(registry);

    }

    public static SessionFactory getFACTORY() {
        return FACTORY;
    }

    public static void main(String[] args) {
        Session s = HibernateUtil
                .getFACTORY()
                .openSession();

        String hql = "SELECT obj FROM ChucVu obj WHERE obj.ma = ?1";
        TypedQuery<ChucVu> q = s.createQuery(hql, ChucVu.class);
        q.setParameter(1, "1");
        ChucVu cv = q.getSingleResult();
        System.out.println(cv.getTen());

        List<NhanVien> listNv = cv.getListNhanVien();
        NhanVien nv = listNv.get(0);
        System.out.println(nv.getTen());
    }
}
