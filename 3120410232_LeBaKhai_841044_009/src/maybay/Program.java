package maybay;
import java.util.Scanner;
import java.util.Arrays;
import java.io.*;
public class Program {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        KhachHang[]kh=new KhachHang[10];
		QLDanhSachKhachHang ql=new QLDanhSachKhachHang(0,kh);
		ChuyenBay[]cb=new ChuyenBay[20];
		QLDSCHYENBAY qlcb=new QLDSCHYENBAY(0,cb);
		DatVe []dv=new DatVe[10];
		 QLDatVeMayBay book=new  QLDatVeMayBay(0,dv);
		do
		{
			System.out.println("\t\t\t\t ************************************************\t\t\t\t\t\t");
	System.out.println("\t\t\t\t *        QUAN LY BAN VE MAY BAY                *\t\t\t\t");
System.out.println("\t\t\t\t *        Moi Chon Giao Dich                    * \t\t\t\t");
 System.out.println("\t\t\t\t *        1. Dich Vu Khach Hang                 *  \t\t\t\t");
System.out.println("\t\t\t\t *        2. Xem Thong tin Chuyen Bay           *   \t\t\t\t");
System.out.println("\t\t\t\t *        3. Book va Thanh Toan Ve May Bay      *\t\t\t\t");
System.out.println("\t\t\t\t *        4. Thoat                              *\t\t\t\t");
		    System.out.println("\t\t\t\t ************************************************\t\t\t\t");
		    System.out.println("Moi Nhap lua Chon:");
		    int chon=Integer.parseInt(sc.nextLine());
		switch(chon)
		{
		
		case 1:
			ql.docfile();
	     ql.LaPDs(0, kh);
	     ql.ghifile();
	     break;
		case 2:
	     qlcb.SetList(0, cb);
			break;
		case 3:
			book.SetList(0, dv);
		break;
		case 4:
			System.out.println("See you again");
			break;
		
		}
	}while(true);
	}
}
