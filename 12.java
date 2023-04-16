import java.util.Scanner;
class Canon extends MayAnh{
    private int slTon;

    public Canon () {}

    public Canon(int gia, int namSX, String hangSX, String quocGia, String hangMay, String maMay, int slTon) {
        super(gia, namSX, hangSX, quocGia, hangMay, maMay);
        this.slTon = slTon;
    }

    @Override
    public void xuat() {
        System.out.print("Sluong ton: " + slTon);
        super.xuat();
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Sl ton: "); slTon = sc.nextInt();
        super.nhap();
    }

    @Override
    public double capNhatGiaTien() {
        return super.capNhatGiaTien();
    }
}