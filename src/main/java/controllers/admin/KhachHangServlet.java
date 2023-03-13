package controllers.admin;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import view_models.QLKhachHang;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet({
    "/khach-hang/index",    // GET
    "/khach-hang/create",   // GET
    "/khach-hang/store",    // POST
    "/khach-hang/edit",     // GET
    "/khach-hang/update",   // POST
    "/khach-hang/delete",   // GET
})
public class KhachHangServlet extends HttpServlet {
    private ArrayList<QLKhachHang> ds = new ArrayList<>();

    @Override
    protected void doGet(
        HttpServletRequest request,
        HttpServletResponse response
    ) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("create") == true) {
            this.create(request, response);
        } else if (uri.contains("edit") == true) {
//            this.edit(request, response);
        } else if (uri.contains("delete") == true) {
//            this.delete(request, response);
        } else {
            this.index(request, response);
        }
    }

    public void create(
        HttpServletRequest request,
        HttpServletResponse response
    ) throws ServletException, IOException {
        request.getRequestDispatcher("/views/khach_hang/create.jsp")
            .forward(request, response);
    }

    protected void index(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        ds.add(new QLKhachHang("AAA","AAA","AAA","AAA","AAA","AAA","AAA","AAA","AAA","AAA"));
        ds.add(new QLKhachHang("BBB","BBB","AAA","AAA","AAA","AAA","AAA","AAA","AAA","AAA"));
        request.setAttribute("ds", ds);
        request.getRequestDispatcher("/views/khach_hang/index.jsp")
            .forward(request, response);
    }

    @Override
    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        this.store(request, response);
    }

    protected void store(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        System.out.println("Hello aaa");
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

        QLKhachHang kh = new QLKhachHang(ma, ten, tenDem, ho, ngaySinh, sdt, diaChi, matKhau, quocGia, thanhPho);
        this.ds.add(kh);
    }
}


