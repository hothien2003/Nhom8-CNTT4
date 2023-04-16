import java.io.Serializable;
import java.util.Scanner;
class MayAnh implements Serializable {
    private int gia;
    private int namSX, soluong;
    private String hangSX, quocGia, HangMay, maMay;

    public MayAnh() {}

    public MayAnh(int gia, int namSX, String hangSX, String quocGia, String hangMay, String maMay) {
        this.gia = gia;
        this.namSX = namSX;
        this.hangSX = hangSX;
        this.quocGia = quocGia;
        HangMay = hangMay;
        this.maMay= maMay;
        this.soluong = soluong;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    public String getHangMay() {
        return HangMay;
    }

    public void setHangMay(String hangMay) {
        HangMay = hangMay;
    }

    public String getMaMay() {
        return maMay;
    }

    public void setMaMay(String maMay) {
        this.maMay = maMay;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Hang SX: "); hangSX = sc.nextLine();
        System.out.print("Nhap Quoc gia: "); quocGia = sc.nextLine();
        System.out.print("Nhap Hang May: "); HangMay = sc.nextLine();
        System.out.print("Nhap Ma May: "); maMay = sc.nextLine();
        System.out.print("Nhap Nam SX: "); namSX = sc.nextInt();
        System.out.print("Nhap Gia tien: "); gia = sc.nextInt();
    }
    public void xuat() {
        System.out.print("Hang SX: "+ hangSX);
        System.out.print("\tQuoc gia: "+ quocGia);
        System.out.print("\tHang may: "+ HangMay);
        System.out.print("\tNam SX: "+ namSX);
        System.out.println("\tMa may: "+ maMay);
        System.out.print("\tGia tien: "+ gia + " VND");
    }

    public double capNhatGiaTien() {
        return gia* 0.1 + gia;
    }
}