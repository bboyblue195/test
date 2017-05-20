$(document).ready(function() {
	$("#form-login").validate({
		ignore: [], 
		debug: false,
		rules: {
			"ten_dang_nhap": {
				required: true,
			},
			"mat_khau": {
				required: true,
			},
		},
		messages: {
			"ten_dang_nhap": {
				required: "Vui lòng nhập vào đây",
			},
			"mat_khau": {
				required: "Vui lòng nhập vào đây",
			},
		}
	});
	
	$("#idForm").validate({
		ignore: [], 
		debug: false,
		rules: {
			"ten_phong": {
				required: true,
			},
			"buoi": {
				required: true,
			},
			"ngay": {
				required: true,
			}
		},
		messages: {
			"ten_phong": {
				required: "Vui lòng nhập tên phòng",
			},
			"buoi": {
				required: "Vui lòng chọn buổi",
			},
			"ngay": {
				required: "Vui lòng chọn ngày muốn đăng ký",
			}
		}
	});
	$("#formthemphong").validate({
		ignore: [], 
		debug: false,
		rules: {
			"khu": {
				required: true,
			},
			"tang": {
				required: true,
			},
			"ten_phong": {
				required: true,
				maxlength: 5,
			},
			"suc_chua": {
				required: true,
				maxlength: 4,
				min: 0,
			},
			"trang_thai": {
				required: true,
			}
		},
		messages: {
			"khu": {
				required: "Vui lòng chọn khu",
			},
			"tang": {
				required: "Vui lòng chọn tầng",
			},
			"ten_phong": {
				required: "Vui lòng đặt tên phòng",
				maxlength: "Tên phòng chỉ có tối đa 5 ký tự",
			},
			"suc_chua": {
				required: "Vui lòng nhập sức chứa",
				maxlength: "Sức chứa tối đa chỉ gồm 4 chữ số",
				min: "Vui lòng nhập số nguyên dương",
			},
			"trang_thai": {
				required: "Vui lòng chọn trạng thái",
			}
		}
	});
	$("#them-nguoi-dung").validate({
		ignore: [], 
		debug: false,
		rules: {
			"ten_dang_nhap": {
				required: true,
				maxlength: 100,
			},
			"mat_khau": {
				required: true,
				maxlength: 100,
			},
			"re_mat_khau": {
				required: true,
				maxlength: 100,
				equalTo: "#mat_khau",
			},
			"ho_va_ten": {
				required: true,
				maxlength: 100,
			},
			"email": {
				required: true,
				maxlength:50,
			},
			"phan_quyen": {
				min:1,
			}
		},
		messages: {
			"ten_dang_nhap": {
				required: "Vui lòng nhập tên đăng nhập ",
				maxlength: "Vui lòng nhập ít hơn 100 kí tự",
			},
			"mat_khau": {
				required: "Vui lòng nhập mật khẩu ",
				maxlength: "Vui lòng nhập ít hơn 100 kí tự",
			},
			"re_mat_khau": {
				required: "Vui lòng nhập lại mật khẩu ",
				maxlength: "Vui lòng nhập ít hơn 100 kí tự",
				equalTo: "Mật khẩu nhập lại không khớp",
			},
			"ho_va_ten": {
				required: "Vui lòng nhập họ và tên",
				maxlength: "Vui lòng nhập ít hơn 100 kí tự",
			},
			"email": {
				required: "Vui lòng nhập email",
				maxlength: "Vui lòng nhập ít hơn 50 kí tự",
			},
			"phan_quyen": {
				min: "Vui lòng chọn chức vụ"
			}
		}
	});
	$("#sua-nguoi-dung").validate({
		ignore: [], 
		debug: false,
		rules: {
			"ten_dang_nhap": {
				required: true,
				maxlength: 100,
			},
			"mat_khau": {
				maxlength: 100,
			},
			"re_mat_khau": {
				maxlength: 100,
				equalTo: "#mat_khau",
			},
			"ho_va_ten": {
				required: true,
				maxlength: 100,
			},
			"email": {
				required: true,
				maxlength:50,
			},
			"phan_quyen": {
				min:1,
			}
		},
		messages: {
			"ten_dang_nhap": {
				required: "Vui lòng nhập tên đăng nhập ",
				maxlength: "Vui lòng nhập ít hơn 100 kí tự",
			},
			"mat_khau": {
				maxlength: "Vui lòng nhập ít hơn 100 kí tự",
			},
			"re_mat_khau": {
				maxlength: "Vui lòng nhập ít hơn 100 kí tự",
				equalTo: "Mật khẩu nhập lại không khớp",
			},
			"ho_va_ten": {
				required: "Vui lòng nhập họ và tên",
				maxlength: "Vui lòng nhập ít hơn 100 kí tự",
			},
			"email": {
				required: "Vui lòng nhập email",
				maxlength: "Vui lòng nhập ít hơn 50 kí tự",
			},
			"phan_quyen": {
				min: "Vui lòng chọn chức vụ"
			}
		}
	});
});	