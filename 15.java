 class liStNhapKho{
		private ArrayList<NhapKho> liStNhap;
		public liStNhapKho(ArrayList<NhapKho> liStNhap){
			this.liStNhap=liStNhap;
		}
		public liStNhapKho(){
			this.liStNhap=new ArrayList<NhapKho>();
		}
		public void addNhapKho(NhapKho nk){
			this.liStNhap.add(nk);
		}
		public void printlistNhapKho(){
			for(NhapKho nhapKho: liStNhap){
				System.out.println(nhapKho);
			}
		}
	}