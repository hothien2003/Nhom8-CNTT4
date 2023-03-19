import java.util.Scanner;
public class bttl{
	class NhanVien
	{
		private String ten;
		private long luong ;
	}

	public class NhanVien( String ten,long luong)
	{
		this.ten = ten ;
		this.luong = luong ;
	}

	class NhanVienFullTime
	{
		private int loaiChucVu;
		private int ngayLamThem( string ten, long luong);
		{
			super ( ten,luong);
			this.loaiChucVu = loaiChucVu ;
			this.ngayLamThem = ngayLamThem ;
		}
	} 

	class NhanVienPartTime 

	{
		private int gioLamViec ( String ten, long luong );
		{
			super ( ten, luong );
			this.gioLamViec = gioLamViec ;
		}
	}

	class NhanVien 
	{
		public void tinhLuong ()
		{
			System.out.println("Ten nhan vien la: ");
		}	
	}

	class NhanVienFullTime extends NhanVien 
	{
		@Override
		public void tinhLuong ()
		{
			System.out.println( "Luong nhan vien full time la: ");
		}
	}
	class NhanVienPartTime extends NhanVien 
	{
		@Override
		public void tinhLuong ()
		{
			System.out.println( "Luong nhan vien part time la: ");
		}
	}
	public class baitap1 {
		public static void main (String [] agrs)
		{
			NhanVien nv = new NhanVien ();
			System.out.println(nv.tinhLuong());
			NhanVienFullTime nv = new NhanVienFullTime();
			System.out.println(nv.tinhLuong());
			NhanVienPartTime nv= new NhanVienPartTime();
			System.out.println(nv.tinhLuong());
		}
	}
}