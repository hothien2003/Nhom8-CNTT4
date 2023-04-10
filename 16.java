class liStXuatKHo{
		private ArrayList<XuatKho>liStXuat;
		public liStXuatKHo(ArrayList<XuatKho> liStXuat){
			this.liStXuat=liStXuat;
		}
		public liStXuatKHo(){
			this.liStXuat=new ArrayList<XuatKho>();
		}
		public void addXuatKho(XuatKho xk){
			this.liStXuat.add(xk);
		}
		public void printlistXuatKho(){
			for(XuatKho xuatKho: liStXuat){
				System.out.println(xuatKho);
			}
		}
	}
