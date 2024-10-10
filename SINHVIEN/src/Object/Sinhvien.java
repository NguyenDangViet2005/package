package Object;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sinhvien {
    Scanner sc = new Scanner(System.in);
    String maSV;
    String name;
    String ngaySinh;
    double dtb;

    public void Nhap(){
        System.out.println("Nhập mã sinh viên:");
        maSV = sc.nextLine();
        System.out.println("Nhập tên sinh viên:");
        name = sc.nextLine();
        System.out.println("Nhập ngày sinh:");
        ngaySinh = sc.nextLine();
        System.out.println("Nhập điểm trung bình:");
        dtb = sc.nextDouble();
        while(dtb<0 || dtb > 10){
            System.out.println("Nhập lại điểm trung bình(0-10):");
            dtb = sc.nextDouble();
        }
    }
    public void Xuat(){
        System.out.println("Mã sinh viên: "+maSV + ", tên sinh viên: "+name+", ngày sinh: "+ngaySinh+", dtb: "+dtb);
    }

}
