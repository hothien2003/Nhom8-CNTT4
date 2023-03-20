import java.util.Scanner;
public class UML2{
class Hinh {
    protected double Dientich;
    public Hinh(double Dientich)
    {
        super();
        this.Dientich = Dientich;
    }
    public double getDientich(){
        return this.Dientich;
    }
}

class Hinhchunhat extends Hinh {
    private float cd;
    private float cr;
    public Hinhchunhat(float cd, float cr){
    super(cd);
    this.cd = cd;
    this.cr = cr;
    }
    public double getDientich(){
        return this.cd*this.cr;
    }
    public String toString() {
        return "Hinh{" +
                "Dientich=" + Dientich +
                '}';
    }
}

class Hinhtron extends Hinh {
    private float r;
    public Hinhtron(float r){
        super(r);
        this.r = r;
    }
    public double getDientich(){
        return this.r*2*Math.PI;
    }
    public String toString() {
        return "Hinh{" +
                "Dientich=" + Dientich +
                '}';
    }
}

class  DanhSachHinh{
	public static void menu(){
		System.out.println("---------- LIST ----------");
		System.out.println("Hinh Chu Nhat");
		System.out.println("Hinh Tron");
		System.out.println("Them Hinh");
		System.out.println("In Danh Sach");
	}
}

public class bai2 {
    public static void main(String[] args) {
        Hinhtron ht = new Hinhtron( 7);
        System.out.println("Dien tich hinh tron = :"+ ht.getDientich());
        Hinhchunhat hcn = new Hinhchunhat(15, 7);
        System.out.println("Dien tich hinh chu nhat = :"+ hcn.getDientich());
    	}
	}
}