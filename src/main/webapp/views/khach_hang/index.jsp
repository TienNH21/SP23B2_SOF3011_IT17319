<%--
  Created by IntelliJ IDEA.
  User: tiennh
  Date: 3/10/23
  Time: 10:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/SP23B2_SOF3011_IT17319_war_exploded/css/bootstrap.min.css" />
</head>
<body>
    <div class="col-8 offset-2 mt-5 table-responsive">
        <div class="row">
            <div class="col-6">
                <a href="#" class="btn btn-success">Thêm mới</a>
            </div>
        </div>
        <table class="table table-striped mt-3">
            <thead class="table-primary">
                <tr>
                    <th>Mã</th>
                    <th>Họ</th>
                    <th>Đệm</th>
                    <th>Tên</th>
                    <th>Ngày sinh</th>
                    <th>SDT</th>
                    <th>Địa chỉ</th>
                    <th>Thành phố</th>
                    <th>Quốc gia</th>
                    <th colspan="2">Thao tác</th>
                </tr>
            </thead>
            <tbody>
                <c:if test="${f:length(ds) == 0}">
                    <span>Không có dữ liệu</span>
                </c:if>
                <c:if test="${f:length(ds) != 0}">
                    <c:forEach items="${ ds }" var="kh">
                        <tr>
                            <td>${ kh.ma }</td>
                            <td>${ kh.ho }</td>
                            <td>${ kh.tenDem }</td>
                            <td>${ kh.ten }</td>
                            <td>${ kh.ngaySinh }</td>
                            <td>${ kh.sdt }</td>
                            <td>${ kh.diaChi }</td>
                            <td>${ kh.thanhPho }</td>
                            <td>${ kh.quocGia }</td>
                            <td>
                                <a class="btn btn-primary"
                                   href="/SP23B2_SOF3011_IT17319_war_exploded/khach-hang/edit?ma=${ kh.ma }">
                                    Cập nhật
                                </a>
                            </td>
                            <td>
                                <a class="btn btn-danger"
                                   href="/SP23B2_SOF3011_IT17319_war_exploded/khach-hang/delete?ma=${ kh.ma }">
                                    Xóa
                                </a>
                            </td>
                        </tr>
                    </c:forEach>
                </c:if>
            </tbody>
        </table>
    </div>

    <script src="/SP23B2_SOF3011_IT17319_war_exploded/js/bootstrap.min.js"></script>
</body>
</html>
