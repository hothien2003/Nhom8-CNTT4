class XuatKho extends MayAnh{
		private int soLuongXuat;
		private String ngayXuatMay;

		public XuatKho(int soLuongXuat,String ngayXuatMay){
			this.soLuongXuat=soLuongXuat;
			this.ngayXuatMay=ngayXuatMay;
		}
		public XuatKho(String maMayAnh,String tenMayAnh,String nSX,Double giaMay,int soLuong,int soLuongXuat,String ngayXuatMay){
			super(maMayAnh,tenMayAnh,nSX,giaMay,soLuong);
			this.soLuongXuat=soLuongXuat;
			this.ngayXuatMay=ngayXuatMay;
		}
		public int getSoLuongXuat(){
			return soLuongXuat;
		}
		public void setSoLuongXuat(int soLuongXuat){
			this.soLuongXuat=soLuongXuat;
		}
		public String getNgayXuatMay(){
			return ngayXuatMay;
		}
		public void setNgayXuatMay(String ngayXuatMay){
			this.ngayXuatMay=ngayXuatMay;
		}
		@Override
		public String toString(){
			return super.toString() + "\n, so luong xuat: " + this.soLuongXuat + ",ngay xuat may: " + this.ngayXuatMay;
		}
	}