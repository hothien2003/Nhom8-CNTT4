import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
class QuanLy {
    ArrayList <MayAnh> mayAnh;
    ArrayList <Phieu> phieu;

    public QuanLy() {
        mayAnh = new ArrayList<>();
        phieu = new ArrayList<>();
    }
    public void themDSMayAnh(MayAnh a) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong can them: "); int n = sc.nextInt();
        for (int i = 0; i< n; i++) {
            System.out.println("\nLan them thu " + (i+1)+ ": ");
            if (a instanceof Canon)
            {
                a = new Canon();
                a.nhap();
            }
            else if (a instanceof Panasonic)
            {
                a = new Panasonic();
                a.nhap();
            }
            mayAnh.add(a);
        }
    }
    public void suaDSCanon(String maMay) {
        for(MayAnh x: mayAnh) {
            if(x instanceof Canon) {
                if(((Canon)x).getMaMay().compareTo(maMay) == 0) {
                    x.nhap();
                }
            }
        }
    }

    public void xoaDSCanon(String maMay) {
        for(MayAnh x: mayAnh) {
            if (x instanceof Canon) {
                if(((Canon)x).getMaMay().compareTo(maMay) == 0) {
                    mayAnh.remove(x);
                }
            }
        }
    }

    public void suaDSPanasonic(String maMay) {
        for(MayAnh x: mayAnh) {
            if(x instanceof Panasonic) {
                if(((Panasonic)x).getMaMay().compareTo(maMay) == 0) {
                    x.nhap();
                }
            }
        }
    }

    public void xoaDSPanasonic(String maMay) {
        for(MayAnh x: mayAnh) {
            if (x instanceof Panasonic) {
                if(((Panasonic)x).getMaMay().compareTo(maMay) == 0) {
                    mayAnh.remove(x);
                }
            }
        }
    }
    public void hienDanhSachCanon()
    {
        for (MayAnh x: mayAnh)
        {
            if (x instanceof Canon)
            {
                ((Canon) x).xuat();
            }
        }
    }
    public void hienDanhSachPanasonic()
    {
        for (MayAnh x: mayAnh)
        {
            if (x instanceof Panasonic)
            {
                ((Panasonic) x).xuat();
            }
        }
    }
    public void themDSPhieu(Phieu a)
    {
        Scanner ds = new Scanner(System.in);
        System.out.print("\nNhap So Luong Can Them: "); int n = ds.nextInt();
        for (int i=0; i<n; i++)
        {
            System.out.println("\nLan them thu " + (i+1) + ": ");
            if (a instanceof PhieuNhapKho)
            {
                a = new PhieuNhapKho();
                a.nhap();
            }
            else if (a instanceof PhieuXuatKho)
            {
                a = new PhieuXuatKho();
                a.nhap();
            }
            phieu.add(a);
        }
    }
    public void TongSoLuongConLai()
    {
        int tongKM = 0;
        int tongPhieu = 0;
        for (MayAnh x: mayAnh)
        {
            tongKM += x.getSoluong();
        }
        for (Phieu y: phieu)
        {
            tongPhieu += y.getSoLuong();
        }
        int conLai = tongKM - tongPhieu;
        System.out.println("Tong So may anh con Lai: " + conLai);
    }
    public void hienDSPhieu(Phieu a)
    {
        System.out.println();
        for (Phieu y: phieu)
        {
            y.xuat();
        }
    }

    public void suaPhieuNhapKho(String maPhieu)
    {
        for (Phieu y: phieu)
        {
            if (y instanceof PhieuNhapKho)
            {
                if (((PhieuNhapKho) y).getMaPhieu().compareTo(maPhieu) == 0)
                {
                    y.nhap();
                }
            }
        }
    }

    public void xoaPhieuNhapKho(String maPhieu)
    {
        for (Phieu y: phieu)
        {
            if (y instanceof PhieuNhapKho)
            {
                if (((PhieuNhapKho) y).getMaPhieu().compareTo(maPhieu) == 0)
                {
                    phieu.remove(y);
                }
            }
        }
    }

    public void suaPhieuXuatKho(String maPhieu)
    {
        for (Phieu y: phieu)
        {
            if (y instanceof PhieuXuatKho)
            {
                if (((PhieuXuatKho) y).getMaPhieu().compareTo(maPhieu) == 0)
                {
                    y.nhap();
                }
            }
        }
    }

    public void xoaPhieuXuatKho(String maPhieu)
    {
        for (Phieu y: phieu)
        {
            if (y instanceof PhieuXuatKho)
            {
                if (((PhieuXuatKho) y).getMaPhieu().compareTo(maPhieu) == 0)
                {
                    phieu.remove(y);
                }
            }
        }
    }

    public void hienDSPhieuNhapKho(Phieu a)
    {
        System.out.println();
        for (Phieu y: phieu)
        {
            if (y instanceof PhieuNhapKho)
            {
                y.xuat();
            }
        }
    }

    public void hienDanhSachPhieuNhapKho()
    {
        for (Phieu y: phieu)
        {
            if (y instanceof PhieuNhapKho)
            {
                ((PhieuNhapKho) y).xuat();
            }
        }
    }

    public void hienDanhSachPhieuXuatKho()
    {
        for (Phieu y: phieu)
        {
            if (y instanceof PhieuXuatKho)
            {
                ((PhieuXuatKho) y).xuat();
            }
        }
        TongSoLuongConLai();
    }

    public void hienDSPhieuXuatKho(Phieu a)
    {
        System.out.println();
        for (Phieu y: phieu)
        {
            if (y instanceof PhieuXuatKho)
            {
                y.xuat();
            }
        }
    }

    public void hienDanhSachPhieu()
    {
        for (Phieu y: phieu)
        {
            y.xuat();
        }
    }
    public void hienDanhSachMayAnh()
    {
        for (MayAnh x: mayAnh)
        {
            x.xuat();
        }
    }
    public void ghiFileKM(String fileName)
    {
        try
        {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            objOut.flush();
            objOut.writeObject(mayAnh);
            objOut.close();
            fileOut.close();
            System.out.println("\nLuu File Thanh Cong, Ten File: " + fileName);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public void docFileKM(String fileName)
    {
        try
        {
            mayAnh = new ArrayList <> ();
            FileInputStream fin = new FileInputStream(fileName);
            ObjectInputStream fout = new ObjectInputStream(fin); mayAnh= (ArrayList) fout.readObject();
            hienDanhSachMayAnh();
            fin.close();
            fout.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("\nKhong tim Thay File");
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public void ghiFileP(String fileName)
    {
        try
        {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            objOut.flush();
            objOut.writeObject(phieu);
            objOut.close();
            fileOut.close();
            System.out.println("\nLuu File Thanh Cong, Ten File: " + fileName);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public void docFileP(String fileName)
    {
        try
        {
            phieu = new ArrayList <> ();
            FileInputStream fin = new FileInputStream(fileName);
            ObjectInputStream fout = new ObjectInputStream(fin); phieu = (ArrayList) fout.readObject();
            hienDanhSachPhieu();
            fin.close();
            fout.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("\nKhong tim Thay File");
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
    public void ghiFileMT(String fileName)
    {
        try
        {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            objOut.flush();
            objOut.writeObject(mayAnh);
            objOut.close();
            fileOut.close();
            System.out.println("\nLuu File Thanh Cong, Ten File: " + fileName);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public void docFileMT(String fileName)
    {
        try
        {
            mayAnh = new ArrayList <> ();
            FileInputStream fin = new FileInputStream(fileName);
            ObjectInputStream fout = new ObjectInputStream(fin); mayAnh = (ArrayList) fout.readObject();
            hienDanhSachMayAnh();
            fin.close();
            fout.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("\nKhong tim Thay File");
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
    public void menuChange() {
        System.out.println("=======================================");
        System.out.println("1. Sua thong tin may anh dong Canon  ");
        System.out.println("2. Xoa thong tin may anh dong Canon  ");
        System.out.println("3. Sua thong tin may anh dong Panasonic");
        System.out.println("4. Xoa thong tin may anh dong Panasonic");
        System.out.println("=======================================");
    }
    public void SuaDoiKM() {
        Scanner sd = new Scanner(System.in);
        menuChange();
        int chon;
        do {
            System.out.print("\nVui Long Lua Chon: "); chon = sd.nextInt();
            switch(chon) {
                case 1:
                    String maMay;
                    System.out.println("\n Nhap ma may Canon: ");
                    sd.nextLine();
                    maMay = sd.nextLine();
                    suaDSCanon(maMay);
                    break;
                case 2:
                    System.out.println("\nNhap ma may Canon");
                    sd.nextLine();
                    maMay = sd.nextLine();
                    xoaDSCanon(maMay);
                    break;
                case 3:
                    System.out.println("\n Nhap ma may Panasonic: ");
                    sd.nextLine();
                    maMay = sd.nextLine();
                    suaDSPanasonic(maMay);
                    break;
                case 4:
                    System.out.println("\nNhap ma may Panasonic");
                    sd.nextLine();
                    maMay = sd.nextLine();
                    xoaDSPanasonic(maMay);
            }
        } while (chon!=0);
    }
    public void menuChinh() {
        System.out.println("========================================================");
        System.out.println("           CHUONG TRINH QUAN LY KHO MAY ANH             ");
        System.out.println("========================================================");
        System.out.println("1. Nhap DS May Anh Panasonic                            ");
        System.out.println("2. Nhap DS May Anh Canon                                ");
        System.out.println("3. Hien DS May Anh Canon                                ");
        System.out.println("4. Hien DS May Anh Panasonic                            ");
        System.out.println("5. Chinh sua Thong tin (Canon, Panasonic)               ");
        System.out.println("6. Nhap Phieu nhap kho                                  ");
        System.out.println("7. Nhap Phieu xuat kho                                  ");
        System.out.println("8. Hien DS Phieu nhap kho                               ");
        System.out.println("9. Hien DS Phieu nhap kho                               ");
        System.out.println("10. Chinh sua Thong tin (Phieu nhap kho, Phieu xuat kho)");
        System.out.println("11. Luu file DS Phieu                                   ");
        System.out.println("12. Doc file DS Phieu                                   ");
        System.out.println("11. Luu file DS May Tinh                                ");
        System.out.println("12. Doc file DS Phieu                                   ");
        System.out.println("========================================================");
    }
    public void menuSuaDoiPhieu() {
        System.out.println("=============================================");
        System.out.println("        MENU THAY DOI THONG TIN PHIEU        ");
        System.out.println("=============================================");
        System.out.println("1. Sua Thong Tin Phieu Nhap Kho              ");
        System.out.println("2. Xoa Thong Tin Phieu Nhap Kho              ");
        System.out.println("3. Sua Thong Tin Phieu Xuat Kho              ");
        System.out.println("4. Xoa Thong Tin Phieu Xuat Kho              ");
        System.out.println("5. THOAT                                      ");
        System.out.println("=============================================");
    }
    public void SuaDoiPhieu()
    {
        Scanner sd = new Scanner(System.in);
        int chon;
        menuSuaDoiPhieu();
        do
        {
            System.out.print("\nVui Long Lua Chon: "); chon = sd.nextInt();
            switch (chon)
            {
                case 1:
                {
                    String maPhieu;
                    System.out.print("\nNhap Ma Phieu Nhap Kho: ");
                    sd.nextLine();
                    maPhieu = sd.nextLine();
                    suaPhieuNhapKho(maPhieu);
                } break;
                case 2:
                {
                    String maPhieu;
                    System.out.print("\nNhap Ma Phieu Nhap Kho: ");
                    sd.nextLine();
                    maPhieu = sd.nextLine();
                    xoaPhieuNhapKho(maPhieu);
                } break;
                case 3:
                {
                    String maPhieu;
                    System.out.print("\nNhap Ma Phieu Xuat Kho: ");
                    sd.nextLine();
                    maPhieu = sd.nextLine();
                    suaPhieuXuatKho(maPhieu);
                } break;
                case 4:
                {
                    String maPhieu;
                    System.out.print("\nNhap Ma Phieu Xuat Kho: ");
                    sd.nextLine();
                    maPhieu = sd.nextLine();
                    xoaPhieuXuatKho(maPhieu);
                } break;
            }
        } while(chon != 0);
    }
}