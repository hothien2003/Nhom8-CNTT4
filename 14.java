class ListMayAnh{
		private ArrayList<MayAnh>liSt;
		
		public ListMayAnh(ArrayList<MayAnh> liSt){
			this.liSt=liSt;
		}
		public ListMayAnh(){
			this.liSt = new ArrayList<MayAnh>();
		}
		public void addMayAnh(MayAnh ma){
				this.liSt.add(ma);
		}
		public void printlistMayAnh(){
			for(MayAnh mayanh: liSt){
				System.out.println(mayanh);
			}
		}
		public void searchMayAnh(String tenMayAnh){
			for(MayAnh mayanh: liSt){
				if(mayanh.getTenMayAnh().indexOf(tenMayAnh)>=0){
					System.out.println(mayanh);
				}
			}
		}
		public boolean delete(MayAnh ma){
			return this.liSt.remove(ma);
		}
	}