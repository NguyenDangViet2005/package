package Object;

import java.util.ArrayList;

public class DanhSachSV {
    ArrayList<Sinhvien> ds = new ArrayList<>();
    public void AddSV(){
        Sinhvien s = new Sinhvien();
        s.Nhap();
        ds.add(s);
    }
    public void Xuat(){
        for(int i = 0; i < ds.size(); i++){
            ds.get(i).Xuat();
        }
    }
    public void SapXep(){
        for(int i = 0; i < ds.size() - 1; i++){
            if(ds.get(i).dtb < ds.get(i+1).dtb){
                Sinhvien svtg = ds.get(i);
                ds.set(i, ds.get(i+1));
                ds.set(i+1, svtg);
            }
        }
    }

}
