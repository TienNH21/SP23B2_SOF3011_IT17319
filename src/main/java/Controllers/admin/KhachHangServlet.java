package Controllers.admin;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.apache.commons.beanutils.BeanUtils;
import Repositories.KhachHangRepository;
import ViewModels.QLKhachHang;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@WebServlet({
    "/khach-hang/index",    // GET
    "/khach-hang/create",   // GET
    "/khach-hang/store",    // POST
    "/khach-hang/edit",     // GET
    "/khach-hang/update",   // POST
    "/khach-hang/delete",   // GET
})
public class KhachHangServlet extends HttpServlet {
    private KhachHangRepository khRepo;

    public KhachHangServlet()
    {
        this.khRepo = new KhachHangRepository();
        this.khRepo.insert(new QLKhachHang("PH1","A","Van","Ng","12-12-2000","0123123123","HN","AAA","VN","ND"));
        this.khRepo.insert(new QLKhachHang("PH2","B","Thi","Tran","12-01-2000","0123123124","ND","AAA","VN","HCM"));
    }

    @Override
    protected void doGet(
        HttpServletRequest request,
        HttpServletResponse response
    ) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("create") == true) {
            this.create(request, response);
        } else if (uri.contains("edit") == true) {
            this.edit(request, response);
        } else if (uri.contains("delete") == true) {
            this.delete(request, response);
        } else {
            this.index(request, response);
        }
    }

    public void delete(
        HttpServletRequest request,
        HttpServletResponse response
    ) throws ServletException, IOException {
        String ma = request.getParameter("ma");
        QLKhachHang vm = this.khRepo.findByMa(ma);
        this.khRepo.delete(vm);

        // Điều hướng request về index
        response.sendRedirect(
            "/SP23B2_SOF3011_IT17319_war_exploded" +
                "/khach-hang/index"
        );
    }

    public void create(
        HttpServletRequest request,
        HttpServletResponse response
    ) throws ServletException, IOException {
        request.setAttribute("view", "/views/khach_hang/create.jsp");
        request.getRequestDispatcher("/views/layout.jsp")
                .forward(request, response);
    }

    public void edit(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        String ma = request.getParameter("ma");
        QLKhachHang vm = this.khRepo.findByMa(ma);
        request.setAttribute("qlkh", vm);
        request.setAttribute("view", "/views/khach_hang/edit.jsp");
        request.getRequestDispatcher("/views/layout.jsp")
                .forward(request, response);
    }

    protected void index(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        request.setAttribute("ds", this.khRepo.findAll());
        request.setAttribute("view", "/views/khach_hang/index.jsp");
        request.getRequestDispatcher("/views/layout.jsp")
            .forward(request, response);
    }

    @Override
    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("store")) {
            this.store(request, response);
        } else if (uri.contains("update")) {
            this.update(request, response);
        } else {
            response.sendRedirect("/SP23B2_SOF3011_IT17319_war_exploded/khach-hang/index");
        }
    }

    protected void store(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        QLKhachHang kh = new QLKhachHang();
        try {
            BeanUtils.populate(kh, request.getParameterMap());
            this.khRepo.insert(kh);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    protected void update(
        HttpServletRequest request,
        HttpServletResponse response
    ) throws ServletException, IOException {
        String ma = request.getParameter("ma");
        String ho = request.getParameter("ho");
        String tenDem = request.getParameter("ten_dem");
        String ten = request.getParameter("ten");
        String ngaySinh = request.getParameter("ngay_sinh");
        String sdt = request.getParameter("sdt");
        String diaChi = request.getParameter("dia_chi");
        String thanhPho = request.getParameter("thanh_pho");
        String quocGia = request.getParameter("quoc_gia");
        String matKhau = request.getParameter("mat_khau");
//
        QLKhachHang kh = new QLKhachHang(ma, ten, tenDem, ho, ngaySinh, sdt, diaChi, matKhau, quocGia, thanhPho);
        this.khRepo.update(kh);
        response.sendRedirect("/SP23B2_SOF3011_IT17319_war_exploded/khach-hang/index");
    }
}

