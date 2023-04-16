import java.util.Scanner;
class PhieuXuatKho extends Phieu{
    private int ngayXuat;

    public PhieuXuatKho() {
    }

    public PhieuXuatKho(int ngayXuat) {
        this.ngayXuat = ngayXuat;
    }

    public int getNgayXuat() {
        return ngayXuat;
    }

    public void setNgayXuat(int ngayXuat) {
        this.ngayXuat = ngayXuat;
    }

    @Override
    public void nhap() {
        super.nhap();
    }

    @Override
    public void xuat() {
        super.xuat();
    }
}