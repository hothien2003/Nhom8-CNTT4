import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
class MayAnh {
private String maMayAnh,tenMayAnh;
private String nSX;
private Double giaMay;
private int soLuong;

public MayAnh(){}
public MayAnh(String maMayAnh,String tenMayAnh,String nSX,Double giaMay,int soLuong)
{
	super();
	this.maMayAnh=maMayAnh;
	this.tenMayAnh=tenMayAnh;
	this.nSX=nSX;
	this.giaMay=giaMay;
	this.soLuong=soLuong;
}
		public String getMaMayAnh(){
			return maMayAnh;
		}
		public void setMaMayAnh(String maMayAnh){
			this.maMayAnh=maMayAnh;
		}
		public String getTenMayAnh(){
			return tenMayAnh;
		}
		public void setTenMayAnh(String tenMayAnh){
			this.tenMayAnh=tenMayAnh;
		}
		public String getNSX(){
			return nSX;
		}
		public void setNSX(String nSX){
			this.nSX=nSX;
		}
		public Double getGiaMay(){
			return giaMay;
		}
		public void setGiaMay(Double giaMay){
			this.giaMay=giaMay;
		}
		public int getSoLuong(){
			return soLuong;
		}
		public void setSoLuong(int soLuong){
			this.soLuong=soLuong;
		}
		
		@Override 
		public String toString(){
			return "Kho may anh:" + ", ma may anh:" + this.maMayAnh + ", ten may anh:" + this.tenMayAnh + ", ngay san xuat:" + this.nSX +  ", gia may:" + this.giaMay + ", so luong:" + this.soLuong;
		}
}