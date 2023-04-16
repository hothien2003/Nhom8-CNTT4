import java.util.Scanner;
class Panasonic extends MayAnh {
    private int slTon;
    private double trongLuong;

    public  Panasonic() {}

    public Panasonic(int gia, int namSX, String hangSX, String quocGia, String hangMay, String maMay, int slTon, double trongLuong) {
        super(gia, namSX, hangSX, quocGia, hangMay, maMay);
        this.slTon = slTon;
        this.trongLuong = trongLuong;
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Sl ton: "); slTon = sc.nextInt();
        System.out.print("Nhap Trong luong: "); trongLuong = sc.nextDouble();
        super.nhap();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.print("\tSluong ton: " + slTon);
        System.out.println("\tTrong luong: "+ trongLuong + "kg");
    }

    @Override
    public double capNhatGiaTien() {
        return super.capNhatGiaTien();
    }
}