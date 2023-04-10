	 class NhapKho extends MayAnh{
		private int soLuongNhap;
		private String ngayNhapMay;

		public NhapKho(int soLuongNhap,String ngayNhapMay){
			this.soLuongNhap=soLuongNhap;
			this.ngayNhapMay=ngayNhapMay;
		}
		public NhapKho(String maMayAnh,String tenMayAnh,String nSX,Double giaMay,int soLuong,int soLuongNhap,String ngayNhapMay){
			super(maMayAnh,tenMayAnh,nSX,giaMay,soLuong);
			this.soLuongNhap=soLuongNhap;
			this.ngayNhapMay=ngayNhapMay;
		}
		public int getSoLuongNhap(){
			return soLuongNhap;
		}
		public void setSoLuongNhap(int soLuongNhap){
			this.soLuongNhap=soLuongNhap;
		}
		public String getNgayNhapMay(){
			return ngayNhapMay;
		}
		public void setNgayNhapMay(String ngayNhapMay){
			this.ngayNhapMay=ngayNhapMay;
		}

		@Override
		public String toString(){
			return super.toString() + "\n,so luong nhap: " + this.soLuongNhap + ",ngay nhap may: " + this.ngayNhapMay;
		}
	}
