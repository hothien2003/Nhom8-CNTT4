import java.util.Scanner;
class PhieuNhapKho extends Phieu {

    private int ngayNhap;
    public PhieuNhapKho() {
    }

    public PhieuNhapKho(int ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public int getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(int ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner n = new Scanner(System.in);
        System.out.print("Ngay Nhap kho: ");
        ngayNhap = n.nextInt();
    }

    @Override
    public void xuat() {
        super.xuat();
    }


}