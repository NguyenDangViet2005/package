package Main;

import Object.DanhSachSV;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSV dssv = new DanhSachSV();
        int luachon;
        do{
            luachon = sc.nextInt();
            sc.nextLine();
            switch (luachon){
                case 1 :{
                    dssv.AddSV();
                    break;
                }
                case 2 :{
                    dssv.Xuat();
                    break;
                }
                case 3 :{
                    dssv.SapXep();
                    dssv.Xuat();
                }
                default:{

                }
            }
        }while(luachon!=0);


    }
}