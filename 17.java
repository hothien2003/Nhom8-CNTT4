 class doan{
		public static void menu(){
			ListMayAnh lma = new ListMayAnh();	
			liStNhapKho lnk = new liStNhapKho();
			liStXuatKHo lxk = new liStXuatKHo();
			Scanner scanner = new Scanner(System.in);
			boolean choose=true;
			do{
				System.out.println("1.Danh sach may anh");
				System.out.println("2.Tim kiem may anh");
				System.out.println("3.Nhap kho");
				System.out.println("4.Xuat kho");
				System.out.println("5.Them may anh");
				System.out.println("6.Xoa may anh");
				System.out.println("Chon");
				System.out.println("=========================");
        	int chon = scanner.nextInt();
        	scanner.nextLine();
        	switch(chon){
        		case 1:
        		{
        			System.out.println("Nhap ten may anh: ");
        			String tenMayAnh=scanner.nextLine();
        			System.out.println("Ma may anh: ");
        			String maMayAnh=scanner.nextLine();
        			System.out.println("Nhap ngay san xuat: ");
        			String nSX=scanner.nextLine();
        			System.out.println("Nhap gia may: ");
        			Double giaMay=scanner.nextDouble();
        			System.out.println("Nhap so luong: ");
        			int soLuong=scanner.nextInt();
        			lma.printlistMayAnh();
        			break;
        		}
        		case 2:
        		{
        			System.out.println("Nhap ten may anh: ");
        			String tenMayAnh=scanner.nextLine();
        			System.out.println("Ma may anh: ");
        			String maMayAnh=scanner.nextLine();
        			System.out.println("Nhap ngay san xuat: ");
        			String nSX=scanner.nextLine();
        			System.out.println("Nhap gia may: ");
        			Double giaMay=scanner.nextDouble();
        			System.out.println("Nhap so luong: ");
        			int soLuong=scanner.nextInt();
        			lma.searchMayAnh(tenMayAnh);
        			break;
        		}
        		case 3:
        		{
        			System.out.println("Nhap ma may anh: ");
        			String maMayAnh=scanner.nextLine();
        			System.out.println("Nhap ten may anh: ");
        			String tenMayAnh=scanner.nextLine();
        			System.out.println("Nhap ngay san xuat: ");
        			String nSX=scanner.nextLine();
        			System.out.println("Nhap gia may: ");
        			Double giaMay=scanner.nextDouble();
        			System.out.println("Nhap so luong: ");
        			int soLuong=scanner.nextInt();
        			System.out.println("So luong nhap: ");
        			int soLuongNhap=scanner.nextInt();
        			System.out.println("Ngay nhap may: ");
        			String ngayNhapMay=scanner.nextLine();
        			NhapKho nk = new NhapKho(maMayAnh,tenMayAnh,nSX,giaMay,soLuong,soLuongNhap,ngayNhapMay);
        			lnk.addNhapKho(nk);
        			lnk.printlistNhapKho();
        			break;
        		}
        		case 4:
        		{
        			System.out.println("Nhap ma may anh: ");
        			String maMayAnh=scanner.nextLine();
        			System.out.println("Nhap ten may anh: ");
        			String tenMayAnh=scanner.nextLine();
        			System.out.println("Nhap ngay san xuat: ");
        			String nSX=scanner.nextLine();
        			System.out.println("Nhap gia may: ");
        			Double giaMay=scanner.nextDouble();
        			System.out.println("Nhap so luong: ");
        			int soLuong=scanner.nextInt();
        			System.out.println("So luong xuat: ");
        			int soLuongXuat=scanner.nextInt();
        			System.out.println("Ngay xuat may: ");
        			String ngayXuatMay=scanner.nextLine();
        			XuatKho xk = new XuatKho(maMayAnh,tenMayAnh,nSX,giaMay,soLuong,soLuongXuat,ngayXuatMay);
        			lxk.addXuatKho(xk);
        			lxk.printlistXuatKho();
        			break;
        		}
        		case 5:
        		{
        			System.out.println("Nhap ma may anh: ");
        			String maMayAnh=scanner.nextLine();
        			System.out.println("Nhap ten may anh: ");
        			String tenMayAnh=scanner.nextLine();
        			System.out.println("Nhap ngay san xuat: ");
        			String nSX=scanner.nextLine();
        			System.out.println("Nhap gia may: ");
        			Double giaMay=scanner.nextDouble();
        			System.out.println("Nhap so luong: ");
        			int soLuong=scanner.nextInt();
        			MayAnh ma = new MayAnh(maMayAnh,tenMayAnh,nSX,giaMay,soLuong);
        			lma.addMayAnh(ma);
        			break;
        		}
        		case 6:{

        			System.out.println("Nhap ma may anh can xoa: ");
        			String maMayAnh=scanner.nextLine();
        			MayAnh ma=new MayAnh();
        			System.out.println("Xoa may anh"+ lma.delete(ma));
        		}
        	default: System.exit(0);
        		break;
        	}
			}while(choose);
		}
	public static void main(String[] args){
			System.out.println("=========================");
			menu();
		}
}